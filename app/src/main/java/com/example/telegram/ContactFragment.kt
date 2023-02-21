package com.example.telegram

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.telegram.databinding.ActivityMainBinding
import com.example.telegram.databinding.FragmentContactBinding

class ContactFragment: AppCompatActivity() {
    private lateinit var binding: FragmentContactBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = FragmentContactBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
    }