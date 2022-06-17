package com.ibarber.account.presentation.newAccount.stepOne

import android.animation.ValueAnimator
import android.os.Bundle
import android.text.InputType
import android.view.View
import androidx.fragment.app.Fragment
import androidx.navigation.findNavController
import com.ibarber.account.R
import com.ibarber.account.databinding.NewAccountStepOneBinding
import com.ibarber.account.presentation.login.LoginFragmentDirections


class NewAccountStepOneFragment: Fragment(R.layout.new_account_step_one) {
    lateinit var binding: NewAccountStepOneBinding
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding = NewAccountStepOneBinding.bind(view)

        configTitleAnimation()
        configEditTexts()
        configListeners()
    }

    private fun configListeners() {
        binding.buttonNextStep.setOnClickListener {
            val action = NewAccountStepOneFragmentDirections.actionNewAccountStepOneFragmentToNewAccountStepTwoFragment()
            view?.findNavController()?.navigate(action)
        }
    }

    private fun configEditTexts() {
        binding.editTextEmail.setEditTextTitle("E-mail")
        binding.editTextName.setEditTextTitle("Nome")
        binding.editTextName.setKeyboardType(InputType.TYPE_TEXT_FLAG_CAP_WORDS)
    }

    private fun configTitleAnimation() {
        val animator = ValueAnimator.ofFloat(36f, 24f)
        animator.duration = 300

        animator.addUpdateListener { valueAnimator ->
            val animatedValue = valueAnimator.animatedValue as Float
            binding.textViewNewAccountStepOneTitle.textSize = animatedValue

        }
        animator.start()

    }


}