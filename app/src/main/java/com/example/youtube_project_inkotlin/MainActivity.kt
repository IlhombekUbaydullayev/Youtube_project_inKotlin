package com.example.youtube_project_inkotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.youtube_project_inkotlin.adapter.FeedAdapter
import com.example.youtube_project_inkotlin.adapter.FilterAdapter
import com.example.youtube_project_inkotlin.model.Feed
import com.example.youtube_project_inkotlin.model.Filter

class MainActivity : AppCompatActivity() {
    lateinit var recyclerFeed: RecyclerView
    lateinit var recyclerFilter: RecyclerView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        initViews()
    }

    private fun initViews() {
        recyclerFilter = findViewById(R.id.recyclerFilter)
        recyclerFilter.layoutManager = LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL,false)
        recyclerFeed = findViewById(R.id.recyclerFeed)
        recyclerFeed.layoutManager = GridLayoutManager(this,1)

        refreshFilterAdapter(getAllFilters())
        refreshFeedAdapter(getAllFeeds())
    }

    private fun getAllFilters(): ArrayList<Filter> {
        val chats : ArrayList<Filter> = ArrayList()
        chats.add(Filter("Ilhombek"))
        chats.add(Filter("Abdumajid"))
        chats.add(Filter("Bek"))
        chats.add(Filter("Bek"))
        chats.add(Filter("Bek"))
        chats.add(Filter("Bek"))

        return chats
    }

    private fun getAllFeeds(): ArrayList<Feed> {
        val feed : ArrayList<Feed> = ArrayList()
        feed.add(Feed(R.drawable.img25,R.drawable.img24))
        feed.add(Feed(R.drawable.img25,R.drawable.img24))
        feed.add(Feed(R.drawable.img25,R.drawable.img24))
        feed.add(Feed(R.drawable.img25,R.drawable.img24))
        return feed
    }

    private fun refreshFeedAdapter(feed: ArrayList<Feed>) {
        val adapter = FeedAdapter(this,feed)
        recyclerFeed.adapter = adapter
    }

    private fun refreshFilterAdapter(chats: ArrayList<Filter>) {
        val adapter = FilterAdapter(this,chats)
        recyclerFilter.adapter = adapter
    }
}