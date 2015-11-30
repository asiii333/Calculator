import operations.Subtract
import spock.lang.Specification

/**
 * Created by Asia on 2015-11-30.
 */
class SubtractTest extends Specification {
    def "Claculate"() {
        given:
            def operation = new Subtract();
        expect:
            2 == operation.claculate(4,2);
    }
}
