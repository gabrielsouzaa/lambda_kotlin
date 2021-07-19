package com.gabrielsouza.lambda.model

import com.fasterxml.jackson.annotation.JsonProperty
import java.time.LocalDateTime
import java.time.format.DateTimeFormatter

class OutputJson {

    @JsonProperty("eventType")
    var eventType : String = ""

    @JsonProperty("name")
    var name : String = ""

    val timestamp : String? = getFormatLocalDateTime()

    fun getFormatLocalDateTime() : String {
        var currentDateTime = LocalDateTime.now()
        var formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss")
        return currentDateTime.format(formatter)
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as OutputJson

        if (eventType != other.eventType) return false
        if (name != other.name) return false

        return true
    }
}



