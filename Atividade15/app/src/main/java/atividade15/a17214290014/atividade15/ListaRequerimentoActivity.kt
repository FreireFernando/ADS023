package atividade15.a17114290044.atividade15

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ListView

class ListaRequerimentoActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_lista_requerimento)

        val requerimentos = arrayOf("Req 001", "Req 002", "Req 003", "Req 004")
        val adapter = ArrayAdapter(this, android.R.layout.simple_list_item_1, requerimentos)
        val listview = findViewById(R.id.listview) as ListView
        listview.setAdapter(adapter)
    }
}
