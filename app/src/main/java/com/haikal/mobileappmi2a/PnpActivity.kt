package com.haikal.mobileappmi2a

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class PnpActivity : AppCompatActivity() {

    private lateinit var btnMi : Button
    private lateinit var btnTekom : Button
    private lateinit var btnGaleri : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_pnp)

        btnMi = findViewById(R.id.btnMi)
        btnTekom = findViewById(R.id.btnTekom)
        btnGaleri = findViewById(R.id.btnGaleri)

        btnMi.setOnClickListener() {
            intent = Intent(this@PnpActivity, MiActivity::class.java)
            startActivity(intent)
        }

        btnTekom.setOnClickListener() {
            intent = Intent(this@PnpActivity, TekomActivity::class.java)
            startActivity(intent)
        }

        btnGaleri.setOnClickListener() {
            intent = Intent(this@PnpActivity, RecyclePnpActivity::class.java)
            startActivity(intent)
        }

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.rv_wisata)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
}