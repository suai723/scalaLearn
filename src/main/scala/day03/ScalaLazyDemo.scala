package day03

class ScalaLazyDemo {

}
object ScalaLazyDemo{

  def init(): Unit = {
    println("call init()")
  }

  def main(args: Array[String]): Unit = {
    val property = init() //没用lazy修饰
    println("after init()")
    println(property)

  }

}

/**
  *Scala 中lazy修饰的变量是惰性变量 延迟加载 只能是不可变变量
  * 只有在调用这个变量时 才会执行
  */


object ScalaLazyDemo2{

  def init(): Unit = {
    println("call init()")
  }

  def main(args: Array[String]): Unit = {
    lazy val property = init() //没用lazy修饰
    println("after init()")
    println(property)

  }

}
