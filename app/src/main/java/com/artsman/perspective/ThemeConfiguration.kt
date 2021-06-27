package com.artsman.perspective

data class ThemeConfiguration(
    val backgroundGradientPrimary: Int,
    val backgroundGradientSecondary: Int,
    var handColor: Int = 0,
    val handHighlightColor: Int = 0,
    val handShadowColor: Int = 0,
    val numberColor: Int=0
) {

}