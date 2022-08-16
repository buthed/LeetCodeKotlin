@file:Suppress("TYPE_INFERENCE_ONLY_INPUT_TYPES_WARNING")

fun main(args: Array<String>) {
    val s1 : String = "leetcode"
    val s2 : String = "loveleetcode"
    val s3 : String = "aabb"
    val s4 : String = "a"
    val s5 : String = "aa"
    val s6 : String = "dddccdbba"
    println(firstUniqChar(s1)) // Output: 0
    println(firstUniqChar(s2)) // Output: 2
    println(firstUniqChar(s3)) // Output: -1
    println(firstUniqChar(s4)) // Output: 0
    println(firstUniqChar(s5)) // Output: -1
    println(firstUniqChar(s6)) // Output: 8
}

fun firstUniqChar(s: String): Int {
    var result = -1
    val hashMap : HashMap<Char, Int> = HashMap<Char, Int> ()
    var qty = 0;
    for(i in s.indices) {
        val tempChar = s.get(i)
        if (!hashMap.containsKey(tempChar)) {
            hashMap.put(tempChar,0)
            qty = 0
            for (i in s.indices) {
                if (s.get(i).equals(tempChar)) qty ++
                if (qty>1) break
            }
            if (qty==1) {
                result = i
                break
            }
        }
    }

    return result
}