package com.example.rocketapp.adapters


import android.annotation.SuppressLint
import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.MotionEvent
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.cardview.widget.CardView
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.load.resource.bitmap.CenterCrop
import com.bumptech.glide.load.resource.bitmap.RoundedCorners
import com.example.rocketapp.R
import com.example.rocketapp.model.rocketsmodel
import com.example.rocketapp.ui.DetailActivity


class RocketsAdapters(
        private var spots: ArrayList<rocketsmodel.rocketsmodelItem>
) : RecyclerView.Adapter<RocketsAdapters.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        return ViewHolder(
                inflater.inflate(
                        R.layout.item_rocket,
                        parent,
                        false
                )
        )
    }


    override fun onBindViewHolder(holder: ViewHolder, position: Int) {

        val spot = spots[position]

        Glide.with(holder.photo.context)
              .load("https://cdn.mos.cms.futurecdn.net/2AFSP26rydXuKTuP7qjwbE-1024-80.jpg.webp")
                .transform(CenterCrop(), RoundedCorners(20))
                .into(holder.photo)

        holder.text.text = "Rocket Name : ${spot.rocketName}"
        holder.country.text = "Country : ${spot.country}"
        holder.firstFlight.text = "First Flight : ${spot.firstFlight}"

        holder.rocketDetail.setOnClickListener {
            val i = Intent(it.context,DetailActivity::class.java)
            i.putExtra("rocketName",spot.rocketİd)
            it.context.startActivity(i)

        }

    }

    override fun getItemCount(): Int {
        return spots.size
    }
    fun setSpots(spots: ArrayList<rocketsmodel.rocketsmodelItem>) {
        this.spots = spots
    }
    fun getSpots(): ArrayList<rocketsmodel.rocketsmodelItem> {
        return spots }

    class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        var photo : ImageView = view.findViewById(R.id.iconRocket)
        var text : TextView = view.findViewById(R.id.nameRocket)
        var country : TextView = view.findViewById(R.id.country)
        var firstFlight : TextView = view.findViewById(R.id.firstFlight)
        var rocketDetail : ConstraintLayout = view.findViewById(R.id.rocketDetail)

    }

}