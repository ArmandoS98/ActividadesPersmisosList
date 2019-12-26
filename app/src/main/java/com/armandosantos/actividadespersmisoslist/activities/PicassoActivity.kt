package com.armandosantos.actividadespersmisoslist.activities

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.armandosantos.actividadespersmisoslist.R
import com.squareup.picasso.Callback
import com.squareup.picasso.Picasso
import kotlinx.android.synthetic.main.activity_picasso.*

class PicassoActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_picasso)

        btnLoader.setOnClickListener { loadImages() }
        Picasso.with(this).load("http://i.imgur.com/DvpvklR.png").fetch()
//        Picasso.with(this).load("https://i.imgur.com/uKnMvyp.jpg").fetch()

    }

    private fun loadImages() {
        Picasso.with(this)
            .load("http://i.imgur.com/DvpvklR.png")
            .resize(300, 300)
            .centerInside()
            .into(imageViewTop)

        /* Picasso.with(this)
             .load("https://i.imgur.com/uKnMvyp.jpg")
             .fit()
             .into(imageViewBottom)*/

        /*  Picasso.with(this)
              .load("https://i.imgur.com/uKnMvyp.jpg")
              .fit()
              .transform(CircleTransform())
              .into(imageViewBottom)*/

        val contexto: Context = this
        Picasso.with(this)
            .load("https://i.imgur.com/uKnMvyp.jpg")
            .fetch(object : Callback {
                override fun onSuccess() {
                    imageViewBottom.alpha = 0f
                    Picasso.with(contexto)
                        .load("https://i.imgur.com/uKnMvyp.jpg")
                        .fit()
                        .into(imageViewBottom)

                    imageViewBottom.animate().setDuration(500).alpha(1f).start()
                }

                override fun onError() {
                }

            })


    }
}
