package Labsheet5

import scala.io.StdIn

object Q6 {
  def main(args: Array[String]): Unit ={
    println("Enter a number")
    var num = StdIn.readInt()
    println(fibonacci(num))

  }
  def fibonacci(num:Int):Int = num match {
    case x if x==0 => 0
    case x if x==1 => 1
    case x => fibonacci(num -1)+ fibonacci(num-2)
  }
  def fibonacciseq(num : Int): Unit = {
    if(num>0){
      fibonacciseq(num-1)
    }
  }

}
