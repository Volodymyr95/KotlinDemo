
fun sendMail(mail:String,to:String = "support@gmail.com") {
    println("Mail to $to  $mail")
}



sendMail( "user")
sendMail("body","adress@gmail.com")
sendMail(mail = "body",to = "adress@gmail.com")

//fun getMsg() :String {
//    return "hello"
//}

fun getMsg() = "Hello"
//
val message = getMsg()
println(message)