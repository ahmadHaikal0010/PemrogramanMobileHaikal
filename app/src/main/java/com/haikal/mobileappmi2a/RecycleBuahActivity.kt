package com.haikal.mobileappmi2a

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.haikal.mobileappmi2a.adapter.BuahAdapter
import com.haikal.mobileappmi2a.model.Mocklist1
import com.haikal.mobileappmi2a.model.ModelBuah

class RecycleBuahActivity : AppCompatActivity() {

    private lateinit var rv_buah : RecyclerView
    private lateinit var rv_buah2 : RecyclerView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_recycle_buah)

        rv_buah = findViewById(R.id.rv_buah)
        rv_buah2 = findViewById(R.id.rv_buah2)

        rv_buah.layoutManager = LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false)
        rv_buah2.layoutManager = GridLayoutManager(this, 1, GridLayoutManager.VERTICAL, false)

        val adapter = BuahAdapter(Mocklist1.getModel() as ArrayList<ModelBuah>, this)

        rv_buah.adapter = adapter
        rv_buah2.adapter = adapter

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.rv_wisata)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
}