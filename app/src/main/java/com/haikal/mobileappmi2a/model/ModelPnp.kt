package com.haikal.mobileappmi2a.model

import com.haikal.mobileappmi2a.R

data class ModelPnp(
    val image : Int,
    val image1 : Int
)

object Mocklist {
    fun getModel() : List<ModelPnp> {
        val itemModel1 = ModelPnp(
            R.drawable.pnp,
            R.drawable.pnp1
        )

        val itemModel2 = ModelPnp(
            R.drawable.pnp2,
            R.drawable.pnp3
        )

        val itemModel3 = ModelPnp(
            R.drawable.pnp4,
            R.drawable.pnp5
        )

        val itemModel4 = ModelPnp(
            R.drawable.pnp6,
            R.drawable.pnp7
        )

        val itemModel5 = ModelPnp(
            R.drawable.pnp8,
            R.drawable.pnp9
        )

        val itemModel6 = ModelPnp(
            R.drawable.pnp10,
            R.drawable.pnp11
        )


        val itemList: ArrayList<ModelPnp> = ArrayList()
        itemList.add(itemModel1)
        itemList.add(itemModel2)
        itemList.add(itemModel3)
        itemList.add(itemModel4)
        itemList.add(itemModel5)
        itemList.add(itemModel6)

        return itemList
    }
}
