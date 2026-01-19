package com.example.simple_be.controller

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class SimpleController {
    @GetMapping("/pong")
    fun getPong(): String {
        return "pong 🏓 pong 🏓"
    }
}