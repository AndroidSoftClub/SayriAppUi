package com.example.kotlineproject.Adapter

import android.annotation.SuppressLint
import android.app.Activity
import android.content.Intent
import android.content.res.ColorStateList
import android.os.Build
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.LinearLayout
import android.widget.Toast
import androidx.annotation.RequiresApi
import androidx.recyclerview.widget.RecyclerView
import com.example.kotlineproject.Activity.AllSayriActivity
import com.example.kotlineproject.R

class RVCatAdapter(var activity: Activity, private var isMainPage: Boolean) :
    RecyclerView.Adapter<RecyclerView.ViewHolder>() {

    private var color_code = intArrayOf(activity.resources.getColor(R.color.one),
        activity.resources.getColor(R.color.one),
                activity.resources.getColor(R.color.two),
                activity.resources.getColor(R.color.three),
                activity.resources.getColor(R.color.four),
                activity.resources.getColor(R.color.five),
                activity.resources.getColor(R.color.six),
                activity.resources.getColor(R.color.seven))


    @RequiresApi(Build.VERSION_CODES.LOLLIPOP)
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        if (viewType == 0)
            return VH(LayoutInflater.from(parent.context)
                .inflate(R.layout.rv_catagory_layout,parent,false))
        else
            return VHSayri(LayoutInflater.from(parent.context)
                .inflate(R.layout.rv_sayri_layout,parent,false))

    }

    @SuppressLint("ResourceAsColor")
    @RequiresApi(Build.VERSION_CODES.LOLLIPOP)
    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        when(getItemViewType(position)){
            0->{
                val myVH:VH = holder as VH
                ColorStateList.valueOf(color_code[(color_code.indices).random()])
                    .also { myVH.ll_layout.backgroundTintList = it }
            }
            1->{

            }
        }
    }

    override fun getItemViewType(position: Int): Int {
        return if (isMainPage)
            0
        else
            1
    }
    override fun getItemCount(): Int {
        return 10
    }

    @SuppressLint("ResourceAsColor")
    @RequiresApi(Build.VERSION_CODES.LOLLIPOP)
    inner class VH(itemView: View) : RecyclerView.ViewHolder(itemView) {
         var ll_layout:LinearLayout = itemView.findViewById(R.id.llID)

        init {
            itemView.setOnClickListener {
                Log.d("FFM", "Click")
                activity.startActivity(Intent(activity, AllSayriActivity::class.java))
            }
        }
    }

    @SuppressLint("ResourceAsColor")
    @RequiresApi(Build.VERSION_CODES.LOLLIPOP)
    inner class VHSayri(itemView: View) : RecyclerView.ViewHolder(itemView) {
        init {
            itemView.setOnClickListener(View.OnClickListener {
                Log.d("FFM","Sayri Click")
            })
        }
    }
}