



object Case1 extends App {
  var j = "Pavi"
  val p = "Pavithra"
  var k = 89
  val s = if(k>90) 100 else 50
  println(j,p,k,s)
  p.foreach(p => println(p))
  val res = {val a = 200; a-s}
  println(res)
  val res1 = {val a = 200; a-s ; "Pavi" }
  println(res1)
  var res2 = "fdfd"
  val ik = if(s>=50) "Positive" else 0
  println(ik)
  var sum = 0
  for (i<-0 until p.length) sum=sum+i
  println(sum)
  var c = 1 to 10
  println(c)
}



SOme unique concepts like Lazy variables for just watching but not does any operations