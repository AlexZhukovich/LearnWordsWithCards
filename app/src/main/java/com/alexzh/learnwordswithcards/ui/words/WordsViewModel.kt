package com.alexzh.learnwordswithcards.ui.words

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.alexzh.learnwordswithcards.data.WordsRepository

class WordsViewModel(
    wordsRepository: WordsRepository
) : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = wordsRepository.getWords().map { it.word }.toString()
    }
    val text: LiveData<String> = _text
}