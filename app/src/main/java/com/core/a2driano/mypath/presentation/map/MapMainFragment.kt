package com.core.a2driano.mypath.presentation.map


import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.core.a2driano.mypath.R
import com.core.a2driano.mypath.presentation.common.BaseMapFragment
import com.google.android.gms.maps.GoogleMap
import com.google.android.gms.maps.OnMapReadyCallback
import com.google.android.gms.maps.model.LatLng
import com.google.android.gms.maps.model.MarkerOptions
import kotlinx.android.synthetic.main.fragment_map.*


class MapMainFragment : BaseMapFragment(), OnMapReadyCallback {

    var map: GoogleMap? = null

    override fun onMapReady(googleMap: GoogleMap?) {
//        Toast.makeText(activity, "Map is load", Toast.LENGTH_LONG).show()


        map = googleMap
//        map?.addMarker(MarkerOptions().position(LatLng(10.0, 30.0)).title("Marker"))
        map?.addMarker(MarkerOptions().position(LatLng(0.0, 0.0)).title("Marker"))
        map?.uiSettings?.isZoomControlsEnabled = true

//        val geoApiContext = GeoApiContext.Builder()
//                .apiKey(getString(R.string.google_api_key))
//                .build()
//
//        // Needs to call MapsInitializer before doing any CameraUpdateFactory calls
//        try {
//            MapsInitializer.initialize(this.activity!!)
//        } catch (e: GooglePlayServicesNotAvailableException) {
//            e.printStackTrace()
//        }
//
//
//        // Updates the location and zoom of the MapView
//        val cameraUpdate = CameraUpdateFactory.newLatLngZoom(LatLng(43.1, -87.9), 10f)
//        map?.animateCamera(cameraUpdate)

    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_map, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        super.mapViewBase = mapView
        mapView.onCreate(savedInstanceState)
        mapView.getMapAsync(this)
    }

    companion object {
        fun newInstance() = MapMainFragment()
    }
}
