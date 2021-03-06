package dev.jorgecastillo.androidcolorx

import android.content.ClipData
import android.content.ClipboardManager
import android.content.Context
import android.widget.Toast

fun Context.copyToClipboard(text: String) {
    val clipboardService = getSystemService(Context.CLIPBOARD_SERVICE) as ClipboardManager
    val clip = ClipData.newPlainText("Color generated by AndroidColorX app", text)
    clipboardService.setPrimaryClip(clip)
    Toast.makeText(this, R.string.feedback_copy_to_clipboard, Toast.LENGTH_SHORT).show()
}
