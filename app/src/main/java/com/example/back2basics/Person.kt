package com.example.back2basics

import java.io.Serializable

data class Person (
    val firstName: String,
    val lastName: String,
    val birthDate: String,
    val country: String
) : Serializable