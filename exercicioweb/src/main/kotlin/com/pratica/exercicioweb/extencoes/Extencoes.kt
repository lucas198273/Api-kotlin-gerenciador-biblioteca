package com.pratica.exercicioweb.extencoes

import com.pratica.exercicioweb.controle.modelosrequisicao.LivroModeloAtualizacao
import com.pratica.exercicioweb.controle.modelosrequisicao.UsuarioModeloAtualizacao
import com.pratica.exercicioweb.controle.modelosrequisicao.UsuarioModeloRequisicao
import com.pratica.exercicioweb.modelos.Livro
import com.pratica.exercicioweb.modelos.Usuario

fun UsuarioModeloRequisicao.CovenverterClassePostParaModelo(): Usuario {
    return Usuario(
        nome = this.nome,
        email = this.email,
        valor = this.valor,
        )
}
fun UsuarioModeloAtualizacao.CovenverterClassePostParaModelo(id : Int): Usuario {
    return Usuario(
        id = id,
        nome = this.nome,
        email = this.email,
        valor = this.valor,
    )
}
fun LivroModeloAtualizacao.CovenverterClassePostParaModelo(): Usuario {
    return Livro(

        nomeLivro = this.nomeLivro,
        numeroDeFolhas = this.numeroDeFolhas,
        tema = this.tema,
        livroEmprestado = this.livroEmprestado
    )
}

