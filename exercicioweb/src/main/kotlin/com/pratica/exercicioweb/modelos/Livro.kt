package com.pratica.exercicioweb.modelos

import com.pratica.exercicioweb.enums.StatusLivro
import jakarta.persistence.*

@Entity(name = "livros")
data class Livro(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    var id: Int? = null,

    @Column(nullable = false)
    var nomeLivro: String,

    @Column(nullable = false)
    var numeroDeFolhas: Int,

    @Column(nullable = false)
    var tema: String,

    @Column(nullable = false)
    @Enumerated(EnumType.STRING)
    var livroEmprestado: StatusLivro? = null,

    @ManyToOne
    @JoinColumn(name = "usuario_id")
    var usuario: Usuario? = null
)
