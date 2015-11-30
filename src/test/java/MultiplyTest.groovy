import operations.Multiply

/**
 * Created by Asia on 2015-11-30.
 */
class MultiplyTest extends spock.lang.Specification {

    def multiply;

    def setup(){
        multiply = new Multiply()
    }
    def "Claculate multiply with positive int"() {
        expect:
            12 == multiply.claculate(3,4)
    }

    def "Calculate multiply with negative int"(){
        expect:
            -12 == multiply.claculate(-3,4)
    }

}
