package leetcode


object binarySearch704 extends App {

  def search(nums: Array[Int], target: Int): Int = {
    var left = 0
    var right = nums.length - 1
    while(left <= right) {
      val mid = left + ((right - left) / 2)
      if (nums(mid) == target) return mid
      else if (target < nums(mid)) right = mid - 1
      else left = mid + 1
    }
    -1
  }

  println(search((0 to 100).toArray, 23))
  println(search(Array(-1,0,3,5,9,12), 2))
  println(search(Array(-5), 2))
  println(search(Array(2, 5), 2))

}
