package com.app.jokenpokemon.jokenpokemon

import android.support.v7.app.AppCompatActivity
import android.os.Bundle

class FormActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

//        etGasPrice.addTextChangedListener(DecimalTextWatcher(etGasPrice))
//        etEthanolPrice.addTextChangedListener(DecimalTextWatcher(etEthanolPrice))
//
//        etGasAverage.addTextChangedListener(DecimalTextWatcher(etGasAverage))
//
//        btCalculate.setOnClickListener({
//            val intent = Intent(this, ResultActivity::class.java)
//            intent.putExtra("GAS_PRICE", etGasPrice.text.toString().toDouble())
//            intent.putExtra("ETHANOL_PRICE", etEthanolPrice.text.toString().toDouble())
//            intent.putExtra("GAS_AVERAGE", etGasAverage.text.toString().toDouble())
//            intent.putExtra("ETHANOL_AVERAGE", etEthanolAverage.text.toString().toDouble())
//            startActivity(intent)
//        })
    }
}
