package com.otaliastudios.firestore

import android.util.Log
import timber.log.Timber

object FirestoreLogger {

    const val VERBOSE = Log.VERBOSE
    const val INFO = Log.INFO
    const val WARN = Log.WARN
    const val ERROR = Log.ERROR

    private var level = ERROR

    fun setLevel(level: Int) {
        this.level = level
    }

    internal fun w(message: () -> String) {
        if (level <= WARN) Timber.w(message())
    }

    internal fun w(throwable: Throwable, message: () -> String) {
        if (level <= WARN) Timber.w(throwable, message())
    }

    internal fun e(message: () -> String) {
        if (level <= ERROR) Timber.e(message())
    }

    internal fun e(throwable: Throwable, message: () -> String) {
        if (level <= ERROR) Timber.e(throwable, message())
    }

    internal fun i(message: () -> String) {
        if (level <= INFO) Timber.i(message())
    }

    internal fun i(throwable: Throwable, message: String) {
        if (level <= INFO) Timber.i(throwable, message)
    }

    internal fun v(message: () -> String) {
        if (level <= VERBOSE) Timber.v(message())
    }

    internal fun v(throwable: Throwable, message: () -> String) {
        if (level <= VERBOSE) Timber.v(throwable, message())
    }
}