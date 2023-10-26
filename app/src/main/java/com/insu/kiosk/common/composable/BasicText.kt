package com.insu.kiosk.common.composable

import android.util.TypedValue
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.sp

@Composable
fun BasicText(text: String, fontWeight: FontWeight) {
    Text(
        text = text,
        fontSize = 12.sp,
        fontWeight = fontWeight,
        fontStyle = FontStyle.Italic
    )
}

@Composable
fun TitleText(text: String ,fontWeight: FontWeight) {
    Text(
        text = text,
        fontSize = 16.sp,
        fontWeight = fontWeight,
        fontStyle = FontStyle.Italic
    )
}