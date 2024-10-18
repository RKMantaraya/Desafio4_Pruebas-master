package com.desafiolatam.desafio4_pruebas

import android.content.pm.PackageManager
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.activity.result.contract.ActivityResultContracts
import androidx.core.app.ActivityCompat
import androidx.core.content.ContextCompat
import com.desafiolatam.desafio4_pruebas.databinding.ActivityMainBinding
import com.desafiolatam.desafio4_pruebas.viewAdapter.PageAdapter

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private lateinit var viewPagerAdapter: PageAdapter


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)


        viewPagerAdapter = PageAdapter(this)
        binding.viewPager.adapter = viewPagerAdapter

        binding.fab.setOnClickListener {
            when (binding.viewPager.currentItem) {
                0 -> binding.viewPager.setCurrentItem(1,true)
                1 -> binding.viewPager.setCurrentItem(2, true)
                2 -> binding.viewPager.setCurrentItem(0, true)
            }
        }
    }


}