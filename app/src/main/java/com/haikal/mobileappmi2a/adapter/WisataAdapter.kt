package com.haikal.mobileappmi2a.adapter

import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.haikal.mobileappmi2a.DetailWisataActivity
import com.haikal.mobileappmi2a.R
import com.haikal.mobileappmi2a.RecycleBuahActivity
import com.haikal.mobileappmi2a.RecycleWisataHomePageActivity
import com.haikal.mobileappmi2a.WisataSplashActivity
import com.haikal.mobileappmi2a.model.ModelWisata

class WisataAdapter(
    val itemList : ArrayList<ModelWisata>,
    val getActivity: RecycleWisataHomePageActivity
) : RecyclerView.Adapter<WisataAdapter.MyViewHolder>() {

    class MyViewHolder(itemView : View): RecyclerView.ViewHolder(itemView) {
        var imgWisata : ImageView
        var txtWisataDestination : TextView
        var txtWisataCity : TextView
        var txtKet : TextView
        var txtWisataDetail : TextView

        init {
            imgWisata = itemView.findViewById(R.id.imgWisata) as ImageView
            txtWisataDestination = itemView.findViewById(R.id.txtWisataDestination) as TextView
            txtWisataCity = itemView.findViewById(R.id.txtWisataCity) as TextView
            txtKet = itemView.findViewById(R.id.txtWisataKet)
            txtWisataDetail = itemView.findViewById(R.id.txtWisataDetail) as TextView
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val nView = LayoutInflater.from(parent.context)
            .inflate(R.layout.list_item_recycle_wisata, parent, false)

        return MyViewHolder(nView)
    }

    override fun getItemCount(): Int {
        return itemList.size
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        holder.imgWisata.setImageResource(itemList[position].gambar)
        holder.txtWisataDestination.setText(itemList[position].destinasi)
        holder.txtWisataCity.setText(itemList[position].kota)
        holder.txtKet.setText(itemList[position].ket)
        holder.txtWisataDetail.setText(itemList[position].detail)

        holder.itemView.setOnClickListener() {
            val intent = Intent(getActivity, WisataSplashActivity::class.java)
            intent.putExtra("imgWisataSplash", itemList[position].gambar)
            intent.putExtra("txtWisataDestinasiSplash", itemList[position].destinasi)
            intent.putExtra("txtWisataKet", itemList[position].ket)
            intent.putExtra("txtWisataDetail", itemList[position].detail)

            getActivity.startActivity(intent)
        }
    }

}