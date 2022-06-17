package com.paiva.components

import android.content.Context
import android.text.InputType
import android.util.AttributeSet

import android.view.LayoutInflater
import android.view.View
import android.widget.EditText
import android.widget.TextView
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.core.content.ContextCompat
import com.paiva.components.maks.CpfMask


class CustomEditText : ConstraintLayout {
    lateinit var view: View
    lateinit var editText: EditText
    lateinit var editTextTitle: TextView
    lateinit var containerEditText: ConstraintLayout
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
        view =
            LayoutInflater.from(context).inflate(R.layout.view_custom_edit_text, this, true)

        editText = view.findViewById(R.id.customEditText)
        editTextTitle = view.findViewById(R.id.editTextTitle)
        containerEditText = view.findViewById(R.id.containerEditText)

        configListener()

    }

    private fun configListener() {
        editText.setOnFocusChangeListener { view, hasFocus ->
            var drawableToShow = if (hasFocus) R.drawable.edit_text_selected else R.drawable.edit_text_unselected
            containerEditText.background = ContextCompat.getDrawable(context, drawableToShow )
        }
    }

    fun getStringText(): String {
        return editText.text.toString()
    }

    fun setEditTextTitle(title: String) {
       editTextTitle.text = title
   }

    fun setKeyboardType(inputType: Int) {
        editText.inputType = inputType
    }

    fun setUpMaskCpf() {
        editText.addTextChangedListener(CpfMask.insert(editText))
    }
}