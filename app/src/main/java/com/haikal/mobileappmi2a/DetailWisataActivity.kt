package com.haikal.mobileappmi2a

import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class DetailWisataActivity : AppCompatActivity() {

    private lateinit var txtWisataDestinasiDetail : TextView
    private lateinit var imgWisataDetail : ImageView
    private lateinit var txtWisataDetail : TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_detail_wisata)

        txtWisataDestinasiDetail = findViewById(R.id.txtWisataDestinasiDetail)
        imgWisataDetail = findViewById(R.id.imgWisataDetail)
        txtWisataDetail = findViewById(R.id.txtWisataDetail)

        val destinasi = intent.getStringExtra("txtWisataDestinasiDetail")
        val gambar = intent.getIntExtra("imgWisataDetail", 0)
        val detail = intent.getStringExtra("txtWisataDetail")

        txtWisataDestinasiDetail.setText(destinasi)
        imgWisataDetail.setImageResource(gambar)
        txtWisataDetail.setText(detail)

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
}