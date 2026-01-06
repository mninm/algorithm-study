package programmers.level0

class p007_add_fractions {
    fun solution(numer1: Int, denom1: Int, numer2: Int, denom2: Int): IntArray {

        var numer = numer1 * denom2 + numer2 * denom1
        var denom = denom1 * denom2

        val gcdValue = gcd(numer, denom)

        numer /= gcdValue
        denom /= gcdValue

        return intArrayOf(numer, denom)
    }

    fun gcd(a: Int, b: Int): Int {
        return if (b == 0) a else gcd(b, a % b)
    }
}