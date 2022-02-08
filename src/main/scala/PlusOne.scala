object PlusOne extends App{
  def plusOne(array: Array[Int]): Array[Int] = {
    val big_int = BigInt(array.mkString) + 1
    big_int.toString.map(_.asDigit).toArray
  }


  var arr1 = Array(9,8,7,6,5,4,3,2,1,0)
  var arr2 = Array(1, 2, 3)
  var result = plusOne(arr1)
  println(result.mkString)
}
