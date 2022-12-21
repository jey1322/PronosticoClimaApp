package com.codein.clima.ui.viewmodel

import android.widget.Toast
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.codein.clima.data.model.ClimaRpModel
import com.codein.clima.domain.GetClimaUseCase
import kotlinx.coroutines.launch

class ClimaViewModel : ViewModel(){

    val climaModel = MutableLiveData<ClimaRpModel>()

    var getClimaUseCase= GetClimaUseCase()

    fun onCreate(lat: Double, lon: Double) {
        viewModelScope.launch {
            val result = getClimaUseCase(lat, lon)
            if (result != null)
            {
                climaModel.postValue(result)
            }
            else
            {
                Toast.makeText(null, "Error", Toast.LENGTH_SHORT).show()
            }
        }
    }
}