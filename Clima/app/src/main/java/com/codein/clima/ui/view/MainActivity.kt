package com.codein.clima.ui.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.activity.viewModels
import androidx.lifecycle.Observer
import com.codein.clima.R
import com.codein.clima.databinding.ActivityMainBinding
import com.codein.clima.ui.viewmodel.ClimaViewModel

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private val climaViewModel : ClimaViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        climaViewModel.onCreate(37.8267, -122.4233)

        climaViewModel.climaModel.observe(this, Observer {
            binding.lon.text = it.coord.lon.toString()
            binding.lat.text = it.coord.lat.toString()
            binding.temp.text = it.main.temp.toString()
            binding.main.text = it.weather[0].main
            binding.description.text = it.weather[0].description
            binding.feelsLike.text = it.main.feels_like.toString()
            binding.tempMin.text = it.main.temp_min.toString()
            binding.tempMax.text = it.main.temp_max.toString()
            binding.pressure.text = it.main.pressure.toString()
            binding.humedity.text = it.main.humidity.toString()
        })

    }
}