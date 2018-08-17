package day06


//class 前加private 只有本包才能访问到
//构造器参数前加入private 只有伴生对象才能访问
private [day03] class privateDemo private (val gender:Int) {
  private  val name:String = "a"
  private [this] val age:Int = 16 //只能在本类访问

  private  def hello():Unit={ //私有方法
    println("hello world!!!")
  }
}

object privateDemo{


}
