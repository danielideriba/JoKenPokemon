package com.app.jokenpokemon.jokenpokemon

import android.annotation.TargetApi
import android.content.Context
import android.os.Build
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import kotlinx.android.synthetic.main.activity_game_screen.*
import java.util.*

class GameScreenActivity : AppCompatActivity() {

    @TargetApi(Build.VERSION_CODES.LOLLIPOP)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_game_screen)

        startGame(this)

        charizard.setOnClickListener({
            player1Container.setImageDrawable(getDrawable(R.drawable.img_fire))
            player1Container.setTag("img_fire")
            startGame(this)
            calcGame(player1Container.tag, cpuContainer.tag)
        })

        venusaur.setOnClickListener({
            player1Container.setImageDrawable(getDrawable(R.drawable.img_leaf))
            player1Container.setTag("img_leaf")
            startGame(this)
            calcGame(player1Container.tag, cpuContainer.tag)
        })

        blastoise.setOnClickListener({
            player1Container.setImageDrawable(getDrawable(R.drawable.img_water))
            player1Container.setTag("img_water")
            startGame(this)
            calcGame(player1Container.tag, cpuContainer.tag)
        })
    }

    private fun calcGame(tagPlayer: Any, tagCPU: Any) {
        Log.i("TAG", "--player-"+tagPlayer)
        Log.i("TAG", "--CPU-"+tagCPU)

        if(tagPlayer == "img_leaf" && tagCPU == "img_fire"){
        }

    }

    @TargetApi(Build.VERSION_CODES.LOLLIPOP)
    private fun startGame(context: Context){
        val elements = resources.getStringArray(R.array.elements_game)
        val randomStr = elements[Random().nextInt(elements.size)]
        val resID = resources.getIdentifier(randomStr, "drawable", packageName)
        cpuContainer.setImageDrawable(context.getDrawable(resID))
        cpuContainer.setTag(randomStr)
    }
}
