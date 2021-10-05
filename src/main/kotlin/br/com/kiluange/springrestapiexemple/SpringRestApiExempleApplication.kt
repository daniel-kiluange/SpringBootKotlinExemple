package br.com.kiluange.springrestapiexemple

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.scheduling.annotation.EnableAsync

@SpringBootApplication
@EnableAsync
class SpringRestApiExempleApplication

fun main(args: Array<String>) {
    runApplication<SpringRestApiExempleApplication>(*args)
}
