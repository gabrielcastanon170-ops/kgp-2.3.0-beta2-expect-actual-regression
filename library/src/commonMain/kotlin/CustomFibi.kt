package io.github.kotlin.fibonacci

import kotlin.jvm.JvmInline

fun generateFibi() = sequence {
    var a = firstElement
    yield(a)
    var b = secondElement
    yield(b)
    while (true) {
        val c = a + b
        yield(c)
        a = b
        b = c
    }
}

expect val firstElement: Int
expect val secondElement: Int

@JvmInline
public expect value class SavedStateReader
@PublishedApi
internal constructor(private val source: Int) {}