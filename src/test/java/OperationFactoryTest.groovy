import operations.Add
import operations.Divide
import operations.Multiply
import operations.Subtract
import spock.lang.Specification
import sun.reflect.generics.reflectiveObjects.NotImplementedException

import static OperationType.*

/**
 * Created by Asia on 2015-11-30.
 */
class OperationFactoryTest extends Specification {
    //def OperationFactory opFact
    def opFactory
    def opFactory2

    void setup() {
        opFactory = OperationFactory.getInstantiate();
        opFactory2 = OperationFactory.getInstantiate();
    }

    def "getInstnce return OperationFactory"(){
        expect:
            opFactory instanceof OperationFactory
            opFactory2 instanceof OperationFactory
    }

    def "factory is singleton"(){
        expect:
            opFactory2 == opFactory
    }

    def "GetOperation return proper implemented opertions"() {
        expect:
            opFactory.getOperation(ADD) instanceof Add
            opFactory.getOperation(MULTIPLY) instanceof Multiply
            opFactory.getOperation(DIVIDE) instanceof Divide
            opFactory.getOperation(SUBTRACT) instanceof Subtract
    }
    def "GetOperation behavior for not implemented operation "(){
        when:
            opFactory.getOperation(POWER)
        then:
            thrown NotImplementedException
    }
}
