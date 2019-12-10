package com.example.databinding

import android.view.View
import android.widget.Toast
import androidx.databinding.ObservableField

class ViewModel {
    val text = ObservableField<String>("")

    fun showText(view: View){
        Toast.makeText(view.context, "${text.get()}", Toast.LENGTH_LONG).show()
    }
}