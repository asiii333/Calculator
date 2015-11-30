import operations.Add
import spock.lang.Specification

/**
 * Created by Asia on 2015-11-30.
 */
class AddTest extends Specification {

    def "Claculate add int"() {
        given:
            def operation = new Add()
        expect:
            10 == operation.claculate(5,5)
    }
}
