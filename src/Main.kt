

class Rectangulo(val base:Double,val altura:Double){

    init {
        require(base > 0){"La base del rectangulo tiene que ser mayor de cero"}
        require(altura > 0){"La altura del rectangulo tiene que ser mayor de cero"}
    }

    val perimetro = calcularPerimetro()
    val area = calcularArea()

    fun calcularPerimetro(): Double = base * altura

    fun calcularArea(): Double = (base * altura) * 2

    /*override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Rectangulo) return false

        return this.base == other.base && this.altura == other.altura
    }

    override fun hashCode(): Int {
        var result = base.hashCode()
        result = 31 * result + altura.hashCode() /* Porque aqui otra variable? */
        return result
    }

    override fun toString(): String {
        return "Rectangulo(base= $base, altura= $altura, perimetro= $perimetro, area= $area)"
    }
} */ 


fun main() {
    val rectangulo1 = Rectangulo(3.0,4.0)
    println(rectangulo1)

    val rectangulo2 = Rectangulo(5.0,2.0)
    println(rectangulo2)

    val rectangulo3 = Rectangulo(7.0,7.0)
    println(rectangulo3)

    val rectangulo4 = Rectangulo(6.0,9.0)
    println(rectangulo4)

    val rectangulo5 = Rectangulo(2.0,4.0)
    println(rectangulo5)

    val rectanguloInvalido = try {
        Rectangulo(-2.0,3.0)
    }catch (e: IllegalArgumentException){print("Error al crear el rectángulo: ${e.message}"); null}
    if (rectanguloInvalido != null) println(rectanguloInvalido)
}
