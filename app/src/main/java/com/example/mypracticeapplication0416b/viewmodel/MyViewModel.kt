package com.example.mypracticeapplication0416b.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.mypracticeapplication0416b.data.BitcoinItem
import com.example.mypracticeapplication0416b.network.MyRetrofit
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext

class MyViewModel : ViewModel() {
    val myData = MutableLiveData<ArrayList<BitcoinItem>>()

    fun getCoins() {
        viewModelScope.launch(Dispatchers.IO) {
            myData.postValue(
                withContext(Dispatchers.IO) {
                    MyRetrofit.getService().getAllCoins().body()
                }
            )
        }
    }
}
