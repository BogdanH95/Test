
fun IntArray.sumOfEven ():Int = this.filter {it.isEven()}.sum()

fun Int.isEven(): Boolean =  this % 2 == 0


