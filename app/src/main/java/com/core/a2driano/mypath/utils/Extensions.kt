package com.core.a2driano.mypath.utils

import android.support.v4.app.Fragment
import android.support.v4.app.FragmentManager

fun FragmentManager.replaceWithoutBackStack(containerId: Int, fragment: Fragment) {
    beginTransaction()
            .add(containerId, fragment,fragment::class.java.simpleName)
            .commit()
}

fun FragmentManager.replaceWithBackStack(containerId: Int, fragment: Fragment) {
    beginTransaction()
            .add(containerId, fragment)
            .addToBackStack(fragment::class.java.simpleName)
            .commit()
}