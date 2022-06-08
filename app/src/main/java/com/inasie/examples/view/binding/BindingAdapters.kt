package com.inasie.examples.view.binding

import androidx.databinding.BindingAdapter
import androidx.recyclerview.widget.RecyclerView
import com.inasie.examples.viewmodel.layout.ItemViewModelBase

object BindingAdapters {
    @JvmStatic
    @BindingAdapter("items")
    fun RecyclerView.items(items: List<ItemViewModelBase>) {
        if (adapter == null)
            adapter = ItemViewAdapter()
        (adapter as ItemViewAdapter).updateItems(items)
    }
}