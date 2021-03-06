package com.example.youtube_project_inkotlin.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.recyclerview.widget.RecyclerView
import com.example.youtube_project_inkotlin.R
import com.example.youtube_project_inkotlin.model.Feed

class FeedAdapter(var context:Context, var items : ArrayList<Feed>) :
RecyclerView.Adapter<RecyclerView.ViewHolder>(){
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_feed_video,parent,false)
        return FeedViewHolder(view)
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        val video  = items[position]

        if (holder is FeedViewHolder) {
            var iv_profile = holder.iv_profile
            var iv_video = holder.iv_video
            iv_profile.setImageResource(video.profile)
            iv_video.setImageResource(video.photo)
        }
    }

    override fun getItemCount(): Int {
        return items.size
    }
}

class FeedViewHolder(view: View) : RecyclerView.ViewHolder(view) {
    var iv_profile : ImageView
    var iv_video : ImageView

    init {
        iv_profile = view.findViewById(R.id.iv_profile)
        iv_video = view.findViewById(R.id.iv_video)
    }
}
