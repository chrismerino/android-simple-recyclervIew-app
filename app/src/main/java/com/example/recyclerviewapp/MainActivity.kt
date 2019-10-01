package com.example.recyclerviewapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import java.util.ArrayList

class MainActivity : AppCompatActivity() {


    // Crear un ArrayList para ser llenado


    val textos = ArrayList<String>()
    private lateinit var recyclerViewList: RecyclerView
    private lateinit var layout : RecyclerView.LayoutManager
    private lateinit var varAdapter: TextoAdapter





    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        recyclerViewList = findViewById(R.id.recycler_view_lista)
        layout = LinearLayoutManager(this)

        varAdapter = TextoAdapter(arrayListOf())

        for (i in 1..1000){
            textos.add(i.toString())
        }


        recyclerViewList.layoutManager = layout
        recyclerViewList.adapter = TextoAdapter(textos)


    }

}
