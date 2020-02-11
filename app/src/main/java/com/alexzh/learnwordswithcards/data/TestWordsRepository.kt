package com.alexzh.learnwordswithcards.data

import com.alexzh.learnwordswithcards.data.model.Word

class TestWordsRepository : WordsRepository {
    private val words = listOf(
        Word(
            id = 1L,
            word = "Work #1",
            translation = "Translation #1",
            isFavourite = true
        ),
        Word(
            id = 2L,
            word = "Work #2",
            translation = "Translation #2",
            isFavourite = true
        ),
        Word(
            id = 3L,
            word = "Work #3",
            translation = "Translation #3",
            isFavourite = false
        ),
        Word(
            id = 4L,
            word = "Work #4",
            translation = "Translation #4",
            isFavourite = false
        ),
        Word(
            id = 5L,
            word = "Work #5",
            translation = "Translation #5",
            isFavourite = false
        ),
        Word(
            id = 6L,
            word = "Work #6",
            translation = "Translation #6",
            isFavourite = true
        ),
        Word(
            id = 7L,
            word = "Work #7",
            translation = "Translation #7",
            isFavourite = false
        ),
        Word(
            id = 8L,
            word = "Work #8",
            translation = "Translation #8",
            isFavourite = true
        )
    )

    override fun getWords(): List<Word> {
        return words
    }

    override fun getFavouriteWords(): List<Word> {
        return words.filter { it.isFavourite }
    }
}