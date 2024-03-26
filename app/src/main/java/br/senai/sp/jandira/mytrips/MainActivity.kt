package br.senai.sp.jandira.mytrips

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowForward
import androidx.compose.material.icons.filled.BeachAccess
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.Landscape
import androidx.compose.material.icons.filled.LocationOn
import androidx.compose.material.icons.filled.Lock
import androidx.compose.material.icons.filled.Person
import androidx.compose.material.icons.filled.Phone
import androidx.compose.material.icons.filled.Search
import androidx.compose.material.icons.filled.Skateboarding
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.OutlinedTextFieldDefaults
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TextFieldColors
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.BiasAlignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import br.senai.sp.jandira.mytrips.ui.theme.MyTripsTheme
import org.intellij.lang.annotations.JdkConstants.HorizontalAlignment

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MyTripsTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Login()
                    SignUp()
                    Home()
                }
            }
        }
    }
}

@Composable
fun Login() {
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
                value = "",
                onValueChange = {},
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
                value = "",
                onValueChange = {},
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
        Button(
            onClick = { /*TODO*/ },
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
                fontFamily = FontFamily.SansSerif
            )
            Text(
                text = "Sign up",
                color = Color(0xffCF06F0),
                fontWeight = FontWeight.Bold,
                fontFamily = FontFamily.SansSerif,
                modifier = Modifier.padding(end = 16.dp)
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

@Composable
fun SignUp() {
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
                value = "",
                onValueChange = {},
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
                value = "",
                onValueChange = {},
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
                value = "",
                onValueChange = {},
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
                value = "",
                onValueChange = {},
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
            modifier = Modifier
                .align(Alignment.Start)
                .padding(start = 20.dp, top = 20.dp)
        ) {
            Button(
                onClick = { /*TODO*/ },
                shape = RectangleShape,
                modifier = Modifier
                    .size(27.dp)
                    .border(1.dp, Color(0xffCF06F0))
                    .padding(0.dp),
                colors = ButtonDefaults.buttonColors(
                    containerColor = Color.Transparent,
                )
            ) {
            }
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
                fontFamily = FontFamily.SansSerif
            )
            Text(
                text = "Sign in",
                color = Color(0xffCF06F0),
                fontWeight = FontWeight.Bold,
                fontFamily = FontFamily.SansSerif,
                modifier = Modifier.padding(end = 16.dp)
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

@Composable
fun Home() {

    Image(
        painter = painterResource(id = R.drawable.paris),
        contentDescription = "Imagem da torre eifel-Paris",
        modifier = Modifier
            .fillMaxWidth()
            .height(200.dp),
        contentScale = ContentScale.Crop
    )
    Column {
        Column(
            horizontalAlignment = Alignment.End,
            modifier = Modifier
                .fillMaxWidth()
                .padding(20.dp)
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
                items(3) {
                    Card(
                        colors = CardDefaults.cardColors(containerColor = Color(0xffCF06F0)),
                        modifier = Modifier.padding(4.dp)
                    ) {
                        Icon(
                            imageVector = Icons.Default.Landscape, contentDescription = "",
                            tint = Color.White,
                            modifier = Modifier
                                .height(32.dp)
                                .padding(top = 6.dp, start = 45.dp, end = 45.dp)
                        )
                        Text(
                            text = "Montain",
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
                value = "",
                onValueChange = {},
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
                        text = "Search your destiny", color = Color(0xffA09C9C)
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
                items(2) {
                    Card(
                        colors = CardDefaults.cardColors(
                            containerColor = Color.White,
                        ),
                        modifier = Modifier.padding(6.dp)

                    ) {
                        Image(
                            painter = painterResource(id = R.drawable.londres),
                            contentDescription = "Imagem de Londres",
                            modifier = Modifier
                                .fillMaxWidth()
                                .height(100.dp),
                            contentScale = ContentScale.Crop

                        )
                        Text(
                            text = "London, 2019",
                            color = Color(0xffCF06F0),
                            modifier = Modifier.padding(5.dp)
                        )
                        Text(
                            text = "London is the capital and largest city of  the United Kingdom," +
                                    " with a population of just under 9 million.",
                            color = Color(0xffA09C9C),
                            fontSize = 13.sp,
                            lineHeight = 13.sp,
                            modifier = Modifier.padding(5.dp)
                        )
                        Text(
                            text = "18 Feb - 21 Feb",
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


@Preview(showBackground = true, showSystemUi = true)
@Composable
fun LoginPreview() {
    MyTripsTheme {
        Login()
    }
}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun HomePreview() {
    MyTripsTheme {
        Home()
    }
}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun SignUpPreview() {
    MyTripsTheme {
        SignUp()
    }
}