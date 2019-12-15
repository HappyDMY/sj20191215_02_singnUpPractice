package com.example.sj20191215_02_singnuppractice

import android.app.DatePickerDialog
import android.graphics.Color
import android.icu.util.Calendar
import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import android.util.Log
import android.widget.Toast
import androidx.core.widget.addTextChangedListener
import kotlinx.android.synthetic.main.activity_sign_up.*

class SignUpActivity : BaseActivity() {

    var lastBackTime = 0L

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sign_up)
        setupEvents()
        setValues()
    }
    override fun setupEvents() {
//        pwEdt.addTextChangedListener(object : TextWatcher{
//            override fun afterTextChanged(s: Editable?) {
//            }
//
//            override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {
//            }
//
//            override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {
//                Log.d("입력된값" , s.toString())
//            }
//
//        })


//        pwEdt.addTextChangedListener {
//            Log.d("입력된값", it.toString())
//        }

        birthDayTxt.setOnClickListener {
//            Toast.makeText(mContext,"생일지정 택스트 뷰 클릭", Toast.LENGTH_SHORT).show()
            val datePickerDialog = DatePickerDialog(mContext, DatePickerDialog.OnDateSetListener { view, year, month, dayOfMonth ->
              val selectedDateStr = "${year} / ${month-1} / ${dayOfMonth}"
                birthDayTxt.text =selectedDateStr
            },2019,Calendar.DECEMBER,15)
            datePickerDialog.show()
        }



        pwEdt.addTextChangedListener {
            Log.d("입력된값", it.toString())
            val inputStr= it.toString()
            if (inputStr.length==0){
                pwStatusTxt.text ="버번입력하세요"
                pwStatusTxt.setTextColor(Color.RED)
            }else if (inputStr.length <8){
                pwStatusTxt.text ="버번이 너무 짧음"
                pwStatusTxt.setTextColor(Color.YELLOW)
                pwStatusTxt.setTextColor(Color.parseColor("#FDA0EF"))
            }else {
                pwStatusTxt.text ="사용해도 좋은 비밀번호입니다."
                pwStatusTxt.setTextColor(Color.GREEN)
                pwStatusTxt.setTextColor(Color.parseColor("#F2B3FA"))

            }
        }
    }

    override fun setValues() {
        lastBackTime = 0
    }

}
