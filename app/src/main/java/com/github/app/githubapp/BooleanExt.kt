package com.github.app.githubapp

fun main(args: Array<String>) {

    val result = if (getABoolean()) {
        1
    } else {
        2
    }

    val result2 = getABoolean().yes {
        1
    }.no {
        2
    }

    println("result2 = $result2")
}

fun getABoolean() = false

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
