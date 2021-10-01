package br.com.kiluange.springrestapiexemple.service

import org.springframework.http.ResponseEntity

sealed interface BaseService<T, ID> {
    fun getById(id: ID): T
    fun getAll(): List<T>
    fun save(entity: T): T
}