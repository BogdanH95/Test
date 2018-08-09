
fun IntArray.sumOfEven():Int {
    var sum = 0
    this.forEach{
    if (it.isEven()) sum += it
    }
    return sum
}

fun Int.isEven(): Boolean {
    if( this % 2 == 0)
        return true
        else
        return false
}

