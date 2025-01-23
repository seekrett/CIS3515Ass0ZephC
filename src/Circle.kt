// import statements
import kotlin.math.PI

class Circle(_name: String) : Shape(_name) {

    // variable declarations
    private var radius : Double = 0.0

    // set the dimension of the shape circle
    fun setDimensions(radius : Double) {
        this.radius = radius
    }

    // print dimensions of shape circle, implemented from Dimensionable interface
    override fun printDimensions() {
        println("Dimensions: Radius [$radius]")
    }

    // calculates and returns area of shape circle
    override fun getArea(): Double {
        return PI * radius * radius
    }
}
