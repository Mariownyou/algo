object InsertionSort extends App {
  def insertionSort(array: Array[Int]): Array[Int] = {
    for (j <- 1 until array.size) {
      val key = array(j)
      var i = j - 1
      while (i > -1 && array(i) > key) {
        array(i + 1) = array(i)
        i -= 1
      }
      array(i + 1) = key
    }
    array
  }

  var result = insertionSort(Array(100, 23, 44, 124, 1, 4, 55, 23, 7, 8, 22))
  print(result.mkString(","))
}
