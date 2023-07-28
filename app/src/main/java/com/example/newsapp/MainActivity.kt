package com.example.newsapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import androidx.navigation.ui.setupWithNavController
import com.example.newsapp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView( this, R.layout.activity_main)


        //to connect our bottom navigation with our fragments
        binding.bottomNavigationView.setupWithNavController(binding.newsNavHostFragment.findNavController())
    }
}