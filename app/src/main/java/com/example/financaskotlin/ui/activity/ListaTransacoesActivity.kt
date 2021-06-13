package com.example.financaskotlin.ui.activity

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.financaskotlin.R
import com.example.financaskotlin.model.Tipo
import com.example.financaskotlin.model.Transacao
import com.example.financaskotlin.ui.adapter.ListaTransacoesAdapter
import kotlinx.android.synthetic.main.activity_lista_transacoes.*
import java.math.BigDecimal
import java.util.*

class ListaTransacoesActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_lista_transacoes)

        val transacoes: List<Transacao> = transacoesDeExemplo()

        configuraLista(transacoes)
    }

    private fun configuraLista(transacoes: List<Transacao>) {
        lista_transacoes_listview.adapter = ListaTransacoesAdapter(transacoes, this)
    }

    private fun transacoesDeExemplo(): List<Transacao> {
        return listOf(
            Transacao(
                valor = BigDecimal(100.5),
                "Almoço de final de semana",
                Tipo.DESPESA,
                Calendar.getInstance()
            ),
            Transacao(
                valor = BigDecimal(40.5),
                categoria = "Economia",
                tipo = Tipo.RECEITA,
                data = Calendar.getInstance()
            ),
            Transacao(
                BigDecimal(200.0),
                tipo = Tipo.DESPESA
            ),
            Transacao(
                valor = BigDecimal(300.5),
                tipo = Tipo.RECEITA,
                categoria = "Salário"
            )
        )
    }

}