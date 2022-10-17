package com.BaltazarSegura.LuisDavid

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.BaltazarSegura.LuisDavid.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    private lateinit var musicListrecycle: RecyclerView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)
        setRecyclerView()

    }

    private fun setRecyclerView() {
        musicListrecycle = binding.musicList
        musicListrecycle.layoutManager = LinearLayoutManager(this)
        val music = MusicRepository()
        val musiclistadapter = MusicListAdpter(music.musics)
        musicListrecycle.adapter = musiclistadapter

    }

}










