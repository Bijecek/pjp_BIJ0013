import java.io.BufferedReader;
import java.io.Console;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Stack;

import static java.lang.System.exit;
import static java.lang.System.in;

public class VirtualMachine {
    private Stack<myStack> stack = new Stack<>();

    public static StackHelper stackHelper = new StackHelper();

    public static class myStack{
        primitives primitives;
        Object object;

        myStack(String primitives, Object object){
            this.primitives = calculatePrimitivesReverse(primitives);
            this.object = object;
        }
    }
    private List<String> code = new ArrayList<>();

    public enum primitives{
        INT,
        BOOL,
        STRING,
        FLOAT,
        OTHER
    }

    public static String calculatePrimitivesType(primitives type){
        switch (type) {
            case INT: return "I";
            case BOOL: return "B";
            case STRING: return "S";
            case FLOAT: return "F";
            default:
        }
        return "Other";
    }

    public static primitives calculatePrimitivesReverse(String type){
        switch (type) {
            case "I": return primitives.INT;
            case "F": return primitives.FLOAT;
            case "S": return primitives.STRING;
            case "B": return primitives.BOOL;
            default:
        }
        return primitives.OTHER;
    }

    public static Object calculateEmptyVariable(primitives primitives){
        switch (primitives){
            case INT -> {
                return 0;
            }
            case FLOAT -> {
                return 0.0;
            }
            case STRING -> {
                return "\"\"";
            }
            case BOOL -> {
                return false;
            }
        }
        return "ERROR";
    }


    public static String Push(primitives type, Object value){
        var primitivesType = calculatePrimitivesType(type);
        if(primitivesType.equals("Other")){
            return "PUSH "+value.toString()+"\n";
        }
        return "PUSH "+primitivesType+" "+value+"\n";
    }

    public static String Save(String whatSave){
        return "SAVE "+whatSave+"\n";
    }

    public static String Load(String whatLoad){ return "LOAD "+whatLoad+"\n";}

    public static String Pop(){ return "POP \n";}

    public static String Uminus(){
        return "UMINUS \n";
    }

    public static String Mul(){
        return "MUL \n";
    }
    public static String Add(){
        return "ADD \n";
    }
    public static String Div(){
        return "DIV \n";
    }
    public static String Sub(){
        return "SUB \n";
    }
    public static String Concat(){
        return "CONCAT \n";
    }
    public static String Mod(){
        return "MOD \n";
    }

    public static String Itof(){return "ITOF \n";}

    public static String Read(String whatRead){return "READ "+whatRead+"\n";}

    public static String Gt(){return "GT \n";}
    public static String Lt(){return "LT \n";}
    public static String Eq(){return "EQ \n";}

    public static String NotEq(){return "EQ \nNOT \n";}

    public static String And(){return "AND \n";}

    public static String Or(){return "OR \n";}

    public static String Not(){return "NOT \n";}

    public static String Fjump(int value){ return "FJMP "+value+"\n";}

    public static String Label(int value){ return "LABEL "+value+"\n";}

    public static String Jump(int value){ return "JMP "+value+"\n";}


    public static boolean needAutomaticConversion(ArrayList<String> result1){
        ArrayList<VirtualMachine.primitives> primitive = new ArrayList<>();
        for(var str : result1){
            var dataType = str.substring(5,6);
            primitive.add(VirtualMachine.calculatePrimitivesReverse(dataType));
        }
        if((primitive.get(0) == VirtualMachine.primitives.INT && primitive.get(1) == VirtualMachine.primitives.FLOAT)
                || (primitive.get(0) == VirtualMachine.primitives.FLOAT && primitive.get(1) == VirtualMachine.primitives.INT)){
            return true;
        }
        return false;
    }
    public static String doAutomaticConversion(ArrayList<String> result1){
        ArrayList<VirtualMachine.primitives> primitive = new ArrayList<>();
        for(var str : result1){
            var dataType = str.substring(5,6);
            primitive.add(VirtualMachine.calculatePrimitivesReverse(dataType));
        }
        if((primitive.get(0) == VirtualMachine.primitives.INT && primitive.get(1) == VirtualMachine.primitives.FLOAT)
                || (primitive.get(0) == VirtualMachine.primitives.FLOAT && primitive.get(1) == VirtualMachine.primitives.INT)){
            return VirtualMachine.Itof();
        }
        System.out.println("ERROR with doAutomaticConversion");
        exit(1);
        return "";
    }

    public static boolean needAutomaticConversionRelacni(ArrayList<String> result1, String operator){
        if(operator.equals("<") || operator.equals(">")){
            ArrayList<VirtualMachine.primitives> primitive = new ArrayList<>();
            for(var str : result1){
                var dataType = str.substring(5,6);
                if(VirtualMachine.calculatePrimitivesReverse(dataType) == primitives.OTHER){
                    var loadedVar = MyVisitor.visitorStackHelper.getVariable(str.substring(5).replaceAll("\n",""));
                    primitive.add(loadedVar.primitives);
                }
                else {
                    primitive.add(VirtualMachine.calculatePrimitivesReverse(dataType));
                }
            }
            if(!canBeCasted(primitive.get(0),primitive.get(1))){
                System.out.println("Cannot compare "+primitive.get(0)+" and "+primitive.get(1)+" (< >)");
                exit(1);
            }
            if((primitive.get(0) == VirtualMachine.primitives.INT && primitive.get(1) == VirtualMachine.primitives.FLOAT)
                    || (primitive.get(0) == VirtualMachine.primitives.FLOAT && primitive.get(1) == VirtualMachine.primitives.INT)){
                return true;
            }
            return false;
        }
        else if(operator.equals("==") || operator.equals("!=")){
            ArrayList<VirtualMachine.primitives> primitive = new ArrayList<>();
            for(var str : result1){
                var dataType = str.substring(5,6);
                primitive.add(VirtualMachine.calculatePrimitivesReverse(dataType));
            }
            if(!canBeCasted(primitive.get(0),primitive.get(1))){
                System.out.println("Cannot compare "+primitive.get(0)+" and "+primitive.get(1)+" (== !=)");
                exit(1);
            }
            return false;
        }
        else if(operator.equals("&&") || operator.equals("||")){
            ArrayList<VirtualMachine.primitives> primitive = new ArrayList<>();
            for(var str : result1){
                var dataType = str.substring(5,6);
                primitive.add(VirtualMachine.calculatePrimitivesReverse(dataType));
            }
            if(!primitive.get(0).equals(primitives.BOOL) || !primitive.get(1).equals(primitives.BOOL)){
                System.out.println("Cannot logic compare "+primitive.get(0)+" and "+primitive.get(1)+" (&& ||)");
                exit(1);
            }
        }
        return false;
    }


    public static boolean canBeCasted(primitives primitive1, primitives primitive2){
        if(primitive1.equals(primitive2)){
            return true;
        }
        else if(primitive1.equals(primitives.INT) && primitive2.equals(primitives.FLOAT)){
            return true;
        }
        else{
            return false;
        }
    }

    public static primitives canBeCasterReturn(primitives primitive1, primitives primitive2){
        if(primitive1.equals(primitive2)){
            return primitive1;
        }
        else if(primitive1.equals(primitives.INT) && primitive2.equals(primitives.FLOAT)){
            return primitive2;
        }
        else{
            System.out.println("ERROR conversion");
            exit(1);
            return primitives.OTHER;
        }
    }

    public VirtualMachine(String code)
    {
        this.code= List.of(code.split("\n"));
    }

    public void Run() throws IOException {
        if(code.size() == 0){
            System.out.println("No text to process!");
        }

        System.out.println("INSTRUKCE: ");
        for(var instruction : this.code){
            if(instruction.startsWith("ADD")){
                add();
            }
            else if(instruction.startsWith("SUB")){
                sub();
            }
            else if(instruction.startsWith("MUL")){
                mul();
            }
            else if(instruction.startsWith("DIV")){
                div();
            }
            else if(instruction.startsWith("MOD")){
                mod();
            }
            else if(instruction.startsWith("UMINUS")){
                uminus(instruction);

            }
            else if(instruction.startsWith("CONCAT")){
                concat();
            }
            else if(instruction.startsWith("AND")){
                and();
            }
            else if(instruction.startsWith("OR")){
                or();
            }
            else if (instruction.startsWith("GT")){
                gt();
            }
            else if(instruction.startsWith("LT")){
                lt();

            }
            else if(instruction.startsWith("EQ")){
                eq();
            }
            else if(instruction.startsWith("NOT")){
                not();
            }
            else if(instruction.startsWith("ITOF")){
                itof();
            }
            else if(instruction.startsWith("PUSH")){
                push(instruction);
            }
            else if(instruction.startsWith("POP")){
                pop();
            }
            else if(instruction.startsWith("LOAD")){
                load(instruction);
            }
            else if(instruction.startsWith("SAVE")){
                save(instruction);
            }
            else if(instruction.startsWith("LABEL")){

            }
            else if(instruction.startsWith("JMP")){

            }
            else if(instruction.startsWith("FJMP")){

            }
            else if(instruction.startsWith("PRINT")){
                print(instruction);
            }
            else if(instruction.startsWith("READ")){
                read(instruction);
            }
        }
        /*
        System.out.println("STACK:");
        for(var i : stack){
            System.out.println(i.primitives.toString() + " " +i.object.toString());
        }
        System.out.println("STACKHELPER:");
        for(var i : stackHelper.stackHelper.entrySet()){
            System.out.println(i.getKey()+" "+ i.getValue().object.toString() +" "+ i.getValue().primitives.toString());
        }

         */
    }

    private void push(String instruction){
        var instr = instruction.substring(5,instruction.length());
        var dateType = instr.substring(0,1);
        instr = instruction.substring(7,instruction.length());
        stack.push(new myStack(dateType,instr));
    }

    private void push(myStack mystack){
        stack.push(mystack);
    }

    private void load(String instruction){
        var instr = instruction.substring(5,instruction.length());

        var value = stackHelper.getVariable(instr);
        stack.push(new myStack(calculatePrimitivesType(value.primitives),value.object));
    }

    private myStack pop(){
        return stack.pop();
    }

    private void save(String instruction){
        var instr = instruction.substring(5,instruction.length());
        var temp = stack.lastElement();
        if(!stackHelper.stackHelper.containsKey(instr)){
            stackHelper.addVariable(temp, instr);
        }
        else{
            stackHelper.setVariable(instr,temp);
        }
    }
    private void print(String instruction){
        ArrayList<myStack> printedList = new ArrayList<>();
        var number = instruction.substring(6);
        for(int i = 0; i < Integer.parseInt(number); i++){
            printedList.add(pop());
        }
        Collections.reverse(printedList);
        for(var item : printedList){
            System.out.println(item.primitives + " "+ item.object);
        }
    }

    private void uminus(String instruction){
        var popped = stack.pop();
        popped.object= "-"+popped.object;
        push(popped);
    }

    private void add(){
        var popped1 = pop();
        var popped2 = pop();

        var returnType = VirtualMachine.canBeCasterReturn(popped1.primitives, popped2.primitives);
        var value = Calculator.calculate(popped2,popped1, Calculator.pocty.ADD);

        push(new myStack(returnType.toString().substring(0,1),value));

    }
    private void sub(){
        var popped1 = pop();
        var popped2 = pop();

        var returnType = VirtualMachine.canBeCasterReturn(popped1.primitives, popped2.primitives);
        var value = Calculator.calculate(popped2,popped1, Calculator.pocty.SUB);

        push(new myStack(returnType.toString().substring(0,1),value));

    }
    private void mul(){
        var popped1 = pop();
        var popped2 = pop();

        var returnType = VirtualMachine.canBeCasterReturn(popped1.primitives, popped2.primitives);
        var value = Calculator.calculate(popped2,popped1, Calculator.pocty.MUL);

        push(new myStack(returnType.toString().substring(0,1),value));

    }
    private void div(){
        var popped1 = pop();
        var popped2 = pop();

        var returnType = VirtualMachine.canBeCasterReturn(popped1.primitives, popped2.primitives);
        var value = Calculator.calculate(popped2,popped1, Calculator.pocty.DIV);

        push(new myStack(returnType.toString().substring(0,1),value));

    }
    private void mod(){
        var popped1 = pop();
        var popped2 = pop();

        var returnType = VirtualMachine.canBeCasterReturn(popped1.primitives, popped2.primitives);
        var value = Calculator.calculate(popped2,popped1, Calculator.pocty.MOD);

        push(new myStack(returnType.toString().substring(0,1),value));

    }

    private void concat(){
        var popped1 = pop();
        var popped2 = pop();

        var result = Calculator.concat(popped2,popped1);
        push(new VirtualMachine.myStack(popped1.primitives.toString().substring(0,1),result));
    }

    private void itof(){
        var popped1 = pop();
        if(popped1.primitives.equals(primitives.INT)){
            push(new VirtualMachine.myStack(primitives.FLOAT.toString().substring(0,1),popped1.object));
        }
    }

    private void read(String instruction) throws IOException {
        var instr = instruction.substring(5,instruction.length());
        var dateType = instr.substring(0,1);

        var primitive = VirtualMachine.calculatePrimitivesReverse(dateType);

        BufferedReader reader = new BufferedReader(
                new InputStreamReader(System.in));
        var value = reader.readLine();

        //Dodelat kontrolu na datove typy
        switch (primitive){
            case INT -> push(new VirtualMachine.myStack(primitives.INT.toString().substring(0,1),value));
            case FLOAT -> push(new VirtualMachine.myStack(primitives.FLOAT.toString().substring(0,1),value));
            case STRING -> push(new VirtualMachine.myStack(primitives.STRING.toString().substring(0,1),value));
            case BOOL -> push(new VirtualMachine.myStack(primitives.BOOL.toString().substring(0,1),value));
        }
    }
    private void lt(){
        var popped1 = pop();
        var popped2 = pop();
        var result = Calculator.calculateRelationals(popped2,popped1, Calculator.porovnani.LT);
        push(new VirtualMachine.myStack(primitives.BOOL.toString().substring(0,1),result));
    }
    private void gt(){
        var popped1= pop();
        var popped2 = pop();
        var result = Calculator.calculateRelationals(popped2,popped1, Calculator.porovnani.GT);
        push(new VirtualMachine.myStack(primitives.BOOL.toString().substring(0,1),result));

    }

    private void eq(){
        var popped1= pop();
        var popped2 = pop();
        var result = Calculator.calculateRelationals(popped2,popped1, Calculator.porovnani.EQ);
        push(new VirtualMachine.myStack(primitives.BOOL.toString().substring(0,1),result));
    }

    private void not(){
        var popped1= pop();

        boolean result=false;
        if(popped1.object.toString().equals("true")){
            result = false;
        }
        else if(popped1.object.toString().equals("false")){
            result = true;
        }
        push(new VirtualMachine.myStack(primitives.BOOL.toString().substring(0,1),result));
    }

    private void and(){
        var popped1= pop();
        var popped2 = pop();
        var result = Calculator.calculateLogical(popped1,popped2, Calculator.logicke.AND);

        push(new VirtualMachine.myStack(primitives.BOOL.toString().substring(0,1),result));
    }
    private void or(){
        var popped1= pop();
        var popped2 = pop();
        var result = Calculator.calculateLogical(popped1,popped2, Calculator.logicke.OR);

        push(new VirtualMachine.myStack(primitives.BOOL.toString().substring(0,1),result));
    }


}
