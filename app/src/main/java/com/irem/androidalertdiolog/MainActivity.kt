package com.irem.androidalertdiolog

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import com.irem.androidalertdiolog.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        Toast.makeText(this@MainActivity,"Hoşgeldiniz", Toast.LENGTH_SHORT).show()

        /*
        binding.button.setOnClickListener(object : View.OnClickListener {
            override fun onClick(v: View?) {
                println("butona tıklandı")

            }
        })

         */
    }

    fun kaydet(view: View){

    }
}