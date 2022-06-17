package com.paiva.ibarber.di

import com.ibarber.core.usecase.NewAccountUseCase
import com.ibarber.account.presentation.newAccount.NewAccountViewModel
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module

val useCase = module {

    single { NewAccountUseCase(get()) }
}

val viewModel = module {
    viewModel { NewAccountViewModel(get()) }
}