fun main() {
    val nums1: IntArray = intArrayOf(5,6,2,7,4)
    val nums2: IntArray = intArrayOf(4,2,5,9,7,4,8)
    println(maximumProductDifferenceBetweenTwoPairs(nums1)) // Output: 34
    println(maximumProductDifferenceBetweenTwoPairs(nums2)) // Output: 64
}

fun maximumProductDifferenceBetweenTwoPairs(nums: IntArray): Int {
    val list = nums
    list.sort()
    return (list[nums.size-1]*list[nums.size-2]) - list[0]*list[1]
}
