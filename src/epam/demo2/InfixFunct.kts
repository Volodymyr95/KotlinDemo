data class Product(var name: String)

class Person(var name: String)

infix fun Person.buy(product: Product) {
    println("$name bought $product")
}

Person("Homer") buy Product("Beer")