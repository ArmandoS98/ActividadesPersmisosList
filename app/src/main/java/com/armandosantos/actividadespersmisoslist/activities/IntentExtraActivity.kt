package com.armandosantos.actividadespersmisoslist.activities

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.widget.Toolbar
import com.armandosantos.actividadespersmisoslist.R
import com.armandosantos.actividadespersmisoslist.models.Student
import com.armandosantos.actividadespersmisoslist.others.ToolbarActivity
import kotlinx.android.synthetic.main.activity_intent_extra.*

class IntentExtraActivity : ToolbarActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_intent_extra)

        toolbarToLoad(toolbar as Toolbar)
        enableHomeDisplay(true)


        buttonBack.setOnClickListener { startActivity(Intent(this, IntentsActivity::class.java)) }
        val isExtraSet = setIntentExtrasFromPreviusActivity()
        val isParcelableSet = setParcelableExtraFromPreviusActivity()

        if (!isExtraSet && !isParcelableSet)
            checkBoxDeveloper.visibility = View.INVISIBLE

    }

    private fun setParcelableExtraFromPreviusActivity(): Boolean {
        val student = intent.getParcelableExtra<Student>("student")
        student?.let {
            textViewName.text = student.name
            textViewLastName.text = student.lastName
            textViewAge.text = "${student.age}"
            checkBoxDeveloper.text = "Developer"
            checkBoxDeveloper.isChecked = student.isDeveloper
            return true
        }

        return false
    }

    private fun setIntentExtrasFromPreviusActivity(): Boolean {
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
            return true
        }

        return false/* else {
            checkBoxDeveloper.visibility = View.INVISIBLE
        }*/
    }
}
