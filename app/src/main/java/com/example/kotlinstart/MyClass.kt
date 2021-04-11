package com.example.kotlinstart

import android.content.Context
import es.dmoral.toasty.Toasty
fun Context.toasty(message: CharSequence, duration: Int = Toasty.LENGTH_SHORT) {
    Toasty.error(this, message,duration, true).show();
}