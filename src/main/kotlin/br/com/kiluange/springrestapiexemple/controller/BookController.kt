package br.com.kiluange.springrestapiexemple.controller

import br.com.kiluange.springrestapiexemple.data.domain.Book
import br.com.kiluange.springrestapiexemple.service.BookService
import org.slf4j.Logger
import org.slf4j.LoggerFactory
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RestController

@RestController
class BookController {

    @Autowired
    lateinit var bookService: BookService

    val logger: Logger = LoggerFactory.getLogger(this.javaClass)

    @GetMapping("/book/{id}")
    fun getBook(@PathVariable("id") id: Int): Book {
        logger.debug("Fetch book id {}", id)
        return bookService.getById(id)
    }

    @GetMapping("/books")
    fun getAllBooks(): List<Book> {
        return bookService.getAll()
    }
}
