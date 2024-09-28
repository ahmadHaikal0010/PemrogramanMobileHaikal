package com.haikal.mobileappmi2a.adapter

import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.view.menu.MenuView.ItemView
import androidx.recyclerview.widget.RecyclerView
import com.haikal.mobileappmi2a.DetailBuah
import com.haikal.mobileappmi2a.R
import com.haikal.mobileappmi2a.RecycleBuahActivity
import com.haikal.mobileappmi2a.model.ModelBuah

class BuahAdapter (
        val itemList: ArrayList<ModelBuah>,
        val getActivity: RecycleBuahActivity // untuk intent replace context, this
    ) : RecyclerView.Adapter<BuahAdapter.MyViewHolder>() {

    class MyViewHolder (itemView: View) : RecyclerView.ViewHolder(itemView) {
        var itemImage : ImageView
        var itemName : TextView

        init {
            itemImage = itemView.findViewById(R.id.gambar) as ImageView
            itemName = itemView.findViewById(R.id.nama) as TextView
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): BuahAdapter.MyViewHolder {
        // manggil layout
        val nView = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_recycle_images, parent, false)

        return MyViewHolder(nView)
    }

    override fun getItemCount(): Int {
        return itemList.size
    }

    override fun onBindViewHolder(holder: BuahAdapter.MyViewHolder, position: Int) {
        // set data ke widget
        holder.itemImage.setImageResource(itemList[position].image)
        holder.itemName.setText(itemList[position].nama)

        // kita tambahkan intent ke detail
        holder.itemView.setOnClickListener() {
            // context atau this, ganti getActivity
            val intent = Intent(getActivity, DetailBuah::class.java)
            // kita put data untuk kita passed ke detail
            intent.putExtra("image", itemList[position].image)
            intent.putExtra("nama", itemList[position].nama)
            // tambahkan put extra untuk lokasi dan deskripsi
            intent.putExtra("lokasi", itemList[position].lokasi)
            intent.putExtra("deskripsi", itemList[position].deskripsi)
            // passed ke detail
            getActivity.startActivity(intent)
        }
    }


}