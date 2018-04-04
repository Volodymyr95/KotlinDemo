var number = 12

when (number) {
    2 -> print("Num is 2")
    3 -> print("Num is 3")
}

when (number) {
    1, 2, 3, 4, 5 -> print("Num in range between 1 and 5")
}

when (number) {
    in 1..5 -> print("Range between 1 and 5")
    in 6..10 -> print("Range between 6 and 10")
    else -> print("None of the above")
}

try {

    var result = 2 % 0

} catch (e: Exception) {
    when (e) {
        is ArithmeticException -> println("Arithmetic exeption")
        is KotlinNullPointerException -> println("KNLP")
        else -> println("Exeption")
    }
}


data class A (var i:Int, var b:Int)

var(i,b) = A(1,2)

println(i)
println(b)