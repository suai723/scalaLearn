package day02

import scala.collection.{immutable, mutable}

class test6 {

}

object test6{
  def main(args: Array[String]): Unit = {
    //集合 seq set map
    //不可变
      val list1 = List("a","b","c")
      val list2 = "0" :: list1
      val list3 = list1.::("0")
      val list4 = "0" +: list1

      val list6 = list1 :+ "d"
      val list7 = List("d","e")
      val list8 = list1 ++ list7

    //可变集合
    val list10  = mutable.ListBuffer(1,2,3)
    list10 +=4
    list10.append(5)
    val list11 = mutable.ListBuffer(4,5,6)
    list11 ++= list10
    val list12 = list11 ++ list10


  //set
    val set1 = new immutable.HashSet[Int]()
    val set2 = set1 + 1
    val set3 = set2 ++ Set(2,3,4)

    val set4 = new mutable.HashSet[Int]()
    set4.add(4)
    set4 ++= Set(6,7,8)
    set4 -= 6
    set4.remove(7)

    //map
    val map1 = new mutable.HashMap[String,Int]()
    map1("scala") = 1
    map1 +=("java"->2)
    map1 += (("python",3),("c#",4))
    map1.put("c++",5)
    map1.remove("python")
  }
}
