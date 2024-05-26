
@file:Suppress("TYPE_INFERENCE_ONLY_INPUT_TYPES_WARNING")

import java.util.Collections.swap

fun main(args: Array<String>) {
    val s1 = charArrayOf('h','e','l','l','o')
    val s2 = charArrayOf('H','a','n','n','a','h')
    val s3 = charArrayOf('h','e','l','p')

    println(reverseString(s1)) // Output: ["o","l","l","e","h"]
    println(reverseString(s2)) // Output: ["H","a","n","n","a","h"]
    println(reverseString(s3)) // Output: ["p","l","e","h"]
}

fun reverseString(s: CharArray): Unit {
    for(i in 0 until s.size/2) {
        val sym1 = s[i]
        val sym2 = s[s.size-1-i]
        s[i] = sym2
        s[s.size-1-i] = sym1
    }
    return
}