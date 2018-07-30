
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
