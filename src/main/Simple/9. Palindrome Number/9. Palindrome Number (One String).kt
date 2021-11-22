fun main(args: Array<String>) {
    val x : Int = 12121
    val result: Boolean
    isPalindrome(x)
    println(isPalindrome(x))
}

fun isPalindrome(x: Int) = x.toString() == x.toString().reversed()