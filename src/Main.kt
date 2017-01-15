fun main(args: Array<String>) {
    show(Rational(1, 4).plus(Rational(1, 2)))
    show(Rational(1, 3).plus(Rational(4, 7)))
}

fun show(rational: Rational) {
    println(rational.toString())
}


