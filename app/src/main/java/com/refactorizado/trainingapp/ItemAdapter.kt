package com.refactorizado.trainingapp

import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import kotlinx.android.synthetic.main.view_item.view.*

class ItemAdapter(val items: List<Item>, val listener: (Item) -> Unit) : RecyclerView.Adapter<ItemAdapter.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder(parent.inflate(R.layout.view_item))
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        with(holder.itemView){
            val item = items[position]
            tv_title.text = item.title
            img_main.loadUrl(item.url)
            setOnClickListener { listener(item) }
        }
    }

    override fun getItemCount() = items.size


    class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {

    }

}