import java.util.HashMap;
import java.util.Map;

import static java.lang.System.exit;

public class StackHelper {
    Map<String, VirtualMachine.myStack> stackHelper = new HashMap<>();

    public void addVariable(VirtualMachine.myStack stack, Object value){
        if(stackHelper.containsKey(value)){
            System.out.println("This variable is already in stack");
            exit(1);
        }

        /*
            switch (stack.primitives) {
                case INT ->
                        stackHelper.put((String) value, new VirtualMachine.myStack(stack.primitives.toString().toUpperCase(), 0));
                case FLOAT ->
                        stackHelper.put((String) value, new VirtualMachine.myStack(stack.primitives.toString().toUpperCase(), 0.0));
                case BOOL ->
                        stackHelper.put((String) value, new VirtualMachine.myStack(stack.primitives.toString().toUpperCase(), false));
                case STRING ->
                        stackHelper.put((String) value, new VirtualMachine.myStack(stack.primitives.toString().toUpperCase(), ""));
            }

         */
        stackHelper.put((String) value,stack);

    }

    public VirtualMachine.myStack getVariable(String id){
        if(stackHelper.containsKey(id)){
            return stackHelper.get(id);
        }
        else {
            System.out.println("This variable does not exists in stack");
            exit(1);
        }
        return null;
    }

    public void setVariable(String id, VirtualMachine.myStack stack){
        stackHelper.replace(id,stack);
    }
}
