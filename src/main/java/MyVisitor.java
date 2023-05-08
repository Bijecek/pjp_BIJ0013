import javax.lang.model.type.PrimitiveType;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import static java.lang.System.exit;

public class MyVisitor extends GrammarBaseVisitor{
    ArrayList<String> operators = new ArrayList<>();

    static StackHelper visitorStackHelper = new StackHelper();

    List<Integer> labels = new ArrayList<>();

    boolean operatorPriority = false;

    boolean plusMinusPred = false;
    @Override
    public Object visitVisiterNazev(GrammarParser.VisiterNazevContext ctx) {
        var value = ctx.STRINGSPECIAL().getText();
        return VirtualMachine.Push(VirtualMachine.primitives.STRING,value);
    }

    @Override
    public Object visitVisiterPrvniCast(GrammarParser.VisiterPrvniCastContext ctx) {
        var value = ctx.STRINGFIRSTPART().getText();
        return VirtualMachine.Push(VirtualMachine.primitives.STRING,value);
    }

    @Override
    public Object visitVisiterInt(GrammarParser.VisiterIntContext ctx) {
        var value = Integer.parseInt(ctx.INT().getText());
        return VirtualMachine.Push(VirtualMachine.primitives.INT,value);
    }

    @Override
    public Object visitVisiterString(GrammarParser.VisiterStringContext ctx) {
        var value = ctx.STRING().getText();
        return VirtualMachine.Push(VirtualMachine.primitives.STRING,value);
    }

    @Override
    public Object visitVisiterBoolean(GrammarParser.VisiterBooleanContext ctx) {
        var value = Boolean.parseBoolean(ctx.BOOLEAN().getText());
        return VirtualMachine.Push(VirtualMachine.primitives.BOOL,value);
    }

    @Override
    public Object visitVisiterFloat(GrammarParser.VisiterFloatContext ctx) {
        var value = Float.parseFloat(ctx.FLOAT().getText());
        return VirtualMachine.Push(VirtualMachine.primitives.FLOAT,value);
    }

    @Override
    public Object visitVisiterPromenna(GrammarParser.VisiterPromennaContext ctx) {
        var value = ctx.VARIABLE().getText();
        return VirtualMachine.Load(value);
    }



    @Override
    public Object visitWriteVisitor(GrammarParser.WriteVisitorContext ctx) {
        StringBuilder sb = new StringBuilder();
        int numberOfCodes = 0;

        int lines = 0;
        for (var expr : ctx.expression())
        {
            var code = visit(expr);

            sb.append(code);

            /*
            if(lines >= 1){
                if(!operators.isEmpty()){
                    //Collections.reverse(operators);
                    for(var oper : operators){
                        switch (oper){
                            case "+" -> sb.append(VirtualMachine.Add());
                            case "-" -> sb.append(VirtualMachine.Sub());
                            case "*" -> sb.append(VirtualMachine.Mul());
                            case "/" -> sb.append(VirtualMachine.Div());
                            case "%" -> sb.append(VirtualMachine.Mod());
                            case "." -> sb.append(VirtualMachine.Concat());
                        }
                    }
                    operators = new ArrayList<>();
                }

            }*/

            lines++;
            //numberOfCodes += code.toString().split("\n").length;
        }
        sb.append("PRINT "+lines+"\n");
        return sb.toString();
    }

    @Override
    public Object visitReadVisitor(GrammarParser.ReadVisitorContext ctx) {
        StringBuilder sb = new StringBuilder();
        for(var temp : ctx.VARIABLE()){
            var variable = temp.getText();
            if(visitorStackHelper.stackHelper.containsKey(variable)){
                var tempVariable = visitorStackHelper.getVariable(variable);
                sb.append(VirtualMachine.Read(VirtualMachine.calculatePrimitivesType(tempVariable.primitives)));
                sb.append(VirtualMachine.Save(variable));
            }
            else{
                System.out.println("ERROR reading variable");
                exit(1);
            }
        }
        return sb.toString();
    }

    @Override
    public Object visitVisitPromennaFloat(GrammarParser.VisitPromennaFloatContext ctx) {
        return "FLOAT";
    }

    @Override
    public Object visitVisitPromennaInt(GrammarParser.VisitPromennaIntContext ctx) {
        return "INT";
    }

    @Override
    public Object visitVisitPromennaBoolean(GrammarParser.VisitPromennaBooleanContext ctx) {
        return "BOOLEAN";
    }

    @Override
    public Object visitVisitPromennaString(GrammarParser.VisitPromennaStringContext ctx) {
        return "STRING";
    }
    @Override
    public Object visitVisiterSubExpr(GrammarParser.VisiterSubExprContext ctx) {
        return visit(ctx.datovyTyp());
    }

    @Override
    public Object visitDeklaracePromenne(GrammarParser.DeklaracePromenneContext ctx) {
        StringBuilder sb = new StringBuilder();
        var datovyTyp = ctx.DATOVY_TYP().getText();
        for(var var : ctx.VARIABLE()){
            var promenna = var.getText();
            var premenenyDatovyTyp = VirtualMachine.primitives.valueOf(datovyTyp.toUpperCase());

            Object hodnotaPrirazeni;
            if(ctx.datovyTyp().isEmpty()){
                hodnotaPrirazeni= VirtualMachine.calculateEmptyVariable(premenenyDatovyTyp);
            }
            else{
                hodnotaPrirazeni=ctx.datovyTyp().get(0).getText();
            }
            visitorStackHelper.addVariable(new VirtualMachine.myStack(String.valueOf(datovyTyp.charAt(0)).toUpperCase(),hodnotaPrirazeni),promenna);
            sb.append(VirtualMachine.Push(premenenyDatovyTyp,hodnotaPrirazeni) + VirtualMachine.Save(promenna));
        }
        return sb.toString();
        /*
        var promenna = ctx.VARIABLE().get(0).getText();
        var premenenyDatovyTyp = VirtualMachine.primitives.valueOf(datovyTyp.toUpperCase());

        Object hodnotaPrirazeni;
        if(ctx.datovyTyp().isEmpty()){
            hodnotaPrirazeni= VirtualMachine.calculateEmptyVariable(premenenyDatovyTyp);
        }
        else{
            hodnotaPrirazeni=ctx.datovyTyp().get(0).getText();
        }
        visitorStackHelper.addVariable(new VirtualMachine.myStack(String.valueOf(datovyTyp.charAt(0)).toUpperCase(),hodnotaPrirazeni),promenna);
        return VirtualMachine.Push(premenenyDatovyTyp,hodnotaPrirazeni) + VirtualMachine.Save(promenna);

         */
    }

    @Override
    public Object visitInicializacePromenne(GrammarParser.InicializacePromenneContext ctx) {
        boolean addItof=false;
        boolean first=true;
        StringBuilder sb = new StringBuilder();
        var datovyTyp = visit(ctx.datovyTyp().get(0)).toString();
        if (datovyTyp.equals("BOOLEAN")){
            datovyTyp = "BOOL";
        }
        for(int i=ctx.VARIABLE().size();i!=0;i--){
            var promenna = ctx.VARIABLE().get(i-1).getText();

            if(visitorStackHelper.stackHelper.containsKey(promenna)){
                var promennaStack = visitorStackHelper.getVariable(promenna);
                if(VirtualMachine.canBeCasted(VirtualMachine.calculatePrimitivesReverse(String.valueOf(datovyTyp.charAt(0))),promennaStack.primitives)){
                    if(VirtualMachine.primitives.valueOf(datovyTyp).equals(VirtualMachine.primitives.INT) &&
                            promennaStack.primitives.equals(VirtualMachine.primitives.FLOAT)){
                        addItof = true;
                    }
                }
                else{
                    System.out.println("Could not cast "+VirtualMachine.calculatePrimitivesReverse(String.valueOf(datovyTyp.charAt(0)))+" to "+promennaStack.primitives);
                    exit(1);
                    return "";
                }


            }
            else{
                System.out.println("Stack does not containt this variable");
                exit(1);
                return "";
            }

            if(i!=1){
                //sb.append(VirtualMachine.Load(promenna));
            }

            boolean minusOperator=false;
            var hodnota = ctx.datovyTyp().get(0).getText();
            if(hodnota.startsWith("-")){
                hodnota = hodnota.substring(1);
                minusOperator=true;
            }
            //ODkomentovat

            String op;
            if(ctx.op != null) {
                op = ctx.op.getText();
            }
            else{
                op="NOTHING";
            }



            if(first){
                sb.append(VirtualMachine.Push(VirtualMachine.primitives.valueOf(datovyTyp),hodnota));
                first=false;
            }
            //if(i==1)
            if(true) {
                if (minusOperator) {
                    sb.append(VirtualMachine.Uminus() + VirtualMachine.Save(promenna) + VirtualMachine.Load(promenna));
                } else if (addItof) {
                    sb.append(VirtualMachine.Itof() + VirtualMachine.Save(promenna) + VirtualMachine.Load(promenna));
                } else {
                    switch (op) {
                        case "+": {
                            sb.append(VirtualMachine.Add());
                            break;
                        }
                        case "-": {
                            sb.append(VirtualMachine.Sub());
                            break;
                        }
                        case "*": {
                            sb.append(VirtualMachine.Mul());
                            break;
                        }
                        case "/": {
                            sb.append(VirtualMachine.Div());
                            break;
                        }
                    }
                    sb.append(VirtualMachine.Save(promenna) + VirtualMachine.Load(promenna));
                }
            }



        }
        return sb.append(VirtualMachine.Pop()).toString();
    }

    @Override
    public Object visitVisiterPlusMinusSpojeni(GrammarParser.VisiterPlusMinusSpojeniContext ctx) {
        ArrayList<String> result1 = new ArrayList<>();
        StringBuilder sb = new StringBuilder();
        for(var code : ctx.expression()){
            var result = visit(code);
            sb.append(result);
            result1.add((String) result);
        }
        if(VirtualMachine.needAutomaticConversion(result1)){
            sb.append(VirtualMachine.doAutomaticConversion(result1));
        }
        var op = ctx.op.getText();

        switch (op) {
            case "+": {
                sb.append(VirtualMachine.Add());
                return sb.toString();
            }
            case "-": {
                sb.append(VirtualMachine.Sub());
                return sb.toString();
            }
            case ".": {
                sb.append(VirtualMachine.Concat());
                return sb.toString();
            }
        }

        System.out.println("Error");
        exit(1);
        return null;
    }

    @Override
    public Object visitVisiterKratDelenoModulo(GrammarParser.VisiterKratDelenoModuloContext ctx) {
        ArrayList<String> result1 = new ArrayList<>();
        StringBuilder sb = new StringBuilder();
        for(var code : ctx.expression()){
            var result = visit(code);
            sb.append(result);
            result1.add((String) result);
        }
        if(VirtualMachine.needAutomaticConversion(result1)){
            sb.append(VirtualMachine.doAutomaticConversion(result1));
        }
        var op = ctx.op.getText();
        boolean plus=false,minus=false,concat=false;
        if(sb.toString().contains("ADD \n")){
            sb = new StringBuilder(sb.toString().replace("ADD \n", ""));
            plus=true;
        }
        if(sb.toString().contains("DIV \n")){
            sb = new StringBuilder(sb.toString().replace("DIV \n", ""));
            minus=true;
        }
        if(sb.toString().contains("CONCAT \n")){
            sb = new StringBuilder(sb.toString().replace("CONCAT \n", ""));
            concat=true;
        }
        switch (op){
            case "*": {
                sb.append(VirtualMachine.Mul());
                break;
            }
            case "/":{
                sb.append(VirtualMachine.Div());
                break;
            }
            case "%":{
                sb.append(VirtualMachine.Mod());
                break;
            }
        }
        if(plus){
            sb.append(VirtualMachine.Add());
            plus=false;
        }
        if(minus){
            sb.append(VirtualMachine.Sub());
            minus=false;
        }
        if(concat){
            sb.append(VirtualMachine.Concat());
            concat=false;
        }

        return sb.toString();

    }

    @Override
    public Object visitVisitRelacniOperatory(GrammarParser.VisitRelacniOperatoryContext ctx) {
        ArrayList<String> result1 = new ArrayList<>();

        StringBuilder sb = new StringBuilder();
        var first = ctx.expression().get(0);
        var resultFirst = visit(first);
        sb.append(resultFirst);
        var second = ctx.expression().get(1);
        var resultSecond =visit(second);
        //sb.append(resultSecond);

        result1.add(String.valueOf(resultFirst));
        result1.add(String.valueOf(resultSecond));


        var operator = ctx.RELACNI_OPERATORY_POROVNANI().getText();

        if(VirtualMachine.needAutomaticConversionRelacni(result1,operator)){
            sb.append(VirtualMachine.doAutomaticConversion(result1));
        }
        sb.append(resultSecond);

        //NOT SURE
        boolean eq=false,noteq=false;
        if(sb.toString().contains("EQ \nNOT \n")){
            sb = new StringBuilder(sb.toString().replace("EQ \nNOT \n", ""));
            noteq=true;
        }
        if(sb.toString().contains("EQ \n")){
            sb = new StringBuilder(sb.toString().replace("EQ \n", ""));
            eq=true;
        }
        //NOT SURE
        switch (operator){
            case "<": {
                sb.append(VirtualMachine.Lt());
                break;
            }
            case ">": {
                sb.append(VirtualMachine.Gt());
                break;
            }
            case "==": {
                sb.append(VirtualMachine.Eq());
                break;
            }
            case "!=": {
                sb.append(VirtualMachine.NotEq());
                break;
            }
        }
        if(eq){
            sb.append(VirtualMachine.Eq());
            eq=false;
        }
        if(noteq){
            sb.append(VirtualMachine.NotEq());
            noteq=false;
        }
        return sb.toString();
    }

    @Override
    public Object visitVisitAndOr(GrammarParser.VisitAndOrContext ctx) {
        ArrayList<String> result1 = new ArrayList<>();

        StringBuilder sb = new StringBuilder();
        var first = ctx.expression().get(0);
        var resultFirst = visit(first);
        sb.append(resultFirst);
        var second = ctx.expression().get(1);
        var resultSecond =visit(second);
        sb.append(resultSecond);

        result1.add(String.valueOf(resultFirst));
        result1.add(String.valueOf(resultSecond));


        var operator = ctx.LOGICKEANDOR().getText();

        VirtualMachine.needAutomaticConversionRelacni(result1,operator);

        switch (operator){
            case "&&": {
                if(sb.toString().contains("OR \n")){
                    sb = new StringBuilder(sb.toString().replace("OR \n", ""));
                    sb.append(VirtualMachine.And());
                    sb.append(VirtualMachine.Or());
                }
                else {
                    sb.append(VirtualMachine.And());
                }
                break;
            }
            case "||": {
                sb.append(VirtualMachine.Or());
                break;
            }
        }
        return sb.toString();
    }

    @Override
    public Object visitVisitLogickeNot(GrammarParser.VisitLogickeNotContext ctx) {
        StringBuilder sb = new StringBuilder();

        var code = visit(ctx.expression());
        sb.append(code);
        sb.append(VirtualMachine.Not());

        return sb.toString();
    }

    @Override
    public Object visitVisitZavorky(GrammarParser.VisitZavorkyContext ctx) {
        StringBuilder sb = new StringBuilder();

        var code = visit(ctx.expression());
        sb.append(code);

        return sb.toString();
    }

    @Override
    public Object visitVisiterPromenne(GrammarParser.VisiterPromenneContext ctx) {
        StringBuilder sb = new StringBuilder();

        var code = visit(ctx.promenne());
        sb.append(code);

        return sb.toString();
    }

    @Override
    public Object visitIfVisitor(GrammarParser.IfVisitorContext ctx) {
        StringBuilder sb = new StringBuilder();

        var code = visit(ctx.expression());
        sb.append(code);

        int label;

        if(!labels.isEmpty()) {
            label = labels.get(labels.size() - 1) + 1;
        }
        else{
            label = 0;
        }

        sb.append(VirtualMachine.Fjump(label));

        boolean first = true;
        for(var code1 : ctx.firstRule()){
            sb.append(visit(code1));
            if(first) {
                sb.append(VirtualMachine.Jump(label + 1));
                first=false;
                sb.append(VirtualMachine.Label(label));
                label++;
            }
            else{
                sb.append(VirtualMachine.Label(label));
            }
        }
        labels.add(label);


        return sb.toString();
    }

    @Override
    public Object visitBlockVisitor(GrammarParser.BlockVisitorContext ctx) {
        StringBuilder sb = new StringBuilder();

        var code = visit(ctx.expression());
        sb.append(code);

        int label;

        if(!labels.isEmpty()) {
            label = labels.get(labels.size() - 1) + 1;
        }
        else{
            label = 0;
        }

        sb.append(VirtualMachine.Fjump(label));

        boolean first = true;
        int rows=0;
        for(var code1 : ctx.firstRule()){
            sb.append(visit(code1));
            rows++;
        }
        if(first) {
            sb.append(VirtualMachine.Jump(label + 1));
            first=false;
        }
        for(int i=0;i<rows-1;i++){
            sb.append(VirtualMachine.Label(label));
            labels.add(label);
            label++;
        }


        return sb.toString();
    }

    @Override
    public Object visitProg(GrammarParser.ProgContext ctx) {
        StringBuilder sb = new StringBuilder();
        for (var expr : ctx.stat())
        {
            var code = visit(expr);
            if(code != null && !code.equals("COMMENT")) {
                sb.append(code);
            }

        }
        return sb.toString();
    }

    @Override
    public Object visitVisitComment(GrammarParser.VisitCommentContext ctx) {
        return "COMMENT";
    }
}
