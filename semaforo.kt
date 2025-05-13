import kotlin.random.Random

fun main() {
    //Simulador de Semaforo
    val lstCores = mutableListOf("Vermelho","Amarelo","Verde")
    
    var i:Int = 0
    while(i<=10){
        val num = Random.nextInt(0, 7)
        if (num <= 2){
            println(lstCores[num])
            if(num==2){
               println("Pode atravessar!") 
               }
        } else{
            println("Aguarde só mais 1 minuto")
        }
        i++
    }
}