package com.iamageo.tablayout

import androidx.compose.runtime.Composable
import com.google.accompanist.pager.ExperimentalPagerApi
import com.google.accompanist.pager.HorizontalPager
import com.google.accompanist.pager.PagerState

@OptIn(ExperimentalPagerApi::class)
@Composable
fun MagicTabsContent(tabList: List<MagicTabItem>, pagerState: PagerState) {
    HorizontalPager(state = pagerState, count = tabList.size) { page ->
        tabList[page].screen()
    }
}