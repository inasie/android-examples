package com.inasie.examples.view.binding

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.inasie.examples.R
import com.inasie.examples.databinding.LayoutListItemBinding
import com.inasie.examples.view.ItemViewType
import com.inasie.examples.viewmodel.layout.ItemViewModelBase
import com.inasie.examples.viewmodel.layout.LayoutListItemViewModel

class ItemViewAdapter : RecyclerView.Adapter<RecyclerView.ViewHolder>() {

    private var viewModels = ArrayList<ItemViewModelBase>()

    fun updateItems(newItems: List<ItemViewModelBase>) {
        this.viewModels.clear()
        this.viewModels.addAll(newItems)
        notifyDataSetChanged()
    }

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int,
    ): RecyclerView.ViewHolder {
        return when (ItemViewType.fromOrdinal(viewType)) {
            ItemViewType.LIST_ITEM ->
                BindingViewHolder<LayoutListItemBinding>(
                    LayoutInflater.from(parent.context)
                        .inflate(R.layout.layout_list_item, parent, false)
                )
            else -> throw Exception("invalid itemViewType: $viewType")
        }
    }

    @Suppress("UNCHECKED_CAST")
    override fun onBindViewHolder(
        holder: RecyclerView.ViewHolder,
        position: Int,
    ) {
        val viewModel = viewModels[position]
        when (viewModel.itemViewType) {
            ItemViewType.LIST_ITEM ->
                (holder as BindingViewHolder<LayoutListItemBinding>).binding.viewModel =
                    viewModel as LayoutListItemViewModel
            else -> throw Exception("invalid itemViewType: ${viewModel.itemViewType}")
        }
    }

    override fun getItemCount(): Int {
        return viewModels.size
    }

    override fun getItemViewType(position: Int): Int {
        return viewModels[position].itemViewType.ordinal
    }
}