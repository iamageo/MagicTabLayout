package com.iamageo.tablayout

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color

typealias ComposableFun = @Composable () -> Unit

data class MagicTabItem(
    var icon: Int,
    var iconColor: Color,
    var title: String,
    var screen: ComposableFun
)
