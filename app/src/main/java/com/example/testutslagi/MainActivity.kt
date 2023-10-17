package com.example.testutslagi

import android.graphics.Paint.Align
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.ElevatedCard
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ImageBitmap
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.layout.layout
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.font.FontWeight.Companion.Bold
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.testutslagi.ui.theme.TestUtsLagiTheme


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            TestUtsLagiTheme {
                val mataKuliah = listOf("Teori Bahasa dan Automata",
                    "Pengantar Kecerdasan Buatan",
                    "Mobile Computing ",
                    "Kewirausahaan",
                    "Komputer dan Masyarakat",
                    "Metode Penelitian",
                    "Data Mining",
                    "Animasi Komputer",
                    "STEM",
                    "Pengolahan Citra")

                val imgKuliah = listOf(R.drawable.p1,
                    R.drawable.p2,
                    R.drawable.p3,
                    R.drawable.p4,
                    R.drawable.p5,
                    R.drawable.p6,
                    R.drawable.p7,
                    R.drawable.p8,
                    R.drawable.p9,
                    R.drawable.p10
                )

                val sksKuliah = listOf("3", "3", "3", "2", "2", "2", "3", "3", "3", "3")

                Text(text = "Mata Kuliah 119",
                    fontSize = 20.sp,
                    fontWeight = FontWeight.Bold,
                    textAlign = TextAlign.Center,
                    modifier = Modifier.padding(10.dp)
                )

                LazyVerticalGrid(columns = GridCells.Adaptive(190.dp),
                    modifier = Modifier.padding(top = 50.dp),
                    content = {
                        items(10) { i ->
                            ElevatedCard(
                                elevation = CardDefaults.cardElevation(
                                    defaultElevation = 6.dp
                                ),
                                modifier = Modifier
                                    .height(230.dp)
                                    .padding(8.dp)
//                                    .aspectRatio(1F)
                                    .clip(RoundedCornerShape(8.dp))
//                                    .background(Color.White),
//                                contentAlignment = Alignment.Center
                            ) {

                                    Column(

                                    ){
                                        Image( painter = painterResource(imgKuliah[i]),
                                            contentDescription = "gambar",
                                            contentScale = ContentScale.Crop,
                                            modifier = Modifier
                                                .width(190.dp)
                                                .height(110.dp)
                                        )
                                        Text(text = mataKuliah[i],
                                            fontSize = 17.sp,
                                            fontWeight = FontWeight.Bold,
                                            lineHeight = 18.sp,
                                            modifier = Modifier
                                                .padding(bottom = 4.dp, top = 6.dp, start = 10.dp, end = 10.dp))

                                        Text(text = sksKuliah[i] + " SKS",
                                            modifier = Modifier
                                                .padding(start = 10.dp, end = 10.dp)
                                            )
                                    }



                            }
                        }
                    }
                )
            }

        }
    }


    @Composable
    fun Greeting(name: String, modifier: Modifier = Modifier) {
        Text(
            text = "Hello $name!",
            modifier = modifier
        )
    }

    @Preview(showBackground = true)
    @Composable
    fun GreetingPreview() {
        TestUtsLagiTheme {
            Greeting("Android")
        }
    }
}