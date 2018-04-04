fun String.isPalindrome(): Boolean {


    var word = this.toLowerCase().toCharArray()

    var i1 = 0
    var i2 = word.size.dec()

    while (i2 > i1) {
        if (!word[i1].equals(word[i2])) {
            return false
        }

        ++i1
        --i2
    }

    return true
}

class Number(var value:Int)

fun Number.add() {
   this.value.inc()
}

var number = Number(1)
number.add()

println(number.value)


//println("Hello".isPalindrome())
//println("MadaM".isPalindrome())

