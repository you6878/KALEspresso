package com.howl.howlespresso

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.app.AlertDialog
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button.setOnClickListener {
            if(editTextId.text.toString() == "howl" && editTextPassword.text.toString() == "123456"){
                startActivity(Intent(this,Main2Activity::class.java))
            }else{
                var alertDialog = AlertDialog.Builder(this)
                        .setTitle("에러")
                        .setMessage("아이디와 비밀번호가 맞지 않습니다.")
                        .setPositiveButton("확인",{dialog, which ->  })
                alertDialog.show()
            }
        }
    }
}
