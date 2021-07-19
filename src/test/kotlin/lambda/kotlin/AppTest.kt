package lambda.kotlin

import com.gabrielsouza.lambda.model.OutputJson
import org.junit.Test
import kotlin.test.assertEquals

class AppTest {

    @Test
    fun appHasAGreeting() {
        val classUnderTest = App()
        val input = HandlerInput()
        input.eventType = "test"
        input.name = "function"
        val expected = OutputJson()
        expected.eventType = "test"
        expected.name = "function"
        var outputJson = classUnderTest.handleRequest(input, null)
        assertEquals(expected, outputJson)
    }

}
