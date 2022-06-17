package com.ibarber.core.domain

sealed class Response<out T: Any> {
    data class Success<out T: Any>(val value: T): Response<T>()
    data class Error(val msg: String, val cause: Exception? = null): Response<Nothing>()
}
