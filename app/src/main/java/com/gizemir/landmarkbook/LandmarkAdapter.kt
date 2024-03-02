package com.gizemir.landmarkbook

import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.gizemir.landmarkbook.databinding.ActivityDetailsBinding
import com.gizemir.landmarkbook.databinding.RecyclerRowBinding

class LandmarkAdapter(val landmarkList: ArrayList<Landmark>): RecyclerView.Adapter<LandmarkAdapter.LandmarkHolder>() {
    class LandmarkHolder(val binding: RecyclerRowBinding) :RecyclerView.ViewHolder(binding.root){

    }
//viewHolder oluşturulduğunda ne olacak. Oluşturduğumuz recycler_row layout'unu burada bağlayacağız
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): LandmarkHolder {
        val binding= RecyclerRowBinding.inflate(LayoutInflater.from(parent.context), parent, false)
    return LandmarkHolder(binding)
    }
//kaç tane veri oluşturacağız
    override fun getItemCount(): Int {

        return  landmarkList.size
    }
//hangi textte hangi veri olacak
    override fun onBindViewHolder(holder: LandmarkHolder, position: Int) {
        holder.binding.recyclerViewTextView.text = landmarkList.get(position).name

    holder.itemView.setOnClickListener{
        val intent = Intent(holder.itemView.context, DetailsActivity::class.java)
        intent.putExtra("landmark", landmarkList.get(position))
        holder.itemView.context.startActivity(intent)
    }
    }
}