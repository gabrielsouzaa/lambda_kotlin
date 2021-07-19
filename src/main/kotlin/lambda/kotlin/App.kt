package lambda.kotlin

import com.amazonaws.services.lambda.runtime.Context
import com.amazonaws.services.lambda.runtime.RequestHandler
import com.gabrielsouza.lambda.model.OutputJson

class App : RequestHandler<HandlerInput, OutputJson> {

    private val converter : AppFunction = AppFunctionImpl()

    override fun handleRequest(input: HandlerInput?, context: Context?): OutputJson {
        var result = OutputJson()
        input?.let {
            result = converter.converter(it)
        }
        return result
    }

}
