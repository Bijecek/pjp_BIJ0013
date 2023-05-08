import java.util.HashMap;
import java.util.Map;

import static java.lang.System.exit;

public class StackHelper {
    Map<String, VirtualMachine.myStack> stackHelper = new HashMap<>();

    public void addVariable(VirtualMachine.myStack stack, Object value){
        if(stackHelper.containsKey(value)){
            MyVisitor.sb_Errors.append("Variable "+value+" is already declared\n");
        }

        stackHelper.put((String) value,stack);

    }

    public VirtualMachine.myStack getVariable(String id){
        if(stackHelper.containsKey(id)){
            return stackHelper.get(id);
        }
        else {
            MyVisitor.sb_Errors.append("Variable "+id+"does not exists\n");
        }
        return null;
    }

    public void setVariable(String id, VirtualMachine.myStack stack){
        stackHelper.replace(id,stack);
    }
}
