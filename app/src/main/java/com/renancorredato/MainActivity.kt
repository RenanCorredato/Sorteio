package com.renancorredato

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.renancorredato.databinding.ActivityMainBinding
import java.util.*

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btPlay.setOnClickListener {
            drawNumber()
        }


    }

    fun drawNumber(){
        val textChoose = binding.tvSelectingNumber
        val drawNumberRandom = Random().nextInt(11)
        textChoose.text = "Número sorteado é : $drawNumberRandom"
    }
}