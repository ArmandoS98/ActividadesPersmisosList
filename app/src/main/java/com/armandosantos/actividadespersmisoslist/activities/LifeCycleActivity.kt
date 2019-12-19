package com.armandosantos.actividadespersmisoslist.activities

import android.os.Bundle
import android.os.Handler
import android.widget.Toast
import com.armandosantos.actividadespersmisoslist.R

class LifeCycleActivity : LifeCycleEventsActivity() {

    private var exitEnabled = false

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_live_circle)
    }

    override fun onBackPressed() {
        if (exitEnabled) {
            super.onBackPressed()
        }

        exitEnabled = true
        Toast.makeText(this, "Click back again to exit this screen", Toast.LENGTH_SHORT).show()

        Handler().postDelayed(Runnable { exitEnabled = false }, 2000)
    }
}
