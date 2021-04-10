package com.example.kotlinstart
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_second2.*

class SecondActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second2)
        init()
    }

    private fun init() {
        var textIsFirstActivity = intent.getStringExtra("key")
        tvShowText.text = textIsFirstActivity
        btnBack.setOnClickListener {
            var intent = Intent(this, MainActivity::class.java)
            if (etSomeText.text.toString() == textIsFirstActivity) {
                etSomeText.setText(textIsFirstActivity)
                startActivity(intent)
            }
        }
    }
}