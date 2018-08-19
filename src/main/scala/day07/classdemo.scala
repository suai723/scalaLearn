package day07


class classdemo {

}

object classdemo{
  def main(args: Array[String]): Unit = {

  }
}

/**
  * 特质（接口）
  */
trait Flyable{
  //声明有值字段
  val a = "hello world"
  //声明一个没有值的字段
  val distane:Int
  //声明没有实现的方法
  def fight():Unit
  //声明有实现的方法
  def fly():Unit= {
    println("i can fly")
  }

}
//声明抽象类
abstract class anymore{
  //声明一个没有值的字段
  val name:String
  def run():String
  def climb():String ={
    "hello world"
  }
}

class human(var age:Int) extends anymore with Flyable{

  override val name: String = "h"

  override def run(): String = {
    "run"
  }

  override val distane: Int = 100

  override def fight(): Unit = {
    "fight"
  }


}


