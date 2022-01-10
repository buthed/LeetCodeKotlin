import java.util.*

fun main(args: Array<String>) {
    val nums: IntArray = intArrayOf(1,3,1)
    getConcatenation(nums)
    println(Arrays.toString(getConcatenation(nums)))
}

fun getConcatenation(nums: IntArray): IntArray {
    val a = nums.size*2
    val newArr= IntArray(a)
    for(i in nums.indices) {
        newArr[i] = nums[i]
        newArr[nums.size+i] = nums[i]
    }
    return newArr
}