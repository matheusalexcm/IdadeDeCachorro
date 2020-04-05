package com.tads.idadedecachorro

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_idade_cachorro.*
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button_idade.setOnClickListener {

            val idade_cachorro = edit_idade_cachorro.text.toString()

            val intent = Intent(applicationContext, IdadeHumanoActivity::class.java)

            intent.putExtra("idadeCachorro", idade_cachorro)

            startActivity(intent)
        }
    }
}
