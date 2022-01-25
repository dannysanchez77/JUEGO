package com.example.demo
import com.google.gson.Gson
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RestController

@RestController
class PreguntasController {
    @GetMapping("Pregunta")
    fun getPreguntas(): String {
        return PreguntasRepository.juego.random().toString()
    }

    @GetMapping("Pregunta/{id]/{correcta}")
    fun getCorrecta(@PathVariable respuesta: String, @PathVariable id: Int): String {
        val gson = Gson()
        if (PreguntasRepository.juego[id].correcta.equals(respuesta)) {
            println(" Muy bien has acertado ")
            return gson.toJson(" Respuesta Correcta ")
        } else {
            println(" Has fallado. sigue intentadolo ")
            return gson.toJson(" Respuesta Incorrecta\n ")
        }
    }
}
