package com.haikal.mobileappmi2a

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class PageKeduaActivity : AppCompatActivity() {
    private lateinit var txtResult : TextView
    private lateinit var btnSubmit : Button
    private lateinit var etName : TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_page_kedua)

        txtResult = findViewById(R.id.txtResult)
        btnSubmit = findViewById(R.id.btnSubmit)
        etName = findViewById(R.id.etName)

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        btnSubmit.setOnClickListener() {
            val textInputName = etName.text
            txtResult.setText("Hello ${textInputName}, Selamat Datang di MI 2A")
        }
    }
}