package br.senai.sp.jandira.mytrips

import java.time.LocalDate

fun juntarDestinoEAno(destino:String,dataChegada:LocalDate):String {
    val ano=dataChegada.year
    return "$destino, $ano"
}

fun simplificarData(dataExtenso: LocalDate): String{
    val dia=dataExtenso.dayOfMonth.toString()
    val mes=dataExtenso.month.toString().substring(0..2)
    return "$dia - $mes"
}

fun formatarDataChegadaEDataPartida(dataChegada: LocalDate, dataPartida:LocalDate): String{
    val diaEntrada=dataChegada.dayOfMonth.toString()
    val mesEntrada=dataChegada.month.toString().substring(0..2)

    val diaSaida=dataPartida.dayOfMonth.toString()
    val mesSaida=dataPartida.month.toString().substring(0..2)

    return "$diaEntrada $mesEntrada - $diaSaida $mesSaida"
}