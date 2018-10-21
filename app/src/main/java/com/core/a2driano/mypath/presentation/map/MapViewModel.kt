package com.core.a2driano.mypath.presentation.map

import android.databinding.BaseObservable
import android.databinding.Bindable

class MapViewModel(
        var _canAddPoint: Boolean = true
) : BaseObservable(), ContractMap.ViewModelContract {

    var canAddPoint: Boolean
        @Bindable
        get() = _canAddPoint
        set(value) {
            _canAddPoint = value
//            notifyPropertyChanged(BR.canAddPoint)
        }


    override fun AddPoint() {

    }

    override fun RemovePoint() {

    }

}