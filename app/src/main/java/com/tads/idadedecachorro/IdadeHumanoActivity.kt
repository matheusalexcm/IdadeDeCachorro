package com.tads.idadedecachorro

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_idade_cachorro.*

class IdadeHumanoActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_idade_cachorro)

        val dados: Bundle = intent.extras

        val idade_cachorro = dados.getString("idadeCachorro")

        text_idade_humano.text = descobrirIdadeHumano(idade_cachorro).toString()
    }

    fun descobrirIdadeHumano(idade_cachorro: String) : Int {

        val idade = idade_cachorro.toInt()

        val idade_humano = idade * 7

        return idade_humano
    }
}
