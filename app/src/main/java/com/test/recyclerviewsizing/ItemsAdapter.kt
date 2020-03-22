package com.test.recyclerviewsizing

import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.annotation.UiThread
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView

class ItemsAdapter : ListAdapter<ItemsAdapter.Item, ItemsAdapter.ViewHolder> {
    data class Item(val index: Int)

    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val itemTyped: TextView = itemView as TextView
    }

    private var itemsCreated = 0

    @Suppress("ConvertSecondaryConstructorToPrimary")
    constructor(): super(object : DiffUtil.ItemCallback<Item>() {
        override fun areItemsTheSame(oldItem: Item, newItem: Item): Boolean {
            return oldItem == newItem
        }

        override fun areContentsTheSame(oldItem: Item, newItem: Item): Boolean {
            return oldItem == newItem
        }
    })

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        itemsCreated++
        Log.i("ItemsAdapter", "onCreateViewHolder: items created = $itemsCreated")
        val view: View = LayoutInflater.from(parent.context).inflate(R.layout.recycler_item, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val item: Item = getItem(position)
        holder.itemTyped.text = item.index.toString()
    }

    @UiThread
    fun fillSelfWithItems() {
        submitList(List(1000) { index -> Item(index) })
    }
}