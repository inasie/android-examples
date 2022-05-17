package com.inasie.examples.viewmodel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.inasie.examples.view.ViewType
import com.inasie.examples.viewmodel.activity.MainActivityViewModel

@Suppress("UNCHECKED_CAST")
class ViewModelFactory<ParamT>(
    private val viewType: ViewType,
    private val param: ParamT?
) : ViewModelProvider.Factory {
    override fun <ViewModelT : ViewModel> create(modelClass: Class<ViewModelT>): ViewModelT {
        return when (viewType) {
            ViewType.ACTIVITY_MAIN -> MainActivityViewModel() as ViewModelT
        }
    }
}
