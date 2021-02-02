package com.umssee.phoneexampleandroid.viewmodels

import android.view.View
import android.widget.Toast
import androidx.databinding.ObservableField

class MainViewModel{
    val text = ObservableField<String>("")

    fun showText(view: View) {
        Toast.makeText(view.context, "${text.get()}", Toast.LENGTH_SHORT).show()
    }
}