package com.haikal.mobileappmi2a

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class PageLatihan2Activity : AppCompatActivity() {
    private lateinit var etUsername : TextView
    private lateinit var etPassword : TextView
    private lateinit var btnLogin : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_page_latihan2)

        etUsername = findViewById(R.id.etUsername)
        etPassword = findViewById(R.id.etPassword)
        btnLogin = findViewById(R.id.btnLogin)

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        btnLogin.setOnClickListener() {
            val username = etUsername.text.toString()
            val password = etPassword.text.toString()

            if(username == "admin" && password == "123456") {
                val intent4 = Intent(this, PageAdminActivity::class.java)
                startActivity(intent4)
            } else {
                Toast.makeText(this, "username atau password salah", Toast.LENGTH_SHORT).show()
            }
        }
    }
}