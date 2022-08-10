fun main() {
    
    // Read-only (immutable)
    val names = listOf("Ahad", "Turki", "Raghad", "Nasser", "Sumayah", "Fahdah")
    val namesAll = listOf("Ahad", "Turki", "Raghad", "Nasser")
    val color = listOf<String>()
    
    // Read and Write (mutable)
    val numbers = mutableListOf("one", "two", "three", "four", "five")
    val weekDays = mutableListOf("Sun", "Mon", "Tue", "Wed", "Thurs", "Fri", "Sat")

    
    // Read-Write (mutable) List - Operations
    
    
    // Add (Element)
   	numbers.add("six ")
    println(numbers)
        println("===============================")
    weekDays.add("sun")
     println(weekDays)
        println("===============================")

    // Add (Index, Element)
     	numbers.add(2,"six ")
   	    println(numbers)
  println("===============================")

weekDays.add(4,"Fri ")
   	    println(weekDays)
          println("===============================")

    // Add All (List)
         	numbers.addAll(listOf("six ", "Seven"))
   println(numbers)
  println("===============================")
      
      
    // Add All (Index, List)
                 	numbers.addAll(2,weekDays)
                       println(numbers)

  println("===============================")

    // Clear 
   	numbers.clear()
                           println(numbers)

    // Remove
    weekDays.remove("Fri")
  
       println(weekDays)

    // Remove At 
    weekDays.removeAt(2)
           println(weekDays)

    // Remove All
   	weekDays.removeAll(numbers)
               println(weekDays)

    
    // Read-only (immutable) List - Operations
     
     
    // The size of the list
   val size = namesAll.size
    
       println(size)


    // Contains
       println("${names.contains("Fahdah")}")
       println("${names.contains("haitham")}")

    // Contains All
   	   	println("${names.containsAll(namesAll)}")

    // get
   	   println("${namesAll.get(3)}")

    // indexOf
       println("${names.indexOf("Fahdah")}")
       	   println("${namesAll.indexOf("Fahdah")}")

    // isEmpty
           println("${names.isEmpty()}")
           println("${color.isEmpty()}")

    // Sublist
    val supL = namesAll.subList(1,4)
               println(supL)
}
