package day01

import scala.collection.mutable.ArrayBuffer

class test4 {

}
object test4{
  def main(args: Array[String]): Unit = {
    //定长数组
    val arr = new Array[String](8)
    println(arr.toBuffer)
    val arr2 = Array("a","b","c")
    arr2.foreach(println(_))
    println(arr2(0))
    //变长数组
     val arr3 = new ArrayBuffer[Int](8)
    println(arr3.toBuffer)
    arr3+=1
    println(arr3.toBuffer)
    arr3+=(2,3,4,5)
    println(arr3.toBuffer)
    arr3 ++= Array(5,6)
    println(arr3.toBuffer)
    arr3 ++= ArrayBuffer(7,8)
    println(arr3.toBuffer)
    arr3.insert(0,-1,-2) //在第0个元素位置加入 -1 -2
    println(arr3.toBuffer)
    arr3.remove(2,2) //下标 删除几个
    println(arr3.toBuffer)


  }
}