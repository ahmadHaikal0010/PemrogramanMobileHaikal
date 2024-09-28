package com.haikal.mobileappmi2a

import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class DetailBuah : AppCompatActivity() {

    private lateinit var txtDetailBuah : TextView
    private lateinit var txtDetailLokasi : TextView
    private lateinit var txtDetailDeskripsi : TextView
    private lateinit var imgDetailBuah : ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_detail_buah)

        txtDetailBuah = findViewById(R.id.txtDetailBuah)
        txtDetailLokasi = findViewById(R.id.txtDetailLokasi)
        txtDetailDeskripsi = findViewById(R.id.txtDetailDeskripsi)
        imgDetailBuah = findViewById(R.id.imgDetailBuah)

        // get data dari intent
        val detailTeks = intent.getStringExtra("nama")
        val detailLokasi = intent.getStringExtra("lokasi")
        val detailDeskripsi = intent.getStringExtra("deskripsi")
        val detailImg = intent.getIntExtra("image", 0)

        // set data ke widget
        txtDetailBuah.setText(detailTeks)
        txtDetailLokasi.setText(detailLokasi)
        txtDetailDeskripsi.setText(detailDeskripsi)
        imgDetailBuah.setImageResource(detailImg)

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
}