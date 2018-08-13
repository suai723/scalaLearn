package day02
import scala.collection.mutable._
class test5 {

}
//Map应用,元组
object test5{
  def main(args: Array[String]): Unit = {
    val map1 = Map("scala"->1,"java"->2)
    val map2 =Map(("scala",1),("java",2))

    println(map1("scala"))
    map1("scala")=2
    println(map1("scala"))
    println(map1.contains("hello"))
    println(map1.keys)
    println(map1.getOrElse("c#",-1))
    for((k,v)<-map1) println(k,v)


    //元组
    val aa = ("scala",1)
    val t,(a,b,c,d) = ("scala",100L,3.14,(1,2))
    println(a)
    val arr = Array(("a",1),("b",2),("c",3))
    println(arr.toMap)

    val arr1 = Array("a","b","c")
    val arr2 = Array("a1","b1","c1")
    println(arr1.zip(arr2).toMap)
  }
}
