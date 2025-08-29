import kotlin.math.sqrt

//Tạo chương tring quản lý người dùng

//in ra thông tin người dùng
fun greetUser(name: String, age: Double){
    println("Tên tôi là: $name")
    println("Bình phương độ tuổi: ${sqrt(age)}")
}

// hàm với giá trị mặc định
fun createAccount(username: String, password: String = "123456", isAdmin: Boolean = true): String{
    return "Tài khoản: $username, có mật khẩu là : $password, Admin: $isAdmin"
}

//hàm viết hoa chữ cái đầu
fun String.capitalizeWords(): String = this.split(" ").joinToString(" "){
    word -> word.replaceFirstChar { if (it.isLowerCase()) it.titlecase() else it.toString() }
}

//hm kiểm tra số null
fun Int?.doubleOrZero(): Int = this?.times(2) ?: 0
fun main(){
    greetUser("tien hung",23.0)
    createAccount("hungct")
    createAccount("admin", isAdmin = true)
    val str = "chau tien hung"
    println(str.capitalizeWords())
    val n: Int? = 10
    println(n.doubleOrZero())
    //Null safety
    val email: String? = null
    val safeEmail = email ?: "no email"
    println("safe email =$safeEmail")
    println(email?.length)
    //ép kiểu in ra độ dài email gây crash khi null
    println(email!!.length)

}