import operations.Divide
import spock.lang.Specification

/**
 * Created by Asia on 2015-11-30.
 */
class DivideTest extends Specification {

    def operation;

    def setup(){
        operation = new Divide();
    }
    def "Claculate divi int, dzielenie calkowite"() {
        expect:
            2 == operation.claculate(10,5)
    }

    def "Calcutae divi init dzielnie z reszta"() {
        expect:
            2 == operation.claculate(10,4)
    }
}
