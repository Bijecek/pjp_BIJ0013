import static java.lang.System.exit;
import static org.apache.commons.lang3.compare.ComparableUtils.is;
public class Calculator {

    public enum pocty {
        ADD,
        SUB,
        MUL,
        DIV,
        MOD
    }

    public enum porovnani {
        LT,
        GT,
        EQ
    }

    public enum logicke {
        AND,
        OR
    }


    public static Object calculate(VirtualMachine.myStack popped1, VirtualMachine.myStack popped2, pocty p) {
        var primitiveType = VirtualMachine.canBeCasterReturn(popped2.primitives, popped1.primitives);
        if (primitiveType.equals(VirtualMachine.primitives.INT)) {
            switch (p) {
                case ADD -> {
                    return Integer.parseInt(popped1.object.toString()) + Integer.parseInt(popped2.object.toString());
                }
                case SUB -> {
                    return Integer.parseInt(popped1.object.toString()) - Integer.parseInt(popped2.object.toString());
                }
                case MUL -> {
                    return Integer.parseInt(popped1.object.toString()) * Integer.parseInt(popped2.object.toString());
                }
                case DIV -> {
                    return Integer.parseInt(popped1.object.toString()) / Integer.parseInt(popped2.object.toString());
                }
                case MOD -> {
                    return Integer.parseInt(popped1.object.toString()) % Integer.parseInt(popped2.object.toString());
                }
            }
        } else if (primitiveType.equals(VirtualMachine.primitives.FLOAT)) {
            switch (p) {
                case ADD -> {
                    return Float.parseFloat(popped1.object.toString()) + Float.parseFloat(popped2.object.toString());
                }
                case SUB -> {
                    return Float.parseFloat(popped1.object.toString()) - Float.parseFloat(popped2.object.toString());
                }
                case MUL -> {
                    return Float.parseFloat(popped1.object.toString()) * Float.parseFloat(popped2.object.toString());
                }
                case DIV -> {
                    return Float.parseFloat(popped1.object.toString()) / Float.parseFloat(popped2.object.toString());
                }
                case MOD -> {
                    return Float.parseFloat(popped1.object.toString()) % Float.parseFloat(popped2.object.toString());
                }
            }
        }
        MyVisitor.sb_Errors.append("Unable to calculate "+p.toString()+" (calculate)\n");
        return null;
    }

    public static Object concat(VirtualMachine.myStack popped1, VirtualMachine.myStack popped2) {
        if (popped1.primitives.equals(VirtualMachine.primitives.STRING) && popped1.primitives.equals(popped2.primitives)) {
            var calculatedResult = popped1.object.toString() + popped2.object.toString();
            calculatedResult = calculatedResult.replaceAll("\"", "");
            calculatedResult = "\"" + calculatedResult + "\"";
            return calculatedResult;
        } else {
            MyVisitor.sb_Errors.append("Unable to concat "+popped1.primitives.toString()+" and "+popped2.primitives.toString()+"(concat)\n");
            return null;
        }
    }

    public static boolean calculateRelationals(VirtualMachine.myStack popped1, VirtualMachine.myStack popped2, porovnani p) {
        switch (p) {
            case GT -> {
                if ((popped1.primitives.equals(VirtualMachine.primitives.INT) || popped1.primitives.equals(VirtualMachine.primitives.FLOAT)) &&
                        popped2.primitives.equals(VirtualMachine.primitives.INT) || popped2.primitives.equals(VirtualMachine.primitives.FLOAT)) {
                    return Float.parseFloat(popped1.object.toString()) > Float.parseFloat(popped2.object.toString());
                } else {
                    MyVisitor.sb_Errors.append("Relational operators error "+p.toString()+" not aplicable to "+popped1.primitives.toString()+" "+popped2.primitives.toString()+"(calculateRelationals)\n");
                }
            }
            case LT -> {
                if ((popped1.primitives.equals(VirtualMachine.primitives.INT) || popped1.primitives.equals(VirtualMachine.primitives.FLOAT)) &&
                        popped2.primitives.equals(VirtualMachine.primitives.INT) || popped2.primitives.equals(VirtualMachine.primitives.FLOAT)) {
                    return Float.parseFloat(popped1.object.toString()) < Float.parseFloat(popped2.object.toString());
                } else {
                    MyVisitor.sb_Errors.append("Relational operators error "+p.toString()+" not aplicable to "+popped1.primitives.toString()+" "+popped2.primitives.toString()+"(calculateRelationals)\n");
                }
            }
            case EQ -> {
                if ((popped1.primitives.equals(VirtualMachine.primitives.INT) || popped1.primitives.equals(VirtualMachine.primitives.FLOAT) || popped1.primitives.equals(VirtualMachine.primitives.STRING)) &&
                        popped2.primitives.equals(VirtualMachine.primitives.INT) || popped2.primitives.equals(VirtualMachine.primitives.FLOAT) || popped2.primitives.equals(VirtualMachine.primitives.STRING)) {
                    return popped1.object.toString().equals(popped2.object.toString());
                } else {
                    MyVisitor.sb_Errors.append("Relational operators error "+p.toString()+" not aplicable to "+popped1.primitives.toString()+" "+popped2.primitives.toString()+"(calculateRelationals)\n");
                }
            }
        }
        return false;
    }

    public static boolean calculateLogical(VirtualMachine.myStack popped1, VirtualMachine.myStack popped2, logicke p) {
        switch (p) {
            case AND -> {
                if (popped1.primitives.equals(VirtualMachine.primitives.BOOL) && popped2.primitives.equals(VirtualMachine.primitives.BOOL)) {
                    if(popped1.object.toString().equals("false") || popped2.object.toString().equals("false")){
                        return false;
                    }
                    return true;
                } else {
                    MyVisitor.sb_Errors.append("Logical operators error "+p.toString()+" not aplicable to "+popped1.primitives.toString()+" "+popped2.primitives.toString()+"(calculateLogical)\n");
                }
            }
            case OR -> {
                if (popped1.primitives.equals(VirtualMachine.primitives.BOOL) && popped2.primitives.equals(VirtualMachine.primitives.BOOL)) {
                    if(popped1.object.toString().equals("true") || popped2.object.toString().equals("true")){
                        return true;
                    }
                    return false;
                } else {
                    MyVisitor.sb_Errors.append("Logical operators error "+p.toString()+" not aplicable to "+popped1.primitives.toString()+" "+popped2.primitives.toString()+"(calculateLogical)\n");

                }
            }
        }
        return false;
    }
}
