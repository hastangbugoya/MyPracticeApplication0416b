package com.example.mypracticeapplication0416b

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import androidx.activity.viewModels
import com.example.mypracticeapplication0416b.databinding.ActivityMainBinding
import com.example.mypracticeapplication0416b.view.MainAdapter
import com.example.mypracticeapplication0416b.viewmodel.MyViewModel

class MainActivity : AppCompatActivity() {
    val myViewModel : MyViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val mainAdapter = MainAdapter()
        val binding = ActivityMainBinding.inflate(LayoutInflater.from(this))
        setContentView(binding.root)

        val mainRecycler = binding.mainRecyclerview
        mainRecycler.adapter = mainAdapter

        myViewModel.myData.observeForever() {
            Log.d("Meow","Changed ${myViewModel.myData.value?.joinToString("")}")
            mainAdapter.setData(myViewModel.myData.value ?: ArrayList())
        }

        myViewModel.getCoins()
    }
}