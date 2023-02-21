package com.example.telegram

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.telegram.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val adapter=ViewPagerAdapter(supportFragmentManager)
        adapter.addFragment(FirstFragment(),"Личный")
        adapter.addFragment(SecondFragment(),"Группы")
        adapter.addFragment(ThirdFragment(),"Каналы")
        adapter.addFragment(FourthFragment(),"Новый")
        adapter.addFragment(FifthFragment(),"Боты")
        binding.viewPager.adapter = adapter
        binding.tbLayout.setupWithViewPager(binding.viewPager)

        binding.apply {
            fabButton.setOnClickListener {
                val intent = Intent(this@MainActivity, ContactFragment::class.java)
                startActivity(intent)
            }
        }
    }
}