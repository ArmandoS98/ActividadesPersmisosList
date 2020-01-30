package com.armandosantos.actividadespersmisoslist.activities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.armandosantos.actividadespersmisoslist.MainActivity
import com.armandosantos.actividadespersmisoslist.R
import com.armandosantos.actividadespersmisoslist.others.goToActivity
import com.armandosantos.actividadespersmisoslist.others.loadByURL
import com.armandosantos.actividadespersmisoslist.others.snackBar
import com.armandosantos.actividadespersmisoslist.others.toast
import kotlinx.android.synthetic.main.activity_extension_functions.*

class ExtensionFunctionsActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_extension_functions)

        buttonToast.setOnClickListener { toast("Holis") }
        buttonSnackbar.setOnClickListener {
            snackBar(
                "snackbar",
                action = "Undo"
            ) { toast("Undo!") }
        }
        buttonLoadByUrl.setOnClickListener { imageViewLoadedByUrl.loadByURL("https://miro.medium.com/max/3600/1*Ajz1oL-4B-_SOxgq_w8lRA.png") }
        buttonGoToActivity.setOnClickListener { goToActivity<MainActivity>() }
    }
}
