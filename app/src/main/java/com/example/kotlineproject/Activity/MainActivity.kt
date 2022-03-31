package com.example.kotlineproject.Activity

import android.os.Bundle
import android.os.Handler
import android.util.Log
import androidx.recyclerview.widget.*
import com.example.kotlineproject.Adapter.RVCatAdapter
import com.example.kotlineproject.databinding.ActivityMainBinding

class MainActivity() : BaseAct() {
    lateinit var adapter: RVCatAdapter
    lateinit var biding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        biding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(biding.root)

        biding.rvmainID.setHasFixedSize(true)
        biding.rvmainID.layoutManager = GridLayoutManager(
            this, 2, GridLayoutManager.VERTICAL,
            false
        )
        biding.rvmainID.itemAnimator = DefaultItemAnimator()

        adapter = RVCatAdapter(this, true)
        biding.rvmainID.adapter = adapter

        biding.backID.setOnClickListener {
            val handler = Handler(mainLooper)
            handler.postDelayed(Runnable { Log.d("FFM", "Yess") }, 1500)
        }

    }
}
