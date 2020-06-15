import org.junit.Test
import kotlin.system.measureTimeMillis

class ExecutorTest {
    @Test
    internal fun testMain() {
        // Input the input here!
        val string = ""

        System.setIn(string.byteInputStream())
        val executionTime = measureTimeMillis {
            main(emptyArray())
        }

        println("It took $executionTime ms")
    }
}
