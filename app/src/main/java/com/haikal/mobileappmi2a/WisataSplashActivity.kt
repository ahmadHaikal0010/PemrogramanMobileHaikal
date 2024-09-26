package com.haikal.mobileappmi2a

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class WisataSplashActivity : AppCompatActivity() {

    private lateinit var btnSeeDetails : Button
    private lateinit var imgWisataSplash : ImageView
    private lateinit var txtWisataDestinasiSplash : TextView
    private lateinit var txtWisataKet : TextView
    private lateinit var txtWisataDetail : TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_wisata_splash)

        btnSeeDetails = findViewById(R.id.btnSeeDetails)
        imgWisataSplash = findViewById(R.id.imgWisataSplash)
        txtWisataDestinasiSplash = findViewById(R.id.txtWisataDestinasiSplash)
        txtWisataKet = findViewById(R.id.txtWisataKet)
        txtWisataDetail = findViewById(R.id.txtWisataDetail)

        val splashDestinasi = intent.getStringExtra("txtWisataDestinasiSplash")
        val splashKet = intent.getStringExtra("txtWisataKet")
        val splashImage = intent.getIntExtra("imgWisataSplash", 0)
        val splashDetail = intent.getStringExtra("txtWisataDetail")

        txtWisataDestinasiSplash.setText(splashDestinasi)
        txtWisataKet.setText(splashKet)
        imgWisataSplash.setImageResource(splashImage)

        btnSeeDetails.setOnClickListener() {
            intent = Intent(this@WisataSplashActivity, DetailWisataActivity::class.java)
            intent.putExtra("txtWisataDestinasiDetail", splashDestinasi)
            intent.putExtra("imgWisataDetail", splashImage)
            intent.putExtra("txtWisataDetail", splashDetail)
            startActivity(intent)
        }

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
}