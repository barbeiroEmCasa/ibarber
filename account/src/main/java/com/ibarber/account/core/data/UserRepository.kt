package com.paiva.core_.data

import com.ibarber.core.domain.Barber
import com.ibarber.core.domain.Response

class UserRepository {


    suspend fun createNewAccount(barber: Barber): Response<Any> {


        return Response.Success("teste")
    }
}