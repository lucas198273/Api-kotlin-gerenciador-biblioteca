package com.pratica.exercicioweb.repositorio


import com.pratica.exercicioweb.modelos.Usuario
import org.springframework.data.repository.CrudRepository

interface RepositorioUsuarios: CrudRepository<Usuario,Int> {
    /*fun findByNameContaining(nome :String): List<Usuario>*/
}
