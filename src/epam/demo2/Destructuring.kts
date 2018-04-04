data class Person(var firstName: String, var lastName:String, var age:Int, var father:Person?)


var(firstName,lastName,age,father) = Person("Homer","Simpson",45,Person("TT","fs",70,null))

println(firstName)
println(lastName)
println(age)
println(father!!.age)