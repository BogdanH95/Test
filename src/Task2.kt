
fun IntArray.firstTwoLargestIndexes():IntArray {
    var max = Int.MIN_VALUE
    var theOtherOne = Int.MIN_VALUE

    this.forEach {
        if(it > max){
            theOtherOne = max
            max =  it
        }
    }
    return intArrayOf(max,theOtherOne)
}
