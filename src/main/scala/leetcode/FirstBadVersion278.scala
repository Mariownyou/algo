package leetcode

object FirstBadVersion278 extends App {

  def isBadVersion(n: Int, bad: Int = 4): Boolean = {
    if (n >= bad) return true
    false
  }

  def solution(n: Int, bad: Int = 4): Int = {
    var left = 0
    var right = n
    while (left < right) {
      val mid = left + ((right - left) / 2)
      if (isBadVersion(mid, bad)) right = mid
      else left = mid + 1

      if (left == mid) return mid
    }
    left
  }

  println(solution(5))
  println(solution(1, 1))

}
