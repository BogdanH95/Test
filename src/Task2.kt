
fun IntArray.firstTwoLargestIndexes():IntArray {
    if(this.count() < 2 ) return intArrayOf(-1,-1)

    var max = Int.MIN_VALUE
    var theOtherOne = Int.MIN_VALUE

    this.forEach {
        if(it > max){
            theOtherOne = max
            max =  it
        }
    }
    return intArrayOf(this.indexOf(max),this.indexOf(theOtherOne))
}
