package com.example.simple_be

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class SimpleBeApplication

fun main(args: Array<String>) {
	runApplication<SimpleBeApplication>(*args)
}
