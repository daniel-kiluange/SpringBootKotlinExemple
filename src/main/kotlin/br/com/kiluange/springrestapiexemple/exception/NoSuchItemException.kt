package br.com.kiluange.springrestapiexemple.exception

import org.springframework.http.HttpStatus
import org.springframework.web.bind.annotation.ResponseStatus

@ResponseStatus(value= HttpStatus.NOT_FOUND, reason="No such item", code = HttpStatus.NOT_FOUND)
class NoSuchItemException : RuntimeException() {
}