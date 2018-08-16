
fun hasDuplicates(array: IntArray): Boolean {
    array.forEach {
        val indexNormalized = Math.abs(it) - 1
        if (array.elementAt(indexNormalized) > 0)
            array.set(
                    index = indexNormalized,
                    value = -array.elementAt(indexNormalized)
            )
        else return true
    }
    return false
}
