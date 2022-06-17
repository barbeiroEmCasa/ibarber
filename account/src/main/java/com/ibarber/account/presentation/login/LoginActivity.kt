package com.ibarber.account.presentation.login

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.NavController
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.ui.AppBarConfiguration
import com.ibarber.account.R
import com.ibarber.account.databinding.ActivityLoginBinding

class LoginActivity : AppCompatActivity() {
    private lateinit var navController: NavController
    private lateinit var appbarConfiguration: AppBarConfiguration

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivityLoginBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val navHostFragment = supportFragmentManager.findFragmentById(R.id.nav_host_container) as NavHostFragment

        navController = navHostFragment.navController
        appbarConfiguration = AppBarConfiguration(
            setOf()
        )

    }
}