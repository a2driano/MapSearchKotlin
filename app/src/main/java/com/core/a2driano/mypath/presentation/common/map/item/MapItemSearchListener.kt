package com.core.a2driano.mypath.presentation.common.map.item

interface MapItemSearchListener {
    fun getResults(searchParameters: CharSequence): List<String>?
}