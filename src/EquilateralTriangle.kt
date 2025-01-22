import kotlin.math.sqrt

class EquilateralTriangle(_name: String) : Triangle(_name) {

    private var side : Double = 0.0
    private var area : Double = 0.0

    fun setDimensions(side : Double) {
        super.setDimensions(side, side, side)
    }

    override fun printDimensions(){
        println("Dimensions: Side [$side]")
    }

    override fun getArea(): Double {
        val s = (side + side + side) / 2.0
        area = sqrt((s * ((s - side) * (s - side) * (s - side))))
        return area
    }
}
