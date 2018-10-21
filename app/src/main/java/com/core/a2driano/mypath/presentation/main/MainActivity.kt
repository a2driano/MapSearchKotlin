package com.core.a2driano.mypath.presentation.main

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.core.a2driano.mypath.R
import com.core.a2driano.mypath.presentation.map.MapMainFragment
import com.core.a2driano.mypath.utils.replaceWithoutBackStack

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        supportFragmentManager.replaceWithoutBackStack(R.id.container, MapMainFragment.newInstance())
    }
}
