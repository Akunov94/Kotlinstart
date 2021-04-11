package com.example.kotlinstart

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.TextUtils
import android.widget.Toast
import es.dmoral.toasty.Toasty
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        init()
    }

    private fun init() {
        btnSend.setOnClickListener {
            var text = etSomeText.text.toString().isNullOrEmpty()
            if (text) {
                toasty("Введите текст")
            } else {
                val intent = Intent(this, SecondActivity2::class.java)
                intent.putExtra("key", etSomeText.text.toString())
                startActivity(intent)
            }
        }
    }
}