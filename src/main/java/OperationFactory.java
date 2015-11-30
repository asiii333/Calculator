import operations.*;
import sun.reflect.generics.reflectiveObjects.NotImplementedException;

/**
 * Created by Asia on 2015-11-30.
 */
public class OperationFactory {
    private static OperationFactory instance = null;
    private OperationFactory(){}

    public Operation getOperation(OperationType type) {
        switch(type){
            case ADD: return new Add();
            case MULTIPLY: return new Multiply();
            case DIVIDE: return new Divide();
            case SUBTRACT: return new Subtract();
            default: throw new NotImplementedException();
        }
    }

    public static OperationFactory getInstantiate (){
        if(instance == null){
            instance = new OperationFactory();
        }
        return instance;
    }
}
