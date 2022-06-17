package com.ibarber.account.presentation.newAccount

import androidx.lifecycle.ViewModel
import com.ibarber.core.usecase.NewAccountUseCase

class NewAccountViewModel(
    private val newAccountUseCase: NewAccountUseCase
) : ViewModel() {

    fun createNewAccount() {
//        viewModelScope.launch {
//           var response =  newAccountUseCase.invoke("")
//
//            when(response) {
//                is Response.Success -> {
//
//                }
//                is Response.Error -> {
//
//                }
//            }
//        }

    }
}