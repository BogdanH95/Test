package test.agileFreaks

fun IntArray.sumOfEven():Int {
    var sum =0
    this.forEach {
        if (it % 2 == 0) sum += it
    }
    return sum;
}

fun IntArray.firstTwoLargestIndexes():IntArray {
    return intArrayOf(-2,-2)
}
