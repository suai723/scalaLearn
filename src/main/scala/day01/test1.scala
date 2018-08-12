package day01
//配置项目
class test1 {

}
object test1{
  def main(args: Array[String]): Unit = {
    val  a = "hello world"
    var java = "this is java!!!" //var 可以改变变量值 scala 推荐用val
    println(a)
    println(java)
    java = "this is changed java"
    println(java)

    val b :Int = 1
    val s :String = "this is string type"
  }
}
