package com.inasie.examples.viewmodel.layout

import android.view.View
import com.inasie.examples.model.main.ExampleType
import com.inasie.examples.model.utils.IntentUtil
import com.inasie.examples.view.ItemViewType
import com.inasie.examples.view.activity.BindingActivity
import com.inasie.examples.view.activity.ElevationActivity
import com.inasie.examples.view.activity.MenuActivity

class LayoutListItemViewModel(val type: ExampleType) : ItemViewModelBase(ItemViewType.LIST_ITEM) {
    fun onClicked(view: View) {
        when (type) {
            ExampleType.SELECT_EFFECT -> {}
            ExampleType.ELEVATION -> IntentUtil.createIntent(view.context, ElevationActivity::class.java)
            ExampleType.DATA_BINDING -> IntentUtil.createIntent(view.context, BindingActivity::class.java)
            ExampleType.MENU -> IntentUtil.createIntent(view.context, MenuActivity::class.java)
        }
    }
}