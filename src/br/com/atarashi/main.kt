package src.br.com.atarashi

fun main() {
    val assistiramCursoAndroid = listOf("Alex", "Fran", "Gui", "Maria")
    val assistiramCursoKotlin = listOf("Alex", "Paulo", "Maria")
    val assistiramAmbos = assistiramCursoKotlin + assistiramCursoAndroid

    println(assistiramAmbos.distinct())
}