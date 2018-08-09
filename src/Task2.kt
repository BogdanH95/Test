
fun IntArray.firstTwoLargestIndexes():IntArray {
    if(this.count() < 2 ) return intArrayOf( Int.MIN_VALUE, Int.MIN_VALUE)

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
