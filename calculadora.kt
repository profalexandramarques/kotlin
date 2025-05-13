import kotlin.random.Random

fun soma(a: Int, b: Int): Int {
	return a + b
}

fun multi(a: Int, b: Int): Int {
	return a * b
}


fun main() {
     val n1 = Random.nextInt(1, 10)
     val n2 = Random.nextInt(1, 10)     
     println("Soma = "+soma(n1,n2))
     println("Multiplicação = "+multi(n1,n2))
     
}