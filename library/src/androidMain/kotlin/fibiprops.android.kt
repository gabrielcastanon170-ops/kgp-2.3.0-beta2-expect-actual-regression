package io.github.kotlin.fibonacci

actual val firstElement: Int = 1
actual val secondElement: Int = 2

@JvmInline
public actual value class SavedStateReader
@PublishedApi
internal actual constructor(val source: Int) {}