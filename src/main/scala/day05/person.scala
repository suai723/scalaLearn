package day05

/**
  * 默认class public
  *一个类文件可以声明多个类
  * */
class person() {
  //scala 中无需get set 方法
  val id:String = "100"
  var name:String = _
  private var age:Int = _ //用private 修饰的属性 该属性属于对象私有变量

  private[this] val gender:String = "w"





}

object person{
  def main(args: Array[String]): Unit = {
    val p = new person()
    println(p.id)
  }
}

object test1{

}
