package br.senai.sp.jandira.mytrips.screens

import android.util.Log
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ImageNotSupported
import androidx.compose.material.icons.filled.Landscape
import androidx.compose.material.icons.filled.LocationOn
import androidx.compose.material.icons.filled.Search
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.OutlinedTextFieldDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.KeyboardCapitalization
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import br.senai.sp.jandira.mytrips.R
import br.senai.sp.jandira.mytrips.formatarDataChegadaEDataPartida
import br.senai.sp.jandira.mytrips.repository.CategoriesRepository
import br.senai.sp.jandira.mytrips.repository.TripsRepository
import br.senai.sp.jandira.mytrips.simplificarData

@Composable
fun Home(controleDeNavegacao: NavHostController) {
    val viagens = TripsRepository().listarTodasAsViagens()
    val categorias = CategoriesRepository().listarTodasAsCategorias()

    var pesquisaState = remember {
        mutableStateOf("")
    }
    Box(
        modifier = Modifier
            .fillMaxWidth()
            .height(200.dp),
    ) {
        Image(
            painter = painterResource(id = R.drawable.paris),
            contentDescription = "Imagem da torre eifel-Paris",
            contentScale = ContentScale.Crop,
            modifier = Modifier
                .fillMaxWidth()
        )
    }
    Column {
        Column(
            horizontalAlignment = Alignment.End,
            modifier = Modifier
                .fillMaxWidth()
                .padding(28.dp)
        ) {
            Image(
                painter = painterResource(id = R.drawable.perfil_susana),
                contentDescription = "Imagem de perfil do usuario",
                modifier = Modifier.size(60.dp)
            )
            Text(text = "Susanna Hoffs", color = Color.White)
        }
        Column(
            modifier = Modifier
                .padding(top = 10.dp, start = 32.dp)
        ) {
            Row {
                Icon(
                    imageVector = Icons.Default.LocationOn,
                    contentDescription = "",
                    tint = Color.White
                )
                Text(text = "You're in Paris", color = Color.White)
            }
            Text(
                text = "My Trips",
                fontWeight = FontWeight.Bold,
                fontSize = 24.sp,
                color = Color.White
            )
        }

        Column(modifier = Modifier.padding(start = 16.dp)) {

            Text(text = "Categories", modifier = Modifier.padding(top = 20.dp, bottom = 6.dp))
            LazyRow() {
                items(categorias) {
                    Card(
                        colors = CardDefaults.cardColors(containerColor = Color(0xffCF06F0)),
                        modifier = Modifier.padding(4.dp)
                    ) {
                        Icon(
                            imageVector =
                            if (it.icon == null)
                                Icons.Default.ImageNotSupported
                            else
                                it.icon!!,
                            contentDescription = "",
                            tint = Color.White,
                            modifier = Modifier
                                .height(32.dp)
                                .padding(top = 6.dp, start = 45.dp, end = 45.dp)
                        )
                        Text(
                            text = it.descricaoIcon,
                            color = Color.White,
                            modifier = Modifier.padding(
                                bottom = 6.dp,
                                start = 25.dp,
                                end = 25.dp
                            )
                        )

                    }
                }
            }
            OutlinedTextField(
                value = pesquisaState.value,
                onValueChange = {
                    Log.i("Senai", "VALOR: $it ")
                    pesquisaState.value = it
                },
                keyboardOptions = KeyboardOptions(
                    keyboardType = KeyboardType.Text,
                    capitalization = KeyboardCapitalization.Sentences
                ),
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(top = 12.dp, end = 20.dp),
                shape = RoundedCornerShape(size = 16.dp),
                colors = OutlinedTextFieldDefaults
                    .colors(
                        unfocusedBorderColor = Color.Transparent,
                        focusedBorderColor = Color.Transparent,
                        focusedContainerColor = Color.White,
                        unfocusedContainerColor = Color.White


                    ),
                placeholder = {
                    Text(
                        text = "Search your destiny",
                        color = Color(0xffA09C9C),

                        )
                },
                trailingIcon = {
                    IconButton(onClick = { /*TODO*/ }) {
                        Icon(
                            imageVector = Icons.Default.Search, contentDescription = "",
                            tint = Color(0xffA09C9C)
                        )
                    }
                },
            )

            Text(
                text = "Past Trips",
                modifier = Modifier.padding(5.dp)
            )
            LazyColumn() {
                items(viagens) {
                    Card(
                        colors = CardDefaults.cardColors(
                            containerColor = Color.White,
                        ),
                        modifier = Modifier.padding(6.dp)

                    ) {
                        Image(
                            painter =
                            if (it.imagem == null)
                                painterResource(id = R.drawable.padrao)
                            else
                                it.imagem!!,
                            contentDescription = "",
                            modifier = Modifier
                                .fillMaxWidth()
                                .height(100.dp),
                            contentScale = ContentScale.Crop

                        )
                        Text(
                            text = "${it.destino}, ${it.dataChegada.year}",
                            color = Color(0xffCF06F0),
                            modifier = Modifier.padding(5.dp)
                        )
                        Text(
                            text = it.descricao,
                            color = Color(0xffA09C9C),
                            fontSize = 13.sp,
                            lineHeight = 13.sp,
                            modifier = Modifier.padding(5.dp)
                        )
                        Text(
                            text = formatarDataChegadaEDataPartida(it.dataChegada, it.dataPartida),
                            color = Color(0xffCF06F0),
                            fontSize = 13.sp,
                            modifier = Modifier
                                .align(alignment = Alignment.End)
                                .padding(6.dp)
                        )
                    }
                }
            }

        }
    }
}
