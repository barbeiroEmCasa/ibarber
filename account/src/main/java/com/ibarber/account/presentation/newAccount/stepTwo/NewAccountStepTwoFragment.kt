package com.ibarber.account.presentation.newAccount.stepTwo

import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.fragment.app.Fragment
import com.ibarber.account.R
import com.ibarber.account.databinding.NewAccountStepTwoBinding
import com.ibarber.account.presentation.util.CpfUtil.isValidCpf

class NewAccountStepTwoFragment: Fragment(R.layout.new_account_step_two) {
    private lateinit var binding: NewAccountStepTwoBinding
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding = NewAccountStepTwoBinding.bind(view)

        configEditTexts()
        configListeners()

    }

    private fun configListeners() {
        binding.buttonNextStepTwo.setOnClickListener {
            if (isValidCpf(binding.editTextCpf.getStringText())) {
                return@setOnClickListener
            }
            Toast.makeText(requireContext(), "CPF Invalido", Toast.LENGTH_SHORT).show()
        }
    }

    private fun configEditTexts() {
        binding.editTextCpf.setEditTextTitle("CPF")
        binding.editTextPassword.setEditTextTitle("Senha")
        binding.editTextCpf.setUpMaskCpf()
    }

}