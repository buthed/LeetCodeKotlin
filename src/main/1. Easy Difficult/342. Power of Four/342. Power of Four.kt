import java.util.*

fun main(args: Array<String>) {
    val s1 : Int = 16
    val s2 : Int = 5
    val s3 : Int = 1
    val s4 : Int = 32
    val s5 : Int = 64
    val s6 : Int = 4
    val s7 : Int = 144
    val s8 : Int = 256
    val s9 : Int = 400
    println(isPowerOfFour(s1)) // Output: true
    println(isPowerOfFour(s2)) // Output: false
    println(isPowerOfFour(s3)) // Output: true
    println(isPowerOfFour(s4)) // Output: false
    println(isPowerOfFour(s5)) // Output: true
    println(isPowerOfFour(s6)) // Output: true
    println(isPowerOfFour(s7)) // Output: false
    println(isPowerOfFour(s8)) // Output: true
    println(isPowerOfFour(s9)) // Output: false
}

fun isPowerOfFour(n: Int): Boolean {
    return when (sqrt(n.toDouble())) {
        0.0 -> false
        1.0 -> true
        2.0 -> true
        else -> {
            if (sqrt(n.toDouble())%4 == 0.0) {
                return isPowerOfFour(n/4)
            } else {
                return false
            }
        }
    }
}