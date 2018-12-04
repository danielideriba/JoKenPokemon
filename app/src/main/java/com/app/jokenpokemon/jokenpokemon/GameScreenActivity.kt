package com.app.jokenpokemon.jokenpokemon

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import kotlinx.android.synthetic.main.activity_game_screen.*

class GameScreenActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_game_screen)


        charizard.setOnClickListener({
            Log.i("TAG", "charizard")
        })

        venusaur.setOnClickListener({
            Log.i("TAG", "venu")
        })

        blastoise.setOnClickListener({
            Log.i("TAG", "blastoise")
        })



    }
}
