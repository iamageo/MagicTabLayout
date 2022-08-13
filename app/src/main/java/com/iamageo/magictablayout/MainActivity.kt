package com.iamageo.magictablayout

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.Scaffold
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import com.google.accompanist.pager.ExperimentalPagerApi
import com.iamageo.magictablayout.ui.theme.MagicTabLayoutTheme
import com.iamageo.tablayout.MagicTabItem
import com.iamageo.tablayout.MagicTabLayout

@ExperimentalPagerApi
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MagicTabLayoutTheme {

                val tabs = listOf(
                    MagicTabItem(R.drawable.ic_baseline_home_24, Color.Black, "Home") { TabItemTest("tab1") },
                    MagicTabItem(R.drawable.ic_baseline_star_24, Color.Black, "Favorites") { TabItemTest(item = "tab2") },
                    MagicTabItem(R.drawable.ic_baseline_star_24, Color.Black, "Settings") { TabItemTest(item = "tab3") },
                )

                Scaffold() {
                    Column() {
                        MagicTabLayout(
                            tabIndicatorColor = Color.Blue,
                            tabList = tabs,
                        )
                    }
                }

            }
        }
    }
}

@Composable
fun TabItemTest(item: String) {
    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(
            text = item,
            color = Color.Black,
        )
    }
}
