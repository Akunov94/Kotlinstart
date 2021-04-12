package com.example.kotlinstart.extension

import android.app.Activity
import android.widget.Toast


fun Activity.displayToast(msg: String) {
    Toast.makeText(this,msg, Toast.LENGTH_SHORT).show()
}


