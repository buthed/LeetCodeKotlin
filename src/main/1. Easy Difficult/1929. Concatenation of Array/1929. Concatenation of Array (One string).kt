import java.util.*

fun main(args: Array<String>) {
    val nums: IntArray = intArrayOf(1,3,1)
    getConcatenation(nums)
    println(Arrays.toString(getConcatenation(nums)))
}

fun getConcatenation(nums: IntArray): IntArray {
    return nums + nums
}