package yandex

object minDist extends App {

  def minDist(array: Array[Int], sLen: Int): Array[Int] = {
    val range = array.indices
    var newArray: Array[Int] = Array()

    def dist(index: Int): Array[Int] = {
      val sumOfElements = for { i <- range; if index != i} yield {
        (array(index) - array(i)).abs
      }
      sumOfElements.toArray
    }

    def minSum(array: Array[Int], sLen: Int): Int = {
      val result = array.sorted.take(sLen).sum
      result
    }

    for (i <- range) {
      val newValue = minSum(dist(i), sLen)
      newArray = newArray :+ newValue
    }

    newArray
  }

  val arr = Array(
    (Array(1, 2, 3, 4), 2),
    (Array(3, 2, 5, 1, 2), 3),
    (Array(3, 2, 1, 101, 102, 103), 2)
  )

  for ((a, k) <- arr) {
    val result = minDist(a, k)
    println(result.mkString(" "))
  }

}
