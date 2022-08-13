package com.iamageo.tablayout

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import com.google.accompanist.pager.ExperimentalPagerApi
import com.google.accompanist.pager.rememberPagerState

@ExperimentalPagerApi
@Composable
fun MagicTabLayout(
    modifier: Modifier = Modifier,
    tabList: List<MagicTabItem>,
    tabColor: Color = Color.White,
    tabIndicatorColor: Color = Color.Blue,
) {

    val pagerState = rememberPagerState(pageCount = tabList.size)

    Column(
        modifier = modifier.background(tabColor)
    ) {
        MagicTabs(pagerState = pagerState, tabList = tabList, indicatorColor = tabIndicatorColor)
        MagicTabsContent(pagerState = pagerState, tabList = tabList)
    }

}
