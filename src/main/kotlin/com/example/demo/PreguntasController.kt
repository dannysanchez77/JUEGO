package com.example.demo
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RestController

@RestController
class PreguntasController{
    @GetMapping("Juego/{id}")
    fun getPregunta(@PathVariable id: Int) : String {
        if (id < PreguntasRepository.juego.size)
            return PreguntasRepository.juego[id].pregunta  + PreguntasRepository.juego[id].respuesta1 + PreguntasRepository.juego[id].respuesta2 + PreguntasRepository.juego[id].respuesta3 + PreguntasRepository.juego[id].respuesta4
        else
            return "Esa pregunta no existe"
    }

}
