fun main(args: Array<String>) {
    val s1 = "Hello World"
    val s2 = "   fly me   to   the moon  "
    val s3 = "luffy is still joyboy"
    val s4 = "   "
    val s5 = "a"

    println(lengthOfLastWord(s1)) // Output: 5
    println(lengthOfLastWord(s2)) // Output: 4
    println(lengthOfLastWord(s3)) // Output: 6
    println(lengthOfLastWord(s4)) // Output: 0
    println(lengthOfLastWord(s5)) // Output: 1
}

fun lengthOfLastWord(s: String): Int {
    var result = 0
    for (i in s.indices.reversed()) {
        if (s[i] != ' ') { result+=1
        } else { if (result != 0) return result }
    }
    return result
}