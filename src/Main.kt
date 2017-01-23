fun main(args: Array<String>) {
    show(3 + Rational(2, 1))
    show(1 + Rational(1, 2) + 2)
}

fun show(rational: Rational) {
    println(rational.toString())
}


