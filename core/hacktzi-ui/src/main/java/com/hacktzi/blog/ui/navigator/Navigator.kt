package com.hacktzi.blog.ui.navigator

import android.content.Context
import android.content.Intent

interface Navigator {

    fun goToLogin(context: Context) : Intent
}