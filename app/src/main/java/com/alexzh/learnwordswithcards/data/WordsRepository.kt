package com.alexzh.learnwordswithcards.data

import com.alexzh.learnwordswithcards.data.model.Word

interface WordsRepository {

    fun getWords(): List<Word>

    fun getFavouriteWords(): List<Word>
}