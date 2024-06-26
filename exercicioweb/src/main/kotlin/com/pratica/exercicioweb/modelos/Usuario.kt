package com.pratica.exercicioweb.modelos

import jakarta.persistence.Column
import jakarta.persistence.Entity
import jakarta.persistence.GeneratedValue
import jakarta.persistence.GenerationType
import jakarta.persistence.Id



@Entity(name = "usuarios")
data class Usuario(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    var id: Int? = null,

    @Column(nullable = false)
    var nome: String,

    @Column(nullable = false)
    var email: String,

    @Column(nullable = false)
    var valor: Double
)



