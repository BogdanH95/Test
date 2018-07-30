
fun IntArray.sumOfEven():Int {
    var sum =0
    this.forEach {
        if (it % 2 == 0) sum += it
    }
    return sum
}

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

//Made it function in order to manipulate the array
fun hasDuplicates(array : IntArray): Boolean {
    if(array.count() < 2) return false

    array.forEach{
        val indexNormalized = Math.abs(it) -1
        if (array.elementAt(indexNormalized) < 0)
            array.set(
                    index = indexNormalized,
                    value = -array.elementAt(indexNormalized)
            )
        else return true
    }
    return false
}
