package com.haikal.mobileappmi2a

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class LoginActivity : AppCompatActivity() {

    private lateinit var etUsernameLogin : EditText
    private lateinit var etPasswordLogin : EditText
    private lateinit var btnLoginPage : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_login)

        // passing data --> pengiriman data atau value dari satu activity ke activity lain
        // Intent
        //put Extras --> untuk simpan dan kirim nilai
        // get Extras --> untuk mengambil nilai yang sudah dikirim
        etUsernameLogin = findViewById(R.id.etUsernameLogin)
        etPasswordLogin = findViewById(R.id.etPasswordLogin)
        btnLoginPage = findViewById(R.id.btnLoginPage)

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        btnLoginPage.setOnClickListener() {
            var intent = Intent(this@LoginActivity, WelcomePageActivity::class.java)
            val nUsername = etUsernameLogin.text.toString()
            val nPassword = etPasswordLogin.text.toString()
            intent.putExtra("username", nUsername)
            intent.putExtra("password", nPassword)

            // cek data yang sudah dikirim
            Log.d("username nya : ", nUsername)
            Log.d("Password nya : ", nPassword)
            startActivity(intent)
        }

    }
}