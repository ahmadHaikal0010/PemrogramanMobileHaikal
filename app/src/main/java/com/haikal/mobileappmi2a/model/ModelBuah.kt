package com.haikal.mobileappmi2a.model

import android.content.Context
import com.haikal.mobileappmi2a.R

data class ModelBuah(
    val image : Int,
    val nama : String,
    val lokasi : String,
    val deskripsi : String
)

// kita mock data untuk array
object Mocklist1 {
    fun getModel(context: Context) : List<ModelBuah> {
        val itemModel1 = ModelBuah(
            R.drawable.apple,
            "Apple",
            "Asia Tengah",
            context.getString(R.string.st_apel)
        )

        val itemModel2 = ModelBuah(
            R.drawable.grapes,
            "Anggur",
            "Timur Tengah",
            context.getString(R.string.st_anggur)
        )

        val itemModel3 = ModelBuah(
            R.drawable.orange,
            "Jeruk",
            "Tiongkok",
            context.getString(R.string.st_jeruk)
        )

        val itemModel4 = ModelBuah(
            R.drawable.pear,
            "Pir",
            "Eropa",
            context.getString(R.string.st_pir)
        )

        val itemModel5 = ModelBuah(
            R.drawable.strawberry,
            "Stroberi",
            "Eropa",
            context.getString(R.string.st_stroberi)
        )

        val itemModel6 = ModelBuah(
            R.drawable.orange,
            "Orange",
            "Myanmar",
            context.getString(R.string.st_jeruk)
        )

        val itemList: ArrayList<ModelBuah> = ArrayList()
        itemList.add(itemModel1)
        itemList.add(itemModel2)
        itemList.add(itemModel3)
        itemList.add(itemModel4)
        itemList.add(itemModel5)
        itemList.add(itemModel6)

        return itemList

    }
}