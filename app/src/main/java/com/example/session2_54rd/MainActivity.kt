package com.example.session2_54rd

import android.os.Bundle
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
//        val WeatherTitle: TextView? = null
//        var City:android.widget.TextView? = null
//        var temperature:android.widget.TextView? = null
//        var temperature_higtAndlow:android.widget.TextView? = null
//        var air_quality:android.widget.TextView? = null
//        val recyclerview_everytime: RecyclerView? = null
//        var recyclerview_everyday:RecyclerView? = null
//        val weatherDataList: List<WeatherData>? = null //資料儲存容器
//        val weathereverytimeadapter: WeatherEverytimeAdapter? = null
//        val weathereverydayadapter: WeatherEverydayAdapter? = null

    }
}