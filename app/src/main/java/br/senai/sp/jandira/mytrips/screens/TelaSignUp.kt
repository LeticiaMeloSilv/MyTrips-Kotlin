package br.senai.sp.jandira.mytrips.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column


import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AddAPhoto
import androidx.compose.material.icons.filled.Call
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.Lock
import androidx.compose.material.icons.filled.Person
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.Checkbox
import androidx.compose.material3.CheckboxDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.OutlinedTextFieldDefaults
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.KeyboardCapitalization
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import br.senai.sp.jandira.mytrips.R
import br.senai.sp.jandira.mytrips.model.Cadastro
import br.senai.sp.jandira.mytrips.repository.CadastroRepository
import br.senai.sp.jandira.mytrips.ui.theme.MyTripsTheme

@Composable
fun TelaSingUp(controleDeNavegacao: NavHostController) {
    MyTripsTheme {
        Surface {
            val cr = CadastroRepository(LocalContext.current)

            var nomeState = remember {
                mutableStateOf("")
            }

            var telefoneState = remember {
                mutableStateOf("")
            }

            var emailState = remember {
                mutableStateOf("")
            }

            var senhaState = remember {
                mutableStateOf("")
            }

            var checkState = remember {
                mutableStateOf(false)
            }

            var emailError = remember {
                mutableStateOf(false)
            }

            var is18Error = remember {
                mutableStateOf(false)
            }

            Box(
                contentAlignment = Alignment.TopEnd,
                modifier = Modifier.fillMaxWidth()
            ) {
                Box(
                    modifier = Modifier
                        .background(
                            color = Color(0xffCF06F0),
                            shape = RoundedCornerShape(bottomStart = 10.dp)
                        )
                        .size(height = 40.dp, width = 120.dp)


                )
            }

            Column(
                modifier = Modifier
                    .padding(top = 50.dp, start = 0.dp)
            ) {
                Text(
                    modifier = Modifier
                        .align(Alignment.CenterHorizontally),
                    color = Color(0xffCF06F0),
                    fontSize = 40.sp,
                    fontWeight = FontWeight.ExtraBold,
                    text = "Sign up"
                )

                Text(
                    modifier = Modifier.align(Alignment.CenterHorizontally),
                    color = Color(0xffA09C9C),
                    fontSize = 15.sp,
                    text = "Create a new account"
                )

                Card(
                    modifier = Modifier
                        .align(Alignment.CenterHorizontally)
                        .size(height = 120.dp, width = 100.dp)
                        .padding(top = 20.dp),
                    shape = CircleShape
                ) {
                    Image(
                        modifier = Modifier.size(height = 120.dp, width = 100.dp),
                        painter = painterResource(id = R.drawable.perfil), contentDescription = ""
                    )

                }
                    Icon(
                        modifier = Modifier
                            .offset(x = 198.dp, y = -30.dp)
                            .size(height = 30.dp, width = 30.dp),
                        imageVector = Icons.Filled.AddAPhoto,
                        contentDescription = "",
                        tint = Color(0xffCF06F0)
                    )

                Column(
                    modifier = Modifier
                        .fillMaxHeight()
                        .align(Alignment.CenterHorizontally)
                ) {
                    OutlinedTextField(
                        value = nomeState.value,
                        onValueChange = {
                            nomeState.value = it
                        },
                        modifier = Modifier
                            .size(width = 350.dp, height = 65.dp)
                            .padding(start = 20.dp, end = 10.dp),//padding(start = 42.dp),
                        label = { Text(text = "Username") },
                        leadingIcon = {
                            Icon(
                                imageVector = Icons.Filled.Person,
                                contentDescription = "",
                                tint = Color(0xffCF06F0)
                            )

                        },
                        colors = OutlinedTextFieldDefaults
                            .colors(
                                unfocusedBorderColor = Color(0xffCF06F0),
                            )

                    )

                    OutlinedTextField(
                        value = telefoneState.value,
                        onValueChange = {
                            telefoneState.value = it
                        },
                        keyboardOptions = KeyboardOptions(
                            keyboardType = KeyboardType.Phone
                        ),
                        modifier = Modifier
                            .size(width = 350.dp, height = 65.dp)
                            .padding(start = 20.dp, end = 10.dp),//padding(start = 42.dp),
                        label = { Text(text = "Telephone") },
                        leadingIcon = {
                            Icon(
                                imageVector = Icons.Filled.Call,
                                contentDescription = "",
                                tint = Color(0xffCF06F0)
                            )

                        },
                        colors = OutlinedTextFieldDefaults
                            .colors(
                                unfocusedBorderColor = Color(0xffCF06F0),
                            )

                    )
                    OutlinedTextField(
                        value = emailState.value,
                        onValueChange = {
                            emailState.value = it
                        },
                        keyboardOptions = KeyboardOptions(
                            keyboardType = KeyboardType.Email
                        ),
                        modifier = Modifier
                            .size(width = 350.dp, height = 65.dp)
                            .padding(start = 20.dp, end = 10.dp),//padding(start = 42.dp),
                        label = { Text(text = "E-mail") },
                        isError = emailError.value,
                        leadingIcon = {
                            Icon(
                                imageVector = Icons.Filled.Email,
                                contentDescription = "",
                                tint = Color(0xffCF06F0)
                            )

                        },
                        colors = OutlinedTextFieldDefaults
                            .colors(
                                unfocusedBorderColor = Color(0xffCF06F0),
                            )

                    )
                    OutlinedTextField(
                        value = senhaState.value,
                        onValueChange = {
                            senhaState.value = it
                        },
                        keyboardOptions = KeyboardOptions(
                            keyboardType = KeyboardType.NumberPassword,
                            capitalization = KeyboardCapitalization.Sentences
                        ),
                        visualTransformation = PasswordVisualTransformation(),
                        modifier = Modifier
                            .size(width = 350.dp, height = 65.dp)
                            .padding(start = 20.dp, end = 10.dp),//padding(start = 42.dp),
                        label = { Text(text = "Password") },
                        leadingIcon = {
                            Icon(
                                imageVector = Icons.Filled.Lock,
                                contentDescription = "",
                                tint = Color(0xffCF06F0)
                            )

                        },
                        colors = OutlinedTextFieldDefaults
                            .colors(
                                unfocusedBorderColor = Color(0xffCF06F0),
                            )

                    )

                    Row {
                        Checkbox(

                            checked = checkState.value, onCheckedChange = {
                                checkState.value = it
                            },
                            modifier = Modifier
                                .size(height = 40.dp, width = 30.dp)
                                .padding(40.dp),
                            colors = CheckboxDefaults.colors(
                                checkedColor = Color(0xffCF06F0),
                                uncheckedColor = Color(0xffCF06F0),
                                checkmarkColor = Color(0xffCF06F0)
                            )


                        )

                        Text(
                            modifier = Modifier.padding(top = 30.dp, start = 30.dp),
                            fontSize = 17.sp,
                            text = "Over 18?"
                        )


                    }

                    Button(
                        modifier = Modifier
                            .align(Alignment.CenterHorizontally)
                            .size(height = 80.dp, width = 330.dp)
                            .padding(top = 30.dp),
                        shape = RoundedCornerShape(10.dp),
                        colors = ButtonDefaults.buttonColors(
                            containerColor = Color(0xffCF06F0)
                        ),
                        onClick = {
                            val cadastrar = Cadastro(
                                nome = nomeState.value,
                                telefone = telefoneState.value,
                                email = emailState.value,
                                senha = senhaState.value,
                                is18 = checkState.value
                            )

                            if(emailState.value == ""){
                                emailError.value = true
                            }else{
                                cr.cadastrar(cadastrar = cadastrar)
                                controleDeNavegacao.navigate("login")
                            }
                        }
                    ) {
                        Text(
                            modifier = Modifier,
                            fontWeight = FontWeight.ExtraBold,
                            fontSize = 16.sp,
                            text = "CREATE ACCOUNT"
                        )
                    }

                    Row(
                        modifier = Modifier
                            .align(Alignment.End)
                            .padding(end = 30.dp, top = 10.dp)
                    ) {
                        Text(
                            modifier = Modifier,
                            color = Color(0xffA09C9C),
                            text = "Already have an account?"
                        )
                        Text(
                            modifier = Modifier.clickable { controleDeNavegacao.navigate("login") },
                            color = Color(0xffCF06F0),
                            fontWeight = FontWeight.ExtraBold,
                            text = "Sign in"
                        )
                    }

                    Box(
                        contentAlignment = Alignment.BottomStart,
                        modifier = Modifier
                            .fillMaxWidth()
                            .fillMaxHeight()
                    ) {
                        Box(
                            modifier = Modifier
                                .background(
                                    color = Color(0xffCF06F0),
                                    shape = RoundedCornerShape(topEnd = 10.dp)
                                )
                                .size(height = 40.dp, width = 120.dp)


                        )


                    }

                }

            }
        }
    }


}

@Preview()
@Composable
fun TelaSingUpPreview() {
    MyTripsTheme {
        Surface(
            modifier = Modifier.fillMaxSize()
        ) {
            //TelaSingUp(controleDeNavegacao)
        }
    }
}
