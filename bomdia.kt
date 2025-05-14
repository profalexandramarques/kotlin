
//import kotlin.random.Random
//Função sem parametro e sem retorno
fun bomdia(){
    println("Bom dia!")
}
//Função com parametro e sem retorno
fun bomdia1(msg:String){
    println("Bom dia $msg!")
}
//Função com parametro e com retorno
fun bomdia2(msg:String):String{
    return "Bom dia $msg!"
}
//Principal
fun main() {
  bomdia()
  var nome:String = "Senac"
  bomdia1(nome)
  println(bomdia2(nome))
}
