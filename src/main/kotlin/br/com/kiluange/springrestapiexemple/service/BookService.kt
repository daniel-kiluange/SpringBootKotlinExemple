package br.com.kiluange.springrestapiexemple.service

import br.com.kiluange.springrestapiexemple.data.domain.Book
import br.com.kiluange.springrestapiexemple.exception.NoSuchItemException
import org.slf4j.Logger
import org.slf4j.LoggerFactory
import org.slf4j.MDC
import org.springframework.stereotype.Service

@Service
class BookService : BaseService<Book, Int> {
    val listOfBooks = mutableListOf(Book(1, "test1"), Book(2, "test2"))

    val logger: Logger = LoggerFactory.getLogger(this.javaClass)

    override fun getById(id: Int): Book {
        logger.info("Service {}",MDC.get("x-tid"))
        return listOfBooks.find { book -> book.id == id }
            ?: throw NoSuchItemException().also { logger.info("Can't find book id {}", id, it) }
    }

    override fun getAll(): List<Book> {
        return listOfBooks;
    }

    override fun save(entity: Book): Book {
        TODO("Not yet implemented")
    }
}