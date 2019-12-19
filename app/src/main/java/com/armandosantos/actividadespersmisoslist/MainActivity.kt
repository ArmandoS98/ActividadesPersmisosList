package com.armandosantos.actividadespersmisoslist

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.constraintlayout.widget.ConstraintLayout
import com.armandosantos.actividadespersmisoslist.activities.*
import com.google.android.material.snackbar.Snackbar

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnLifeCycle = findViewById<Button>(R.id.btn1)
        val btnClickEvents = findViewById<Button>(R.id.btn2)
        val btnAndroidExt = findViewById<Button>(R.id.btn3)
        val btnPicasso = findViewById<Button>(R.id.btn4)
        val btnListView = findViewById<Button>(R.id.btn5)
        val btnIntents = findViewById<Button>(R.id.btn6)
        val btnPermission = findViewById<Button>(R.id.btn7)
        val btnSharedPreferences = findViewById<Button>(R.id.btn8)
        val btnExtensionFunctions = findViewById<Button>(R.id.btn9)

        btnLifeCycle.setOnClickListener { goToLifeCycleActivity() }
        btnClickEvents.setOnClickListener { goToClickEventActivity() }
        btnAndroidExt.setOnClickListener { goToAndroidExtActivity() }
        btnPicasso.setOnClickListener { goToPicassoActivity() }
        btnListView.setOnClickListener { goToListViewActivity() }
        btnIntents.setOnClickListener { goToIntentsActivity() }
        btnPermission.setOnClickListener { goToPermissionsActivity() }
        btnSharedPreferences.setOnClickListener { goToSharedPreferencesActivity() }
        btnExtensionFunctions.setOnClickListener { goToAndroidExtActivity() }
    }

    fun showToast() {
        Toast.makeText(this, "Holis", Toast.LENGTH_LONG).show()
    }

    fun showSnackBar() {
        val layout = findViewById<ConstraintLayout>(R.id.contraint)
        Snackbar.make(layout, "Holis fro the SnackBar!", Snackbar.LENGTH_LONG).show()
        Snackbar.make(layout, "Holis fro the SnackBar!", Snackbar.LENGTH_LONG).setAction("UNDO") {
            Snackbar.make(layout, "Email has been restoresd", Snackbar.LENGTH_LONG).show()
        }.show()
    }

    private fun goToLifeCycleActivity() =
        startActivity(Intent(this, LifeCycleActivity::class.java))

    private fun goToClickEventActivity() =
        startActivity(Intent(this, ClickEventsActivity::class.java))

    private fun goToAndroidExtActivity() =
        startActivity(Intent(this, KotlinAndroidExtensionsActivity::class.java))

    private fun goToPicassoActivity() = startActivity(Intent(this, PicassoActivity::class.java))
    private fun goToListViewActivity() = startActivity(Intent(this, ListViewActivity::class.java))
    private fun goToIntentsActivity() = startActivity(Intent(this, IntentsActivity::class.java))
    private fun goToPermissionsActivity() =
        startActivity(Intent(this, PermissionsActivity::class.java))

    private fun goToSharedPreferencesActivity() =
        startActivity(Intent(this, SharedPreferencesActivity::class.java))

    private fun goToExtensionsFunctionsActivity() =
        startActivity(Intent(this, ExtensionFunctionsActivity::class.java))

}
