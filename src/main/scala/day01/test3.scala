package day01
//定义方法 函数
class test3 {

}

object test3{

  def m1(x:Int,y:Int):Int={
    x+y
  }

  def m2(f:(Int,Int)=>Int): Int ={
    f(2,2)
  }


  def main(args: Array[String]): Unit = {
    println(1+2)
    println(1.+(2))
    println(m1(1,2))
   //定义函数
    val func = (x:Int,y:Int) =>{x+y}
    println(func(1,2))
    println(m2(func))

    //方法转换为函数
    val f = m1 _
    println(m2(m1)) //自动转换为函数
    println(m2(f))
  }
}