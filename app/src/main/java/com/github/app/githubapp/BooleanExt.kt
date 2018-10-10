package com.github.app.githubapp

sealed class BooleanExt<out T>

object Otherwise : BooleanExt<Nothing>()
class WithData<T>(val data: T) : BooleanExt<T>()

inline fun <T> Boolean.yes(block: () -> T) =
        if (this) {
            WithData(block())
        } else {
            Otherwise
        }

inline fun <T> BooleanExt<T>.no(block: () -> T): T =
        when (this) {
            is WithData -> data
            is Otherwise -> block()
        }
