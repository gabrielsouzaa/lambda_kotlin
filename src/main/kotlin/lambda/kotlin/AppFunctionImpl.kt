package lambda.kotlin

import com.fasterxml.jackson.module.kotlin.jacksonObjectMapper
import com.fasterxml.jackson.module.kotlin.readValue
import com.gabrielsouza.lambda.model.OutputJson

class AppFunctionImpl : AppFunction {

    override fun converter(message: HandlerInput): OutputJson {
        val outputJson = OutputJson()
        outputJson.eventType = message.eventType
        outputJson.name = message.name
        return outputJson
    }
}