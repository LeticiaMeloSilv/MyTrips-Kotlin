package br.senai.sp.jandira.mytrips.screens

import android.util.Log
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.Lock
import androidx.compose.material.icons.filled.Person
import androidx.compose.material.icons.filled.Phone
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Checkbox
import androidx.compose.material3.CheckboxDefaults
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
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.KeyboardCapitalization
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import br.senai.sp.jandira.mytrips.R

@Composable
fun SignUp(controleDeNavegacao: NavHostController) {
    var emailState= remember {
        mutableStateOf("")
    }
    var senhaState= remember {
        mutableStateOf("")
    }
    var nomeState= remember {
        mutableStateOf("")
    }
    var numeroState= remember {
        mutableStateOf("")
    }
    var over18State= remember {
        mutableStateOf(false)
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
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier
            .fillMaxWidth()
            .padding(top = 60.dp)
    ) {
        Text(
            text = "Sign Up",
            color = Color(0xffCF06F0),
            fontSize = 32.sp,
            fontWeight = FontWeight.Bold
        )
        Text(
            text = "Create a new account",
            color = Color(0xffA09C9C),
            fontSize = 14.sp,
            modifier = Modifier.padding(bottom = 25.dp)
        )
        Card(
            modifier = Modifier
                .size(height = 100.dp, width = 100.dp),
            colors = CardDefaults
                .cardColors(containerColor = Color(0xFF123456)),
            shape = CircleShape
        ) {
            Image(
                painter = painterResource(id = R.drawable.perfil),
                contentDescription = "imagem de perfil",
                modifier = Modifier
                    .size(height = 100.dp, width = 100.dp)
            )
        }
        Image(
            painter = painterResource(id = R.drawable.adicionar_foto),
            contentDescription = "imagem de perfil",
            modifier = Modifier
                .offset(x = 32.dp, y = -26.dp)
                .size(height = 28.dp, width = 28.dp)
        )
        Column(
        ) {
            OutlinedTextField(
                value = nomeState.value,
                onValueChange = {
                    nomeState.value=it
                },
                keyboardOptions = KeyboardOptions(
                    keyboardType = KeyboardType.Text,
                    capitalization = KeyboardCapitalization.Sentences
                ),
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(start = 17.dp, end = 17.dp),
                label = { Text(text = "Username") },
                leadingIcon = {
                    Icon(
                        imageVector = Icons.Filled.Person,
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
                value = numeroState.value,
                onValueChange = {
                    numeroState.value=it
                },
                keyboardOptions = KeyboardOptions(
                    keyboardType = KeyboardType.Phone,
                ),
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(start = 17.dp, end = 17.dp),
                label = { Text(text = "Phone") },
                leadingIcon = {
                    Icon(
                        imageVector = Icons.Filled.Phone,
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
                value = emailState.value,
                onValueChange = {
                    emailState.value=it
                },
                keyboardOptions = KeyboardOptions(
                    keyboardType = KeyboardType.Email,
                ),
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(start = 17.dp, end = 17.dp),
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
                keyboardOptions = KeyboardOptions(
                    keyboardType = KeyboardType.Password,
                    capitalization = KeyboardCapitalization.Sentences
                ),
                visualTransformation = PasswordVisualTransformation('*'),
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(start = 17.dp, end = 17.dp),
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
        Row(
            verticalAlignment = Alignment.CenterVertically,
            modifier = Modifier
                .align(Alignment.Start)
                .padding(start = 20.dp, top = 20.dp)
        ) {
            Checkbox(
                checked = over18State.value,
                onCheckedChange = {
                    over18State.value = it
                },
                modifier = Modifier
                    .size(27.dp)
                    .padding(0.dp),
                colors = CheckboxDefaults.colors(
                    checkedColor = Color(0XFFCF06F0),
                    uncheckedColor = Color(0XFFCF06F0),
                    checkmarkColor = Color(0XFFCF06F0)

                )
            )

            Text(text = "Over 18?", modifier = Modifier.padding(start = 12.dp))
        }
        Button(
            onClick = { /*TODO*/ },
            colors = ButtonDefaults
                .buttonColors(
                    containerColor = Color(0XFFCF06F0)
                ),
            modifier = Modifier
                .fillMaxWidth()
                .padding(start = 26.dp, end = 16.dp, top = 26.dp, bottom = 30.dp),
            shape = RoundedCornerShape(size = 8.dp)
        ) {
            Text(
                text = "CREATE ACCOUNT",
                modifier = Modifier
                    .padding(12.dp)
            )
        }
        Row(
            modifier = Modifier.align(Alignment.End)
        ) {

                Text(
                    text = "Already have an account?",
                    fontFamily = FontFamily.SansSerif,
                    color = Color(0xFF141414),
                    modifier = Modifier.clickable { controleDeNavegacao.navigate("login")},

                )
                Text(
                    text = "Sign in",
                    color = Color(0xffCF06F0),
                    fontWeight = FontWeight.Bold,
                    fontFamily = FontFamily.SansSerif,
                    modifier = Modifier
                        .clickable { controleDeNavegacao.navigate("login")}
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
