fun main(args: Array<String>) {
    val x : Int = 12121
    val result: Boolean
    isPalindrome(x)
    println(isPalindrome(x))
}

fun isPalindrome(x: Int): Boolean {
    if (x<0) return false
    val xAsString: String = x.toString()
    val arr: CharArray = xAsString.toCharArray()
    var i: Int = 0
    var j: Int = arr.size-1

    while (i in 0 until arr.size) {
        if (arr[i]!=arr[j]) return false
        i++
        j--
    }
    return true
}