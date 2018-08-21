package day07

class curryDemo {

}

object curryDemo{

  def m1(a:String)(implicit b:String="world"):Unit={
    println(a+" "+b)
  }

  def m2(a:Int)(b:Int):Int={a+b}
  //函数克里化
  def main(args: Array[String]): Unit = {

      m1("hello")
      m1("hello")("china")
      implicit val a = "girl" //隐式调用
    m1("hello")

      val func = m2(1)_
      println(func(2))
  }
}
