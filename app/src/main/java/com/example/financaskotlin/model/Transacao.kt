package com.example.financaskotlin.model

import java.math.BigDecimal
import java.util.*

data class Transacao(val valor: BigDecimal,
                     val categoria: String = "Indefinida",
                     val tipo: Tipo,
                     val data: Calendar = Calendar.getInstance())