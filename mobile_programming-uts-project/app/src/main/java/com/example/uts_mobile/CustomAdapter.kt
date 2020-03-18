package com.example.uts_mobile

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class CustomAdapter (val pendudukList: ArrayList<PendudukModel>): RecyclerView.Adapter<CustomAdapter.ViewHolder>() {

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val penduduk: PendudukModel=pendudukList[position]
        holder?.textViewID?.text = penduduk.id
        holder?.textViewName?.text = penduduk.name
        holder?.textViewTTL?.text = penduduk.ttl
        holder?.textViewHP?.text = penduduk.hp
        holder?.textViewAddress?.text = penduduk.address

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val v = LayoutInflater.from(parent?.context).inflate(R.layout.list_layout, parent, false)
        return  ViewHolder(v)

    }

    override fun getItemCount(): Int {
        return pendudukList.size
    }

    class  ViewHolder(itemView: View): RecyclerView.ViewHolder(itemView){

        val textViewID = itemView.findViewById(R.id.textViewId) as TextView
        val textViewName = itemView.findViewById(R.id.textViewName) as TextView
        val textViewTTL = itemView.findViewById(R.id.textViewTTL) as TextView
        val textViewHP = itemView.findViewById(R.id.textViewHP) as TextView
        val textViewAddress = itemView.findViewById(R.id.textViewAddress) as TextView
    }
}