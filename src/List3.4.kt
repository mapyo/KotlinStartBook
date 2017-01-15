fun main(args: Array<String>) {
    show(Rational(17, 17))
    show(Rational(55, 100))
    show(Rational(1234, 5678))
}

fun show(rational: Rational) {
    println(rational.toString())
}


class Rational(n: Int, d: Int) {
    init {
        require(d != 0, {"denominator must not be null"})
    }

    private val g = gcd(Math.abs(n), Math.abs(d))

    val numerator: Int = n / g
    val denominator: Int = d / g

    override fun toString(): String = "${numerator}/${denominator}"

    tailrec private fun gcd(a: Int, b: Int): Int =
            if (b == 0) a
            else gcd(b, a % b)
}
