package lambda.kotlin

import com.gabrielsouza.lambda.model.OutputJson

interface AppFunction {

    fun converter(message: HandlerInput): OutputJson

}