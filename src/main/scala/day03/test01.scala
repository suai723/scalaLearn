package day03

class test01 {

}

object test01 {
  def main(args: Array[String]): Unit = {
    val list1 = List(2, 1, 5, 4, 3,7,9,8)
    val list2 = list1.map((a)=>{a*2})
    println(list2)

    val list3 = list1.filter((a)=>{a%2 == 0})
    println(list3)

    val list4 = list1.sorted  //方法无参数时 不用加（）
    val list5 = list4.reverse
    println(list4)
    println(list5)

    val it = list1.grouped(4)  //按4个分组
    //println(it.toBuffer)
    val list6 =it.toList
    println(list6)
    val list7 =list6.flatten
    println(list7)

    //先按空格切分 再切平
    val list8 = List("hello java","hello2 python","hello3 scala")
    val list9 = list8.flatMap((a:String)=>{a.split(" ")})
    println(list9)

    val arr = Array(1,2,3,4,5,6,7,8,9,10,11,12)
    println(arr.sum)
    val res = arr.par.sum //并行计算求和
    println(res)

    //按照特定的顺序进行聚合
    val res2 = arr.par.reduce((x,y)=>{x+y})
    println(res2)
    //折叠 （有初始值）
    //val list10 = List()
    val res3 =arr.fold(10)(_+_)
    println(res3)
    val res4 = arr.par.fold(0)(_+_)
    println(res4)

    val arr2 = List(List(1,2,3),List(4,5,6),List(1),List(7,8))
    val res5 = arr2.aggregate(0)((a,b)=>{a+b.sum},(a,b)=>(a+b))
    println(res5)


    //并集
    val list11 = List(1,2,3,4)
    val list12 = List(5,6,4,7)

    val list13 = list11 union list12
    println(list13)

    val list14 = list11 intersect list12
    println(list14)

    val list15 = list11 diff list12
    println(list15)
  }
}
