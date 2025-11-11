Un manual básico completo de kotlin para Android incluiría al menos estos temas con ejemplos y explicaciones claras:

## 1. Declaración y uso de variables

val constante: Int = 10  // inmutable
var variable: String = "Hola"  // mutable
variable = "Hola Mundo!"

## 2. Tipos de datos básicos

- Enteros (Int, Long)
- Decimales (Float, Double)
- Texto (String)
- Booleanos (Boolean)
- Caracteres (Char)

## 3. Operadores básicos y expresiones

val suma = 5 + 3
val esIgual = (suma == 8)
val texto = "Número: $suma"


## 4. Estructuras de control

- Condicionales: if, when
- Bucles: for, while, do-while

if (suma > 5) println("Mayor")
when (suma) {
  8 -> println("Ocho")
  else -> println("Otro número")
}


## 5. Funciones

fun saludar(nombre: String): String {
    return "Hola $nombre"
}

val saludo = saludar("Ana")
println(saludo)


## 6. Clases y objetos

class Persona(val nombre: String, var edad: Int)

val p = Persona("Luis", 30)
println(p.nombre)


## 7. Colecciones

- List, MutableList
- Set, Map

val lista = listOf("a", "b", "c")
val mapa = mapOf("clave1" to 123, "clave2" to 456)


## 8. Manejo de nulls y seguridad

val texto: String? = null
println(texto?.length ?: 0)


## 9. Uso básico de arreglos, matrices, tuplas

val array = arrayOf(1,2,3)
val matriz = arrayOf(intArrayOf(1,2), intArrayOf(3,4))
val par = Pair(1, "uno")
val triple = Triple(1, "dos", 3.0)


## 10. String y manipulación básica

val text = "Hola"
val mayus = text.uppercase()
val sub = text.substring(1,3)


## 11. Manejo de archivos planos y datos (ej. CSV)

val lines = readLines("datos.csv")
val parsed = lines.map { it.split(",") }


## 12. Android: manejo de vistas y eventos

val boton = findViewById<Button>(R.id.miBoton)
boton.setOnClickListener {
    Toast.makeText(this, "Click!", Toast.LENGTH_SHORT).show()
}


## 13. Android: imágenes y recursos

val imagen = BitmapFactory.decodeResource(resources, R.drawable.logo)
imageView.setImageBitmap(imagen)


## 14. Corutinas (introducción)

GlobalScope.launch {
    delay(1000)
    println("Tarea en background")
}