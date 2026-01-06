package programmers.level0

class p006_equal_check {
    fun solution(num1: Int, num2: Int): Int {
        var answer: Int = 0
        if (num1 == num2) answer = 1
        else answer = -1
        return answer
    }
}