package com.example.rocketapp.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import androidx.recyclerview.widget.LinearLayoutManager
import com.ddtech.ddverifier.managers.Globals
import com.example.rocketapp.adapters.RocketsAdapters
import com.example.rocketapp.databinding.ActivityMainBinding
import com.example.rocketapp.managers.ServiceManager
import com.example.rocketapp.model.rocketsmodel

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        binding.recycView.layoutManager = LinearLayoutManager(
            this,
            LinearLayoutManager.VERTICAL,
            false)


        binding.recycView.adapter = RocketsAdapters(Globals.shared.StoredData!!)


    }
}