package com.example.sj20191215_02_singnuppractice

import android.os.Bundle

class SignUpActivity : BaseActivity() {

    var lastBackTime = 0L

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sign_up)
    }
    override fun setupEvents() {
        lastBackTime = 0
    }

    override fun setValues() {
        lastBackTime = 0
    }

}
