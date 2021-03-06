package test

import kotlin.test.assertTrue

fun <T : Number> assertBetween(expectedFloor: T, expectedCeiling: T, actual: T): Unit
{
    val floor = expectedFloor.toDouble()
    val ceiling = expectedCeiling.toDouble()
    val test = actual.toDouble()

    return assertTrue(((floor <= test) && (test <= ceiling)), "$actual is not between $expectedFloor and $expectedCeiling.")
}