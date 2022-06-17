package com.ibarber.account.presentation.util

object RegexUtil {
    val CPF_REGEX = "[0-9]{3}\\.?[0-9]{3}\\.?[0-9]{3}\\-?[0-9]{2}".toRegex()
}