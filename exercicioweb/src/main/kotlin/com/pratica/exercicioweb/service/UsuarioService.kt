package com.pratica.exercicioweb.service

import com.pratica.exercicioweb.modelos.Usuario
import com.pratica.exercicioweb.repositorio.RepositorioUsuarios
import org.springframework.stereotype.Service

@Service
class UsuarioService (

    val usuarios: RepositorioUsuarios
){

  /*  fun getNome(nome: String?): List<Usuario> {
        nome?.let {
            return usuarios.findByNameContaining(it)
        }
        return  usuarios.findAll().toList()
    }*/
    fun getListaUsuarios(): List<Usuario> {
        println("Obtendo lista de usuarios")
        return  usuarios.findAll().toList()
    }
    fun getId(id: Int): Usuario {
        return usuarios.findById(id).get()
    }
    fun atualizar(usuario: Usuario) {
        if(!usuarios.existsById(usuario.id!!)){
            throw  Exception()
        }
        usuarios.save(usuario)
    }
    fun criar(usuario: Usuario) {
        usuarios.save(usuario)
        println("Livro criado: $usuario")
    }


    fun deletar(id: Int) {
        if(!usuarios.existsById(id)){
            throw  Exception()
        }
        usuarios.deleteById(id)
    }



}