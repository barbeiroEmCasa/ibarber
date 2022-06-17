package com.paiva.components.maks

import android.text.Editable

import android.text.TextWatcher

import android.widget.EditText
import java.lang.Exception

object CpfMask {
    private const val maskCPF = "###.###.###-##"
    fun unmask(s: String): String {
        return s.replace("[^0-9]*".toRegex(), "")
    }

    fun insert(editText: EditText): TextWatcher {
        return object : TextWatcher {
            var isUpdating = false
            var old = ""
            override fun onTextChanged(s: CharSequence, start: Int, before: Int, count: Int) {
                val str = unmask(s.toString())
                val mask: String = maskCPF
                val defaultMask = getDefaultMask(str)

                var mascara = ""
                if (isUpdating) {
                    old = str
                    isUpdating = false
                    return
                }
                var i = 0
                for (m in mask.toCharArray()) {
                    if (m != '#' && str.length > old.length || m != '#' && str.length < old.length && str.length != i) {
                        mascara += m
                        continue
                    }
                    mascara += try {
                        str[i]
                    } catch (e: Exception) {
                        break
                    }
                    i++
                }
                isUpdating = true
                editText.setText(mascara)
                editText.setSelection(mascara.length)
            }

            override fun beforeTextChanged(
                s: CharSequence, start: Int, count: Int,
                after: Int
            ) {
            }

            override fun afterTextChanged(s: Editable) {}
        }
    }

    private fun getDefaultMask(str: String): String {
        return maskCPF
    }
}