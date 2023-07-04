package com.example.mymaps

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.mapbox.mapboxsdk.Mapbox
import com.mapbox.mapboxsdk.constants.Style
import com.mapbox.mapboxsdk.maps.MapView
import com.mapbox.mapboxsdk.maps.MapboxMap
import com.mapbox.mapboxsdk.maps.OnMapReadyCallback

class MapActivity : AppCompatActivity() {
    var mapview: MapView?= null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Mapbox.getInstance(this, "sk.eyJ1IjoicHJhZGVlcDkyIiwiYSI6ImNsam1kbGZtbDAwMjAzZXFtYWZxams5dXMifQ.PUGXLPNdBjuzxwCCBW9NuQ")

        setContentView(R.layout.activity_map)
        mapview=findViewById(R.id.mapview)
        mapview?.onCreate(savedInstanceState)
        mapview?.getMapAsync(mapReadyCallback)
    }
    private val mapReadyCallback = OnMapReadyCallback { mapboxMap ->
        // Perform map-related operations here
        mapboxMap.setStyle(Style.MAPBOX_STREETS)
    }

    // Other overridden methods such as onStart, onResume, etc.

    override fun onStart() {
        super.onStart()
        mapview?.onStart()
    }

    override fun onResume() {
        super.onResume()
        mapview?.onResume()
    }

    override fun onPause() {
        super.onPause()
        mapview?.onPause()
    }

    override fun onStop() {
        super.onStop()
        mapview?.onStop()
    }

    override fun onDestroy() {
        super.onDestroy()
        mapview?.onDestroy()
    }

    override fun onSaveInstanceState(outState: Bundle) {
        super.onSaveInstanceState(outState)
        mapview?.onSaveInstanceState(outState)
    }

    override fun onLowMemory() {
        super.onLowMemory()
        mapview?.onLowMemory()
    }

}


