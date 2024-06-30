package com.pratica.exercicioweb.repositorio


import com.pratica.exercicioweb.modelos.Livro
import com.pratica.exercicioweb.modelos.Usuario
import org.springframework.data.repository.CrudRepository

interface RepositorioLivros: CrudRepository<Livro,Int> {
    /*fun findByNameContaining(nome :String): List<Usuario>*/
}
