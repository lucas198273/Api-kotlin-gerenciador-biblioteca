package com.pratica.exercicioweb.controle

import com.pratica.exercicioweb.controle.modelosrequisicao.LivroModeloAtualizacao
import com.pratica.exercicioweb.modelos.Livro
import com.pratica.exercicioweb.repositorio.RepositorioLivros
import com.pratica.exercicioweb.service.SistemLivroService
import org.springframework.http.HttpStatus
import org.springframework.web.bind.annotation.*

class LivroControle (
    val sistemService: SistemLivroService
) {


    @GetMapping
    fun getListaLivros(): List<Livro> {
        println("Obtendo lista de livros")
        return sistemService.getListaLivros()
    }
    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    fun criar(@RequestBody livroModelPost: LivroModeloAtualizacao) {
        sistemService.criar(livroModelPost.CovenverterClassePostParaModelo())
    }
    @GetMapping("/{id}")
    fun getLivro(@PathVariable id: Int): Livro {
        return sistemService.getId(id)
    }
    @PutMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    fun atualizar(@PathVariable id: Int, @RequestBody livroModel: LivroModeloAtualizacao) {
        return sistemService.atualizar(livroModel.CovenverterClassePostParaModelo(id))
    }
    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    fun deletar(@PathVariable id: Int) {
        sistemService.deletar(id)
    }

}