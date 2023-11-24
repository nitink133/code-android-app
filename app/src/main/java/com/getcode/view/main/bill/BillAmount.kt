package com.getcode.view.main.bill

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.rotate
import androidx.compose.ui.layout.layout
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.getcode.R
import com.getcode.util.nonScaledSp

@Composable
@Preview
fun BillAmount(modifier: Modifier = Modifier, text: String = "") {
    Box(modifier = modifier) {
        Row(
            modifier = Modifier
                .vertical()
                .rotate(-90f)
        ) {
            Image(
                modifier = Modifier
                    .padding(end = 10.dp)
                    .height(18.dp)
                    .width(18.dp)
                    .align(Alignment.CenterVertically),
                painter = painterResource(id = R.drawable.ic_kin_white),
                contentDescription = ""
            )
            Text(
                text = text,
                style = MaterialTheme.typography.h1.copy(
                    fontSize = 40.nonScaledSp
                )
            )
        }
    }
}

fun Modifier.vertical() =
    layout { measurable, constraints ->
        val placeable = measurable.measure(constraints)
        layout(placeable.height, placeable.width) {
            placeable.place(
                x = -(placeable.width / 2 - placeable.height / 2),
                y = -(placeable.height / 2 - placeable.width / 2)
            )
        }
    }