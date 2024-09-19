package com.haikal.mobileappmi2a

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    private lateinit var btnClick : Button
    private lateinit var btnNextPage : Button
    private lateinit var btnLatihan2 : Button
    private lateinit var btnKalkulatorSederhana : Button
    private lateinit var btnPassingData : Button
    private lateinit var btnList_view : Button
    private lateinit var btnRecycleView : Button
    private lateinit var btnRecycleBuah : Button
    private lateinit var btnPnp : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        btnClick = findViewById(R.id.btnClickHere)
        btnNextPage = findViewById(R.id.btnNextPage)
        btnLatihan2 = findViewById(R.id.btnLatihan2)
        btnKalkulatorSederhana = findViewById(R.id.btnKalkulatorSederhana)
        btnPassingData = findViewById(R.id.btnPassingData)
        btnList_view = findViewById(R.id.btnList_view)
        btnRecycleView = findViewById(R.id.btnRecycleView)
        btnRecycleBuah = findViewById(R.id.btnRecycleBuah)
        btnPnp = findViewById(R.id.btnPnp)

        // untuk 1 screen terdiri dari 1 main activity dan 1 file xml layout
        // untuk widget yang dipakai, harus dideklarasi dahulu
        // kita deklarasi findviewby id

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        btnClick.setOnClickListener() {
            Toast.makeText(this, "Anda Menekan Tombol", Toast.LENGTH_SHORT).show()
        }

        btnNextPage.setOnClickListener() {
            // untuk pindah page : intent
            // intent ada 2, yaitu intent implicit dan intent explicit
            // intent implicit : intent yang dibuat sendiri dan yang berlaku didalam project
            // intent explicit : kita memanggil pihak ketiga / third party / library = gmaps, etc

            val intentMenu = Intent(this@MainActivity, PageKeduaActivity::class.java)
            startActivity(intentMenu)
        }

        btnLatihan2.setOnClickListener() {
            val intentMenu = Intent(this@MainActivity, PageLatihan2Activity::class.java)
            startActivity(intentMenu)
        }

        btnKalkulatorSederhana.setOnClickListener() {
            val intentMenu = Intent(this@MainActivity, KalkulatorSederhanaActivity::class.java)
            startActivity(intentMenu)
        }

        btnPassingData.setOnClickListener() {
            val intentMenu = Intent(this@MainActivity, LoginActivity::class.java)
            startActivity(intentMenu)
        }

        btnList_view.setOnClickListener() {
            val intentMenu = Intent(this@MainActivity, ListViewActivity::class.java)
            startActivity(intentMenu)
        }

        btnRecycleView.setOnClickListener() {
            val intentMenu = Intent(this@MainActivity, RecycleViewActivity::class.java)
            startActivity(intentMenu)
        }

        btnRecycleBuah.setOnClickListener() {
            val intentMenu = Intent(this@MainActivity, RecycleBuahActivity::class.java)
            startActivity(intentMenu)
        }

        btnPnp.setOnClickListener() {
            val intentMenu = Intent(this@MainActivity, PnpActivity::class.java)
            startActivity(intentMenu)
        }
    }
}