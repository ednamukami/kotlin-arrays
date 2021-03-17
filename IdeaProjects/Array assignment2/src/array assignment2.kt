import java.util.*

fun main(){
name("belyse","grace","edna","mercy")
country()
    digits()
var t =students("hamdi","mike","john")
    println(Arrays.toString(t))


}
fun name(name1:String,name2:String,name3:String,name4:String){
    var students= arrayOf(name1,name2,name3,name4)
    println(Arrays.toString(students))
}
fun country(){
    var city= arrayOf("harare","mumbai","dodoma","jarkata")
    println(city[0].capitalize()+","+city[1].capitalize()+","+city[2].capitalize()+","+city[3].capitalize())

}
fun digits(){
    var number=arrayOf(32,17,4,213,78,43,90,31,3,73,11,158,62)
    var add=number.component2()+number.component5()
    println(add)
    var y=number.indexOf(158)
    println(y)
    var up=number.sortedArray()
    for (elements in up){
        println(elements)
    }
}
fun students(name1:String,name2:String,name3: String):Array<String>{
    var s= arrayOf(name1,name2,name3)
    return s


}