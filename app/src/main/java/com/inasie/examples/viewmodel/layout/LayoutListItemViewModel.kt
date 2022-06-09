package com.inasie.examples.viewmodel.layout

import android.view.View
import com.inasie.examples.model.main.ExampleType
import com.inasie.examples.model.utils.IntentUtil
import com.inasie.examples.view.ItemViewType

class LayoutListItemViewModel(val type: ExampleType) : ItemViewModelBase(ItemViewType.LIST_ITEM) {
    fun onClicked(view: View) {
        IntentUtil.createExampleIntent(view.context, type)
    }
}