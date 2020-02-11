package com.alexzh.learnwordswithcards.data.model

data class Word(
    val id: Long,
    val word: String,
    val translation: String,
    val isFavourite: Boolean
)