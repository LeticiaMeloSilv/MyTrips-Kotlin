package br.senai.sp.jandira.mytrips.model

import androidx.compose.ui.graphics.painter.Painter
import java.time.LocalDate
data class Trips(
    var id:Int=0,
    var destino:String="",
    var dataChegada:LocalDate=LocalDate.now(),
    var dataPartida:LocalDate= LocalDate.now(),
    var descricao:String="",
    var imagem:Painter?=null
)
