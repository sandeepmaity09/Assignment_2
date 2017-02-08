object ListSum extends App {

  val list1 = List(100, 200, 300, 500, 600)
  val list2 = List(1, 2, 3, 5, 234, 343, 23)
  val result = list1.flatMap(item1 => {
    list2.map(item2 => {
      if (list1.indexOf(item1) == list2.indexOf(item2))
        item1 + item2
      else
        0
    })
  })
  val finalResult = result.filter(item => (item != 0))
  println(finalResult)

}

