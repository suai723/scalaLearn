package day04

import scala.collection.mutable.ArrayBuffer

class singleDemo {

}
/**
  * Scala中无单例对象 可以使用object 关键字+类名的语法结构实现功能
  * 1、工具类，存放常量及工具方法
  * 2、实现单例模式
  * */
object singleDemo{

  def main(args: Array[String]): Unit = {
    val factory = SessionFactory
    println(factory.getSingDemo().toBuffer)
    factory.remove()
    println(factory.getSingDemo().toBuffer)

  }
}

object SessionFactory{
  /**
    * 相当于java中的静态块
    * */

  var i = 5
  private val session = new ArrayBuffer[singleDemo]()

  while (i>0){
    session += new singleDemo()
    i-=1
  }

  def getSingDemo():ArrayBuffer[singleDemo] ={
        session
  }

  def remove():Unit={
    session.remove(0)
  }
}

