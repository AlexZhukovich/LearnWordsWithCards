package com.alexzh.learnwordswithcards.di

import com.alexzh.learnwordswithcards.data.TestWordsRepository
import com.alexzh.learnwordswithcards.data.WordsRepository
import com.alexzh.learnwordswithcards.ui.favourites.FavouritesViewModel
import com.alexzh.learnwordswithcards.ui.trainings.TrainingsViewModel
import com.alexzh.learnwordswithcards.ui.words.WordsViewModel
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module

val dataModule = module {
    factory<WordsRepository> { TestWordsRepository() }
}

val wordsModule = module {
    viewModel { WordsViewModel(wordsRepository = get()) }
}

val favouritesModule = module {
    viewModel { FavouritesViewModel() }
}

val trainingsModule = module {
    viewModel { TrainingsViewModel() }
}