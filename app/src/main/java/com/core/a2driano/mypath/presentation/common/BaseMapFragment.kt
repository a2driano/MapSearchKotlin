package com.core.a2driano.mypath.presentation.common

import android.support.v4.app.Fragment
import com.core.a2driano.mypath.presentation.common.map.item.MapItemSearchListener
import com.google.android.gms.maps.MapView

open class BaseMapFragment : Fragment(), MapItemSearchListener {


    var mapViewBase: MapView? = null

    override fun onResume() {
        super.onResume()
        mapViewBase?.onResume()
    }

    override fun onDestroy() {
        mapViewBase?.onDestroy()
        super.onDestroy()
    }

    override fun onLowMemory() {
        super.onLowMemory()
        mapViewBase?.onLowMemory()
    }

    override fun getResults(searchParameters: CharSequence): List<String>? {
        return null
    }
}