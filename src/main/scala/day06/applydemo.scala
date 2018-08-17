package day06

/**
  * apply 方法相当于注入方法，可以与构造器参数不统一
  * unapply 常为提取方法
  * @param name
  * @param age
  * @param facevalue
  */
class applydemo(val name:String,var age:Int,val facevalue:Int) {
  
}

object applydemo{


  def apply(name: String,age: Int,facevalue: Int): applydemo = {new applydemo(name,age,facevalue)}

  def unapply(applydemo: applydemo): Option[(String, Int, Int)] ={
    if(applydemo == null){
      None
    }else{
      Some(applydemo.name,applydemo.age,applydemo.facevalue)
    }
  }

}

object Tets{

  def main(args: Array[String]): Unit = {
      val a = applydemo("a",1,1)
      a match {
        case applydemo("a",age,facevalue) => println(s"age: $age" )
        case _ =>println("no value")
      }
  }

}