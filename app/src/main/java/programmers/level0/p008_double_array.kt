package programmers.level0

class p008_double_array {
    fun solution(numbers: IntArray): IntArray {
        return numbers.map { it * 2 }.toIntArray()
    }
}