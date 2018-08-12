package day01

//scala 类型，循环
class test2 {

}

// Byte,Char,Int,Long,Float,Double,Short

object  test2{
  def main(args: Array[String]): Unit = {
    val x = 3
    if(x>1) println("a")  else println("b")
    val z = if(x>1) 1 else "error"
    println(z)
    val y = if(x<1) 1
    println(y) //类型为anyValue 所有基类是any

    println(1 to 10) //Range(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
    println(1 until  10) //Range(1, 2, 3, 4, 5, 6, 7, 8, 9)

    for(i <-1 to 10){  //循环
      println(i*10)
    }

    val arr = Array(1,2,3,4,5) //定义数组
    for(i <- arr){
      println(i)
    }
  //  高级for循环
    for(i <- 1 to 3; j <- 1 to 3 if (i!=j)){
      println(i*10,j)
    }
   // yield
    val res = for(i <- 1 until 10) yield  i
    println(res)
  }
}