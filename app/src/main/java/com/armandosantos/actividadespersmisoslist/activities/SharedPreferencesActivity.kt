package com.armandosantos.actividadespersmisoslist.activities

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.armandosantos.actividadespersmisoslist.R
import com.armandosantos.actividadespersmisoslist.app.preferences
import kotlinx.android.synthetic.main.activity_shared_preferences.*

class SharedPreferencesActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_shared_preferences)

        buttonSave.setOnClickListener { setValuesSharedPreferences(); cleanEditTexts(); getValuesSharedPreferences() }
        getValuesSharedPreferences()

    }

    private fun getValuesSharedPreferences() {
        if (preferences.name.isNotEmpty() && preferences.age >= 0) {
            textViewSharedPreferences.text =
                "Welcome ${preferences.name},  your age is ${preferences.age}"
        } else {
            textViewSharedPreferences.text = "Welcome, Please save your name and your age"
        }
    }

    private fun setValuesSharedPreferences() {
        if (editTextName.text.toString().isNotEmpty() && editTextAge.text.toString().isNotEmpty()) {
            preferences.name = editTextName.text.toString()
            preferences.age = editTextAge.text.toString().toInt()
            Toast.makeText(this, "Values have been saved successfully", Toast.LENGTH_SHORT).show()
        } else {
            Toast.makeText(
                this,
                "Please fill de name and the age before saving",
                Toast.LENGTH_SHORT
            ).show()
        }
    }

    private fun cleanEditTexts() {
        editTextName.text.clear()
        editTextAge.text.clear()
    }
}
