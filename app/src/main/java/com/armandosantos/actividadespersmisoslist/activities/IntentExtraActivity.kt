package com.armandosantos.actividadespersmisoslist.activities

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.core.view.isVisible
import com.armandosantos.actividadespersmisoslist.R
import kotlinx.android.synthetic.main.activity_intent_extra.*

class IntentExtraActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_intent_extra)

        buttonBack.setOnClickListener { startActivity(Intent(this, IntentsActivity::class.java)) }
        getIntentExtrasFromPreviusActivity()
    }

    private fun getIntentExtrasFromPreviusActivity() {
        val name = intent.getStringExtra("name")
        val lastname = intent.getStringExtra("lastname")
        val age = intent.getIntExtra("age", -1)
        val developer = intent.getBooleanExtra("developer", false)

        if (name != null && lastname != null && age >= 0) {
            textViewName.text = name
            textViewLastName.text = lastname
            textViewAge.text = "$age"
            checkBoxDeveloper.text = "Developer"
            checkBoxDeveloper.isChecked = developer
        } else {
            checkBoxDeveloper.visibility = View.INVISIBLE
        }
    }
}
