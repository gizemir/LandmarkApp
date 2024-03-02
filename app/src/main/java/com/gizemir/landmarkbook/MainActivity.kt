package com.gizemir.landmarkbook

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.gizemir.landmarkbook.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private  lateinit var landmarkList: ArrayList<Landmark>
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        landmarkList = ArrayList<Landmark>()
        val louvre = Landmark("Louvre Museum", "France", R.drawable.louvre)
        val sydney = Landmark("Sydney Opera House", "Australia", R.drawable.sydney)
        val giza = Landmark("Giza Pyramid", "Egypt", R.drawable.gize)
        val tajMahal = Landmark("Taj Mahal", "Indian", R.drawable.taj)
        landmarkList.add(louvre)
        landmarkList.add(sydney)
        landmarkList.add(giza)
        landmarkList.add(tajMahal)

        binding.recyclerView.layoutManager = LinearLayoutManager(this)
        val landmarkAdapter = LandmarkAdapter(landmarkList)
        binding.recyclerView.adapter = landmarkAdapter
    }
}