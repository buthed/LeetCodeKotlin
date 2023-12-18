@file:Suppress("TYPE_INFERENCE_ONLY_INPUT_TYPES_WARNING")

fun main() {
    val nums1: IntArray = arrayOf(5,6,2,7,4)
    val nums2: IntArray = arrayOf(4,2,5,9,7,4,8)
    println(maximumProductDifferenceBetweenTwoPairs(nums1)) // Output: 34
    println(maximumProductDifferenceBetweenTwoPairs(nums2)) // Output: 64
}

fun maximumProductDifferenceBetweenTwoPairs(nums: IntArray): Int {
    Log.d("GGG", "${nums.sort()}")
    return 1
}
