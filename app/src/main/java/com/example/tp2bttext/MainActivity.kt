package com.example.tp2bttext

import android.annotation.SuppressLint
import android.os.Bundle
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import android.widget.Button
import android.widget.EditText
import android.widget.TextView


class MainActivity : AppCompatActivity() {
    private lateinit var btn: Button // Déclaration de la référence btn

    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btn = findViewById(R.id.btn) // Initialisation de la référence btn


        btn.setOnClickListener {
            val editText = findViewById<EditText>(R.id.editText)
            val textView = findViewById<TextView>(R.id.textView)

            if (editText.text.trim().isNotEmpty()) {
                textView.text = "Message: ${editText.text}"
            } else {
                textView.text = ""
                Toast.makeText(this, "Please enter your Message", Toast.LENGTH_SHORT).show()
            }
        }
    }
}