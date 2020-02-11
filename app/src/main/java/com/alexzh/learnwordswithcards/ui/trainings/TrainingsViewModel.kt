package com.alexzh.learnwordswithcards.ui.trainings

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class TrainingsViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "This is trainings Fragment"
    }
    val text: LiveData<String> = _text
}