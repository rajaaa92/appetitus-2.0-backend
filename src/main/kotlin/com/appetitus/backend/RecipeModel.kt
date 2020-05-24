package com.appetitus.backend

import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.GenerationType
import javax.persistence.Id

@Entity
data class RecipeModel(
        @Id
        @GeneratedValue(strategy = GenerationType.AUTO)
        var id: Long = -1,
        var name: String = "",
        var instructions: String = ""
) {}