package com.example.aboutme

import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        addNickname()
    }

    private fun addNickname() {
        val editText = findViewById<EditText>(R.id.nickname_edit)
        val nickNameTextview = findViewById<TextView>(R.id.nickname_text)

        nickNameTextview.text = editText.text
        editText.visibility = View.GONE
        nickNameTextview.visibility = View.VISIBLE
    }
}