@file:Suppress("TYPE_INFERENCE_ONLY_INPUT_TYPES_WARNING")

fun main(args: Array<String>) {
    val s1 : String = "III"
    val s2 : String = "LVIII"
    val s3 : String = "MCMXCIV"
    val result: Int
    println(romanToInt(s1))
    println(romanToInt(s2))
    println(romanToInt(s3))
}

fun romanToInt(s: String): Int {
    var result: Int = 0;
    val map = mapOf(
            'M' to 1000,
            'D' to 500,
            'C' to 100,
            'L' to 50,
            'X' to 10,
            'V' to 5,
            'I' to 1
    )
    for (i in s.indices) {
        if (i == s.length-1) result += map.get(s.get(i))!!
        else if (map.get(s.get(i))!! < map.get(s.get(i+1))!!) result -= map.get(s.get(i))!!
        else result += map.get(s.get(i))!!
    }

    return result
}