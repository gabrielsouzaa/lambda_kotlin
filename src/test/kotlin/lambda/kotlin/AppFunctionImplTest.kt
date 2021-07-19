package lambda.kotlin

import org.junit.Test
import kotlin.test.assertEquals
import kotlin.test.assertNotNull

class AppFunctionImplTest {

    @Test fun testConverterMessage() {
        val input = HandlerInput()
        input.eventType = "test"
        input.name = "function"
        val appFunctionTest : AppFunction = AppFunctionImpl()
        val result = appFunctionTest.converter(input)
        assertEquals("test", result.eventType)
        assertNotNull(result.timestamp)
        assertEquals("function", result.name)
    }


}