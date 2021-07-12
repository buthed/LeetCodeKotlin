fun main(args: Array<String>) {
    val nums: IntArray = intArrayOf(2,7,11,15)
    val target = 9
    twoSum(nums, target)
}

fun twoSum(nums: IntArray, target: Int): IntArray{
    var result: IntArray = intArrayOf()
    for(i in nums.indices){
        for(j in 1+i..nums.size){
            if (nums[i] + nums[j] == target) {
                result = intArrayOf(i,j)
                break
            }
        }
    }
    return result
}