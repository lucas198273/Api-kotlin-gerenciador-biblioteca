package com.pratica.exercicioweb.service

import com.pratica.exercicioweb.modelos.Livro
import com.pratica.exercicioweb.repositorio.RepositorioLivros

class SistemLivroService(
  val livros: RepositorioLivros
){
/*    fun getNome(nomeLivro: String?): List<LivroModel> {
        nomeLivro?.let {
            return livros.filtrarPorNome(nomeLivro)
        }
        return  livros.findAll().toList()
    }*/
    fun getListaLivros(): List<Livro> {
        println("Obtendo lista de livros")
        return livros.findAll().toList() /*livros.findAll().toList()*/
    }
    fun getId(id: Int): Livro {
        return livros.findById(id).get()
    }
    fun atualizar(livroModel: Livro) {
        if(!livros.existsById(livroModel.id!!)){
            throw  Exception()
        }
        livros.save(livroModel)
    }
    fun criar(livroModel: Livro) {
        livros.save(livroModel)
        println("Livro criado: $livroModel")
    }


    fun deletar(id: Int) {
        if(!livros.existsById(id)){
            throw  Exception()
        }
        livros.deleteById(id)
    }
}

