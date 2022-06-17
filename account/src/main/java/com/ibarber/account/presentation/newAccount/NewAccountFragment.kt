package com.ibarber.account.presentation.newAccount

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import com.ibarber.account.R
import com.ibarber.account.databinding.NewAccountFragmentBinding

class NewAccountFragment: Fragment(R.layout.new_account_fragment) {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val binding = NewAccountFragmentBinding.bind(view)
    }
}