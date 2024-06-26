package com.pratica.exercicioweb.controle


import com.pratica.exercicioweb.controle.modelosrequisicao.UsuarioModeloAtualizacao
import com.pratica.exercicioweb.controle.modelosrequisicao.UsuarioModeloRequisicao
import com.pratica.exercicioweb.extencoes.CovenverterClassePostParaModelo
import com.pratica.exercicioweb.modelos.Usuario
import com.pratica.exercicioweb.service.UsuarioService
import org.springframework.http.HttpStatus
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/usuarioControle")
class UsuarioControle(
    val sistemService: UsuarioService
) {
   /*@GetMapping("/buscar")
    fun getNome(@RequestParam nome: String?): List<Usuario> {
        return sistemService.getNome(nome)
    }*/
    @GetMapping
    fun getListaUsuarios(): List<Usuario> {
        println("Obtendo lista de livros")
        return sistemService.getListaUsuarios()
    }
    @GetMapping("/{id}")
    fun getLivro(@PathVariable id: Int): Usuario {
        return sistemService.getId(id)
    }
    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    fun criar(@RequestBody usuario: UsuarioModeloRequisicao) {
        sistemService.criar(usuario.CovenverterClassePostParaModelo())
    }

    @PutMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    fun atualizar(@PathVariable id: Int, @RequestBody usuario: UsuarioModeloAtualizacao) {
        sistemService.atualizar(usuario.CovenverterClassePostParaModelo(id))
    }
    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    fun deletar(@PathVariable id: Int) {
        sistemService.deletar(id)
    }
}
