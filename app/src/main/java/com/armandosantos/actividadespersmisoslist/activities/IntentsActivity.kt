package com.armandosantos.actividadespersmisoslist.activities

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.armandosantos.actividadespersmisoslist.R
import kotlinx.android.synthetic.main.activity_intents.*

class IntentsActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_intents)

        buttonIntentExtras.setOnClickListener { goIntentExtras() }
        buttonIntentFlags.setOnClickListener { goIntentFlags() }
        buttonIntentObject.setOnClickListener { goIntentObject() }
    }

    private fun goIntentExtras() {
        val intent = Intent(this, IntentExtraActivity::class.java)
        intent.putExtra("name", "Armando")
        intent.putExtra("lastname", "Santos")
        intent.putExtra("age", 21)
        intent.putExtra("developer", true)
        startActivity(intent)
    }

    private fun goIntentFlags() {
        val intent = Intent(this, IntentExtraActivity::class.java)
        intent.flags = Intent.FLAG_ACTIVITY_NO_HISTORY  // No guarda el activity en el stack
        startActivity(intent)
    }

    private fun goIntentObject() {
        val intent = Intent(this, IntentExtraActivity::class.java)
        startActivity(intent)
    }
}
