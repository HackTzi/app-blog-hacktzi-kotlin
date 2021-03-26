package com.hacktzi.blog.provider

import android.content.Context
import android.content.Intent
import com.hacktzi.blog.login.LoginActivity
import com.hacktzi.blog.ui.navigator.Navigator

class NavigatorProvider : Navigator {
    override fun goToLogin(context: Context): Intent {
        return Intent(context, LoginActivity::class.java)
    }
}