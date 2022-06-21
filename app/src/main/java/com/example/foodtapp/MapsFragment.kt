package com.example.foodtapp

import androidx.fragment.app.Fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.google.android.gms.maps.GoogleMap
import com.google.android.gms.maps.OnMapReadyCallback

import kotlinx.android.synthetic.main.fragment_maps.*

class MapsFragment : Fragment() ,OnMapReadyCallback {

        private lateinit var googleMap : GoogleMap

        override fun onCreate(savedInstanceState: Bundle?){
            super.onCreate(savedInstanceState)
            map_view.onCreate(savedInstanceState)
            map_view.onResume()
            map_view.getMapAsync(this)

        }
        override fun onMapReady(map: GoogleMap) {
            map.let{
                googleMap = it
            }

        }


    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_maps, container, false)
    }

}