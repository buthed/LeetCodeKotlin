import java.util.*

fun main(args: Array<String>) {
    val nums1: IntArray = intArrayOf(1,3)
    val nums2: IntArray = intArrayOf(2)
    println(findMedianSortedArrays(nums1, nums2))
}

fun findMedianSortedArrays(nums1: IntArray, nums2: IntArray): Double {
    val newArr = nums1 + nums2
    newArr.sort()
    if (newArr.size%2==0) {
        return  ((newArr[newArr.size/2].toDouble()+ newArr[newArr.size/2-1].toDouble())/2)
    } else return newArr[newArr.size/2].toDouble()
}