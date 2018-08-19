package day07

import scala.util.Random

class matchStr {

}
object matchStr{

  def main(args: Array[String]): Unit = {
    val arr = Array("1", "2", "3", "4")
    val name = arr(Random.nextInt(arr.length))
    name match {
      case "1" => println("11111")
      case "2" => println("22222")
      case _ => println("no")
    }

    val arr2 = Array("1", 2, new matchStr())
    val name2 = arr2(Random.nextInt(arr.length))

    name2 match {
      case str: String => println(s"String $str")
      case int: Int => println(s"Int $int")
      case ms: matchStr => println(s"matchStr:$ms")
      case _ => println("no")
    }

    val arr3 = Array(1, 2, 3)
    arr3 match {
      case Array(1, a, b) => println(s"$a,$b")
      case Array(_, x, y) => println(s"$x,$y")
    }
    //偏函数
    def m1: PartialFunction[String, Int] = {
      case "one" => {
        println("one")
        1
      }
      case "two" => {
        println("two")
        2
      }

    }

    println(m1("one"))

    //样例

    val arr4 = Array(new g("g"),new m,w)
    val name3 = arr2(Random.nextInt(arr.length))
    name3 match {
      case g(a)=>println("g")
      case m =>println("m")
      case w => println("w")
    }

  }

  case class g(val a:String)
  case class m()
  case object w
}
