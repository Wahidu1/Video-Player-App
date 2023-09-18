package com.example.videoplayer

import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.MediaController
import android.widget.VideoView

class MainActivity : AppCompatActivity() {

    private lateinit var videoView1: VideoView
    private lateinit var interVideo: VideoView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        videoView1 = findViewById(R.id.videoView1)
        interVideo = findViewById(R.id.videoView2)

        videoView1.setVideoPath("android.resource://"
        +packageName+"/"
                +R.raw.video)

        val mediaController = MediaController(this)

        mediaController.setAnchorView(videoView1)
        mediaController.setMediaPlayer(videoView1)
        videoView1.setMediaController(mediaController)



        //Internet Video

        val uri = Uri.parse("https://static.videezy.com/system/resources/previews/000/002/231/original/5226496.mp4")

        interVideo.setVideoURI(uri)
        val mediaController2 = MediaController(this)

        mediaController2.setAnchorView(interVideo)
        mediaController2.setMediaPlayer(interVideo)
        interVideo.setMediaController(mediaController2)
        interVideo.start()

    }
}