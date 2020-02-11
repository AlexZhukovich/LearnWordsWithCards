package com.alexzh.learnwordswithcards.ui.words.model

import androidx.compose.Model

@Model
data class WordModel(
    val id: Long,
    val word: String,
    val translation: String,
    val isFavourite: Boolean
)