package com.example.recyclerviewapp

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.rv_item.view.*

class TextoAdapter(val numeroDeItems : ArrayList<String>): RecyclerView.Adapter<RecyclerView.ViewHolder>(){


    // Infla la vista
    // Inflates the item views

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {

        return  ViewHolder(LayoutInflater.from(parent.context).inflate(R.layout.rv_item, parent, false))
    }

    // Obtiene el numero de textos en la lista
    // Gets the number of animals in the list

    override fun getItemCount(): Int {
        return numeroDeItems.size
    }

    // Binds (asocia) cada texto en el ArrayList a una vista
    // Binds each animal in the ArrayList to a view

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        holder.itemView.textView_Base.text = numeroDeItems[position]
    }

    }

class ViewHolder (view: View) : RecyclerView.ViewHolder(view){
    // Holds the TextView that will add each text to a view
    val textViewTipoTexto = view.textView_Base


}