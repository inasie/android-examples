package com.inasie.examples.model.utils

import android.util.Log

object Log {
    private const val TAG = "EXAMPLES"

    fun i(msg: String) {
        Log.i(TAG, getDecoratedLog(msg))
    }

    fun d(msg: String) {
        Log.d(TAG, getDecoratedLog(msg))
    }

    fun e(msg: String) {
        Log.e(TAG, getDecoratedLog(msg))
    }

    fun w(msg: String) {
        Log.w(TAG, getDecoratedLog(msg))
    }

    fun v(msg: String) {
        Log.v(TAG, getDecoratedLog(msg))
    }

    private fun getDecoratedLog(message: String): String {
        val ste = Thread.currentThread().stackTrace[4]
        val sb = StringBuilder()
        sb.append("[")
        sb.append(TAG)
        sb.append("][")
        sb.append(ste.fileName.replace(".kt", ""))
        sb.append("::")
        sb.append(ste.methodName)
        sb.append("] ")
        sb.append(message)
        return sb.toString()
    }
}