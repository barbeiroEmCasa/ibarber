package com.ibarber.core.usecase

import com.paiva.core_.data.UserRepository
import com.ibarber.core.domain.Barber

class NewAccountUseCase(private val userRepository: UserRepository) {
    suspend operator fun invoke(barber: Barber) = userRepository.createNewAccount(barber)
}