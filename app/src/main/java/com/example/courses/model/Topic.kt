package com.example.courses.model

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes

data class Topic(
    @StringRes val stringResource: Int,
    val numberOfListeners: Int,
    @DrawableRes val imageResource: Int,
)