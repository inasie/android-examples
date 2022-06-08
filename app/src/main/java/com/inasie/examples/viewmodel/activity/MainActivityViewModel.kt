package com.inasie.examples.viewmodel.activity

import androidx.databinding.ObservableArrayList
import androidx.lifecycle.ViewModel
import com.inasie.examples.model.main.ExampleType
import com.inasie.examples.viewmodel.layout.ItemViewModelBase
import com.inasie.examples.viewmodel.layout.LayoutListItemViewModel

class MainActivityViewModel : ViewModel() {
    val items = ObservableArrayList<ItemViewModelBase>()

    init {
        initItems()
    }

    private fun initItems() {
        ExampleType.values().forEach {
            items.add(LayoutListItemViewModel(it))
        }
    }
}