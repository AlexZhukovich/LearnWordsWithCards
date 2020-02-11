package com.alexzh.learnwordswithcards.ui.words.mapper

import com.alexzh.learnwordswithcards.data.model.Word
import com.alexzh.learnwordswithcards.ui.words.model.WordModel

class WordMapper {

    fun map(entity: Word): WordModel {
        return WordModel(
            entity.id,
            entity.word,
            entity.translation,
            entity.isFavourite
        )
    }
}