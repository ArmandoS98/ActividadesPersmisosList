package com.armandosantos.actividadespersmisoslist.activities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.armandosantos.actividadespersmisoslist.R
import com.armandosantos.actividadespersmisoslist.adapters.PersonAdapter
import com.armandosantos.actividadespersmisoslist.models.Person
import kotlinx.android.synthetic.main.activity_list_view.*

class ListViewActivity : AppCompatActivity() {

    private lateinit var adapter: PersonAdapter
    private lateinit var personList: List<Person>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_list_view)
        personList = getPersons()
        adapter = PersonAdapter(this, R.layout.list_view_person, personList)
        listView.adapter = adapter
    }

    private fun getPersons(): List<Person> {
        return listOf(
            Person("Armando", "Santos", 21),
            Person("Emmanuel", "Coy", 21),
            Person("Armando", "Santos", 21),
            Person("Emmanuel", "Coy", 21),
            Person("Armando", "Santos", 21),
            Person("Emmanuel", "Coy", 21),
            Person("Armando", "Santos", 21),
            Person("Emmanuel", "Coy", 21),
            Person("Armando", "Santos", 21),
            Person("Emmanuel", "Coy", 21),
            Person("Armando", "Santos", 21),
            Person("Emmanuel", "Coy", 21),
            Person("Armando", "Santos", 21),
            Person("Emmanuel", "Coy", 21),
            Person("Armando", "Santos", 21),
            Person("Emmanuel", "Coy", 21),
            Person("Armando", "Santos", 21),
            Person("Emmanuel", "Coy", 21),
            Person("Armando", "Santos", 21),
            Person("Emmanuel", "Coy", 21),
            Person("Armando", "Santos", 21),
            Person("Emmanuel", "Coy", 21),
            Person("Armando", "Santos", 21),
            Person("Emmanuel", "Coy", 21),
            Person("Armando", "Santos", 21),
            Person("Emmanuel", "Coy", 21),
            Person("Armando", "Santos", 21),
            Person("Emmanuel", "Coy", 21),
            Person("Armando", "Santos", 21),
            Person("Emmanuel", "Coy", 21)
        )
    }
}
