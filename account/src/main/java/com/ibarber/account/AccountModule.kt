package com.ibarber.account

import android.content.Context
import android.content.Intent
import com.ibarber.account.presentation.login.LoginActivity

object AccountModule {
    fun startAccountModule(context: Context) {

        context.startActivity(Intent(context, LoginActivity::class.java))
    }
}