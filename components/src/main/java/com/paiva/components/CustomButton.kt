package com.paiva.components

import android.content.Context
import android.graphics.Typeface
import android.graphics.fonts.Font
import android.util.AttributeSet
import androidx.appcompat.widget.AppCompatButton
import androidx.core.content.ContextCompat
import androidx.core.content.res.ResourcesCompat

class CustomButton : AppCompatButton {

    constructor(context: Context) : super(context) {
        init(context)
    }

    constructor(context: Context, attrs: AttributeSet?) : super(context, attrs) {
        init(context)
    }

    constructor(context: Context, attrs: AttributeSet?, defStyleAttr: Int) : super(
        context,
        attrs,
        defStyleAttr
    ) {
        init(context)
    }

    private fun init(context: Context) {
        background = ContextCompat.getDrawable(context, R.drawable.button_background)
        typeface = ResourcesCompat.getFont(context, R.font.balsamiq_sans_bold)
        setTextColor(ContextCompat.getColor(context, android.R.color.white))
    }
}