package com.exraion.beu.ui.auth

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.commit
import androidx.fragment.app.commitNow
import com.exraion.beu.R
import com.exraion.beu.ui.auth.login.LoginFragment

class AuthActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_auth)
    
        supportFragmentManager.commitNow {
            add(R.id.auth_container, LoginFragment())
        }
    }
}