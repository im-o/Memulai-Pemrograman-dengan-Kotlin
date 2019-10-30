data class DataUser(val name : String, val age : Int){
    fun tet(){
        print("Nama saya $name, umur $age")
    }
}

fun main(){
    val dataUser = DataUser("rivaldy", 17)
    val (name, age) = dataUser

    println("My name is $name, I am $age years old")
    dataUser.tet()
}