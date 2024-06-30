package com.pratica.exercicioweb.controle.modelosrequisicao

import com.fasterxml.jackson.annotation.JsonAlias
import java.math.BigDecimal

data class LivroModeloAtualizacao (
    var nomeLivro: String,
    var numeroDeFolhas: Int,
    var tema: String,
    var preco: BigDecimal,

    @JsonAlias("usuario_id")
    var usuario_id: Int
)

