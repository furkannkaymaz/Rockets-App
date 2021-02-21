package com.example.rocketapp.ui

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.bumptech.glide.Glide
import com.bumptech.glide.load.resource.bitmap.CenterCrop
import com.bumptech.glide.load.resource.bitmap.RoundedCorners
import com.example.rocketapp.R
import com.example.rocketapp.adapters.RocketsAdapters
import com.example.rocketapp.databinding.ActivityDetailBinding
import com.example.rocketapp.databinding.ActivityMainBinding
import com.example.rocketapp.managers.ServiceManager

class DetailActivity : AppCompatActivity() {

    private lateinit var binding: ActivityDetailBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDetailBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)



        ServiceManager().oneRocket(intent.getStringExtra("rocketName")!!,
                {

                    Glide.with(this)
                            .load("https://cdn.mos.cms.futurecdn.net/2AFSP26rydXuKTuP7qjwbE-1024-80.jpg.webp")
                            .transform(CenterCrop(), RoundedCorners(20))
                            .into(binding.rocketImage)
                    binding.rocketDesc.text = it.description
                    binding.rocketName.text = it.rocketName
                    binding.rocketCompany.text =   "${it.company}"
                    binding.rocketDiameter.text =  "${it.diameter}"
                    binding.rocketfirstStage.text =  "${it.height}"

                },
                {
                }
        )


    }
}