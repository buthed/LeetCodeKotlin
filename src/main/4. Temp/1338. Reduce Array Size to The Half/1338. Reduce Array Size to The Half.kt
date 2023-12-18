@file:Suppress("TYPE_INFERENCE_ONLY_INPUT_TYPES_WARNING")

fun main(args: Array<String>) {
    val arr1: IntArray = intArrayOf(3,3,3,3,5,5,5,2,2,7)
    val arr2: IntArray = intArrayOf(7,7,7,7,7,7)
    val arr3: IntArray = intArrayOf(1,2,3,4,5,2)
    val arr4: IntArray = intArrayOf(1,1,3,4,5,6)
    val arr5: IntArray = intArrayOf(1,2)
    val arr6: IntArray = intArrayOf(9,77,63,22,92,9,14,54,8,38,18,19,38,68,58,19)
    val arr7: IntArray = intArrayOf(1000,1000,3,7)
    println(minSetSize(arr1)) // Output: 2
    println(minSetSize(arr2)) // Output: 1
    println(minSetSize(arr3)) // Output: 2
    println(minSetSize(arr4)) // Output: 2
    println(minSetSize(arr5)) // Output: 1
    println(minSetSize(arr6)) // Output: 5
    println(minSetSize(arr7)) // Output: 1
}

fun minSetSize(arr: IntArray): Int {
    if (arr.size ==2) return 1;
    val hashMap = mutableMapOf<Int, Int> ()
    var result = 0
    for(i in arr.indices) {
        if(!hashMap.containsKey(arr.get(i))) {
            hashMap.put(arr.get(i), 1)
        } else {
            val value = hashMap.getValue(arr.get(i))
            hashMap.replace(arr.get(i), value, value+1)

        }
    }

    var temp = 0
    while (temp<arr.size/2) {
//        val s = hashMap.toList().sortedBy { (key, value) -> value }
//                .toMap()
//        temp += s.toList().last().second
//        hashMap.remove(s.toList().last().first)
//        result++
        val s = hashMap.toList().sortedBy { (key, value) -> value }
        .toMap()
        temp += s.get(arr.size-result-1).
        result++
    }
    return result
}