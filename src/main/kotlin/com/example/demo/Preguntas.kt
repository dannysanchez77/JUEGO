package com.example.demo

import com.google.gson.Gson
data class Preguntas(var pregunta: String,
                     var respuesta1: String,
                     var respuesta2: String,
                     var respuesta3: String,
                     var respuesta4: String,
                     var correcta: String,
                     var id: Int) {
    override fun toString(): String {
        val gson = Gson()
        return gson.toJson( "$id: $pregunta  $respuesta1  $respuesta2  $respuesta3  $respuesta4 ")
    }
}