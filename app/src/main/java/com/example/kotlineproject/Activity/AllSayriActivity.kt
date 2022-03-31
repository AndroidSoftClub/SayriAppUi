package com.example.kotlineproject.Activity

import android.os.Bundle
import androidx.recyclerview.widget.DefaultItemAnimator
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.kotlineproject.Adapter.RVCatAdapter
import com.example.kotlineproject.databinding.ActivityAllSayriBinding
import com.example.kotlineproject.databinding.ActivityAllSayriBinding.inflate

class AllSayriActivity : BaseAct() {
    lateinit var adapter: RVCatAdapter
    lateinit var binding: ActivityAllSayriBinding;

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = inflate(layoutInflater);
        setContentView(binding.root)

        binding.rvSayriAllID.setHasFixedSize(true)
        binding.rvSayriAllID.layoutManager = LinearLayoutManager(
            this, LinearLayoutManager.VERTICAL,
            false
        )
        binding.rvSayriAllID.itemAnimator = DefaultItemAnimator()

        adapter = RVCatAdapter(this, false)
        binding.rvSayriAllID.adapter = adapter

        binding.backID.setOnClickListener {
            onBackPressed()
        }

    }
}