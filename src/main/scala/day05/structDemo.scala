package day05

/***
  *
  * @param name
  * @param age
  * @param faceValue
  */
class structDemo(val name:String, var age:Int, var faceValue:Int){

  var gender:String = _

  //辅助构造器
  def this(name:String,age:Int,faceValue:Int,gender: String){
    this(name,age,faceValue)
    this.gender = gender
  }

}

object structDemo{
  def main(args: Array[String]): Unit = {
     val s = new structDemo(name="a",age = 26,faceValue = 99)

    println(s.name)
    println(s.age)
//    println(s.faceValue)
//    s.name = "t"  //无法赋值 用val修饰
    s.age=24
      val s2 = new structDemo("b",22,99,"w")
    println(s2.gender)

  }
}
