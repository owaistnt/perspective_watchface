package com.artsman.perspective

import android.content.Context
import androidx.core.content.ContextCompat

class ThemeConfigurationBuilder(val context: Context): IThemeConfigurationBuilder {
    override fun getThemeConfiguration(themes: SupportedThemes): ThemeConfiguration {
        return when(themes){
            else->{ getDefault()}
        }
    }

    fun getDefault(): ThemeConfiguration {
        return ThemeConfiguration(
            backgroundGradientPrimary =  context fromColor R.color.bg_gradient_top,
            backgroundGradientSecondary = context fromColor R.color.bg_gradient_bottom,
            handColor = context fromColor R.color.hand_color,
            handHighlightColor = context fromColor R.color.hand_color_seconds,
            handShadowColor = context fromColor R.color.hand_shadow_color,
            numberColor = context fromColor R.color.hand_color
        )
    }

    private infix fun Context.fromColor(colorRes: Int): Int {
        return ContextCompat.getColor(this, colorRes)
    }

}

interface IThemeConfigurationBuilder{
    fun getThemeConfiguration(themes: SupportedThemes): ThemeConfiguration
}

enum class SupportedThemes{
    default, grey
}