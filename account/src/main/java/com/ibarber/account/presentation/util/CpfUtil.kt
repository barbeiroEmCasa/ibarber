package com.ibarber.account.presentation.util

object CpfUtil {

    fun isValidCpf(cpf: String): Boolean {
        return cpf.matches(RegexUtil.CPF_REGEX)
    }
}