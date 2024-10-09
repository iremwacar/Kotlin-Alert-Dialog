package com.irem.androidalertdiolog

import android.content.DialogInterface
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
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
        val alert = AlertDialog.Builder(this@MainActivity)
        alert.setTitle("Kayıt Et")
        alert.setMessage("Kayıt etmek istediğinize emin misiniz?")
        alert.setPositiveButton("Evet"){dialog,which->
            Toast.makeText(this@MainActivity,"KAyıt edildi",Toast.LENGTH_LONG).show()
        }

        alert.setNegativeButton("Hayır",object :DialogInterface.OnClickListener{
            override fun onClick(dialog: DialogInterface?, which: Int) {
                Toast.makeText(this@MainActivity,"Kayıt iptal edildi!",Toast.LENGTH_LONG).show()
            }
        })
        alert.show()
    }
}