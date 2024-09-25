package com.haikal.mobileappmi2a

import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class DetailMovieActivity : AppCompatActivity() {

    private lateinit var txtMovieDetail : TextView
    private lateinit var imgMovieDetail : ImageView
    private lateinit var txtSinopsisDetail : TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_detail_movie)

        txtMovieDetail = findViewById(R.id.txtMovieDetail)
        imgMovieDetail = findViewById(R.id.imgMovieDetail)
        txtSinopsisDetail = findViewById(R.id.txtSinopsisDetail)

        val detailTeks = intent.getStringExtra("txtMovieItem")
        val detailImg = intent.getIntExtra("imgMovieItem", 0)
        val detailSinop = intent.getStringExtra("txtSinopsisItem")

        txtMovieDetail.setText(detailTeks)
        imgMovieDetail.setImageResource(detailImg)
        txtSinopsisDetail.setText(detailSinop)

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
}