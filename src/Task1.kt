package test.agileFreaks

fun IntArray.Task1():Int = this.filter {it % 2 == 0}.sum()
