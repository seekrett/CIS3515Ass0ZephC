import kotlin.math.sqrt

open class Triangle(_name: String) : Shape(_name) {

    private var side1 : Double = 0.0
    private var side2 : Double = 0.0
    private var side3 : Double = 0.0
    private var area : Double = 0.0

    fun setDimensions(side1 : Double, side2 : Double, side3 : Double) {
        this.side1 = side1
        this.side2 = side2
        this.side3 = side3
    }

    override fun printDimensions(){
        println("Dimensions: Side1 [$side1], Side2 [$side2], Side3 [$side3]"s)
    }

    override fun getArea(): Double {
        val s = (side1 + side2 + side3) / 2.0
        area = sqrt((s * ((s - side1) * (s - side2) * (s - side3))))
        return area
    }
}
