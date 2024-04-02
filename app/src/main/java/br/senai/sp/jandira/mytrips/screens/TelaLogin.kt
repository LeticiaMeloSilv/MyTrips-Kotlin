package br.senai.sp.jandira.mytrips.screens

import android.util.Log
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowForward
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.Lock
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonColors
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.OutlinedTextFieldDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.KeyboardCapitalization
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController

@Composable
fun Login(controleDeNavegacao: NavHostController) {
    var emailState= remember {
        mutableStateOf("")
    }
    var senhaState= remember {
        mutableStateOf("")
    }
    var isErrorState= remember {
        mutableStateOf(false)
    }
    var mensagemErroState= remember {
        mutableStateOf("")
    }
    Box(
        contentAlignment = Alignment.TopEnd,
        modifier = Modifier.fillMaxSize()
    ) {
        Box(
            modifier = Modifier
                .background(
                    Color(0xffCF06F0),
                    shape = RoundedCornerShape(bottomStart = 25.dp)
                )
                .height(40.dp)
                .width(120.dp)
        ) {

        }
    }
    Column(
        modifier = Modifier.padding(top = 160.dp, start = 16.dp)
    ) {
        Text(
            text = "Login",
            color = Color(0xffCF06F0),
            fontSize = 48.sp,
            fontWeight = FontWeight.Bold
        )
        Text(
            text = "Please sign in to continue.",
            color = Color(0xffA09C9C)
        )
        Column(
        ) {
            OutlinedTextField(
                value = emailState.value,
                onValueChange = {
                    Log.i("EMAIL", "VALOR: $it ")
                    emailState.value=it
                },
                isError = isErrorState.value,
                keyboardOptions = KeyboardOptions(
                    keyboardType = KeyboardType.Email,
                ),
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(end = 16.dp, top = 70.dp),
                label = { Text(text = "E-mail") },
                leadingIcon = {
                    Icon(
                        imageVector = Icons.Filled.Email,
                        contentDescription = "",
                        tint = Color(0xffCF06F0),
                    )


                },
                colors = OutlinedTextFieldDefaults
                    .colors(
                        unfocusedBorderColor = Color(0xffCF06F0),
                        focusedBorderColor = Color(0xffCF06F0),

                        )
            )
            OutlinedTextField(
                value = senhaState.value,
                onValueChange = {
                    Log.i("Senai", "VALOR: $it ")
                    senhaState.value=it
                },
                isError = isErrorState.value,

                keyboardOptions = KeyboardOptions(
                    keyboardType = KeyboardType.Password,
                    capitalization = KeyboardCapitalization.Sentences
                ),
                visualTransformation = PasswordVisualTransformation('*'),

                modifier = Modifier
                    .fillMaxWidth()
                    .padding(end = 16.dp, bottom = 16.dp, top = 16.dp),
                label = { Text(text = "Password") },
                leadingIcon = {
                    Icon(
                        imageVector = Icons.Filled.Lock,
                        contentDescription = "",
                        tint = Color(0xffCF06F0),
                    )
                },
                colors = OutlinedTextFieldDefaults
                    .colors(
                        unfocusedBorderColor = Color(0xffCF06F0),
                        focusedBorderColor = Color(0xffCF06F0),
                    )
            )
        }
        Text(text = mensagemErroState.value, color = Color.Red)

        Button(
            onClick = {
                if (emailState.value=="aluno" && senhaState.value=="1234"){
                //enviar para a tela home
                controleDeNavegacao.navigate("home")
            }
            else{
                isErrorState.value=true
                mensagemErroState.value="Usuario ou senha inválidos!"
            }},
            colors = ButtonDefaults
                .buttonColors(
                    containerColor = Color(0XFFCF06F0)
                ),
            modifier = Modifier
                .align(Alignment.End)
                .padding(bottom = 32.dp, end = 16.dp),
            shape = RoundedCornerShape(size = 8.dp)
        ) {
            Text(
                text = "SIGN IN",
                modifier = Modifier
                    .padding(12.dp)
            )
            Icon(
                imageVector = Icons.Filled.ArrowForward,
                contentDescription = "",
            )
        }
        Row(
            modifier = Modifier.align(Alignment.End)
        ) {

            Text(
                text = "Don’t have an account?",
                fontFamily = FontFamily.SansSerif,
                color = Color(0xFF141414),
                modifier = Modifier.clickable { controleDeNavegacao.navigate("signUp")},
                )
                Text(
                    text = "Sign up",
                    color = Color(0xffCF06F0),
                    fontWeight = FontWeight.Bold,
                    fontFamily = FontFamily.SansSerif,
                    modifier = Modifier
                        .clickable { controleDeNavegacao.navigate("signUp")}
                        .padding(end = 16.dp)

                    )
            }

    }
    Box(
        contentAlignment = Alignment.BottomStart,
        modifier = Modifier.fillMaxSize()
    ) {
        Box(
            modifier = Modifier
                .background(
                    Color(0xffCF06F0),
                    shape = RoundedCornerShape(topEnd = 25.dp)
                )
                .height(40.dp)
                .width(120.dp)
        ) {

        }
    }

}
