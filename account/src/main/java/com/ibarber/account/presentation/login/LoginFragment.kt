package com.ibarber.account.presentation.login

import android.os.Bundle
import android.text.InputType
import android.view.View
import androidx.fragment.app.Fragment
import androidx.navigation.findNavController
import com.ibarber.account.R
import com.ibarber.account.databinding.LoginFragmentBinding


class LoginFragment: Fragment(R.layout.login_fragment) {
    lateinit var binding: LoginFragmentBinding
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding = LoginFragmentBinding.bind(view)

        configEditTexts()
        configListeners()
    }

    private fun configListeners() {
        binding.constraintLayoutNewAccount.setOnClickListener {
            val action = LoginFragmentDirections.actionLoginFragmentToNewAccountFragment()
            view?.findNavController()?.navigate(action)
        }
    }

    private fun configEditTexts() {
        binding.editTextLoginEmail.setEditTextTitle("E-mail")
        binding.editTextLoginPassword.setEditTextTitle("Senha")
        binding.editTextLoginPassword.setKeyboardType(InputType.TYPE_NUMBER_VARIATION_PASSWORD)
    }
}