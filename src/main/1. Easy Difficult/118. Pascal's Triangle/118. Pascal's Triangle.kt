
@file:Suppress("TYPE_INFERENCE_ONLY_INPUT_TYPES_WARNING")

fun main(args: Array<String>) {
    val numRows1  = 5
    val numRows2  = 1

    println(generate(numRows1)) // Output: [[1],[1,1],[1,2,1],[1,3,3,1],[1,4,6,4,1]]
    println(generate(numRows2)) // Output: [[1]]
}

fun generate(numRows: Int): List<List<Int>> {
    val result = arrayListOf<List<Int>>()
    result.add(listOf(1))
    var topArr = listOf(1)

    for (i in 1 until numRows) {
        var newArr = arrayListOf<Int>()
        newArr.add(1)
        for (i in 0..topArr.size-2) {
            newArr.add(topArr[i] + topArr[i+1])
        }
        newArr.add(1)
        topArr = newArr
        result.add(newArr)
    }
    return result
}