package com.example.testutslagi

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.annotation.StringRes
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.grid.itemsIndexed
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
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.font.FontWeight.Companion.Bold
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.testutslagi.MataKuliahData.MataKuliah
import com.example.testutslagi.ui.theme.TestUtsLagiTheme
import javax.sql.DataSource




class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            TestUtsLagiTheme {

                val mataKuliah = listOf(stringResource(id =R.string.mataKuliah1 ) ,
                    stringResource(id =R.string.mataKuliah2 ) ,
                    stringResource(id =R.string.mataKuliah3 ) ,
                    stringResource(id =R.string.mataKuliah4 ) ,
                    stringResource(id =R.string.mataKuliah5 ) ,
                    stringResource(id =R.string.mataKuliah6 ) ,
                    stringResource(id =R.string.mataKuliah7 ) ,
                    stringResource(id =R.string.mataKuliah8 ) ,
                    stringResource(id =R.string.mataKuliah9 ) ,
                    stringResource(id =R.string.mataKuliah10 ) )

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

                val sksKuliah = listOf(
                    stringResource(id =R.string.sks1 ) ,
                    stringResource(id =R.string.sks2  ) ,
                    stringResource(id =R.string.sks3  ) ,
                    stringResource(id =R.string.sks4 ) ,
                    stringResource(id =R.string.sks5  ) ,
                    stringResource(id =R.string.sks6  ) ,
                    stringResource(id =R.string.sks7  ) ,
                    stringResource(id =R.string.sks8  ) ,
                    stringResource(id =R.string.sks9  ) ,
                    stringResource(id =R.string.sks10 )
                )

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
        }
    }
}