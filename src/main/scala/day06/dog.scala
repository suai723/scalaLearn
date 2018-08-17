package day06
/**
  * 伴生对象，与类名相同，用object修饰的是伴生对象
  * 类和其伴生对象之间可以相互访问私有方法和属性
  * */
class dog {
  private val name:String = "erha"

  def printName():Unit={
    println(dog.CONSTANT)
    println(this.name)
  }
}
/**
  * 伴生对象 *
  * */
object dog{
  private val CONSTANT = "wangwang"

  def getC(d:dog):Unit={
    println(CONSTANT)
    println(d.name)
  }


  def main(args: Array[String]): Unit = {
    val d = new dog
    d.printName()
    getC(d)
  }
}
