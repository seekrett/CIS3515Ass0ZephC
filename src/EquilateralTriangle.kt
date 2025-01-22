import kotlin.math.sqrt

class EquilateralTriangle(_name: String) : Triangle(_name) {

    private var side : Double = 0.0
    private var area : Double = 0.0

    // FIX SETDIMENSIONS AND GETAREA. functions print 0.0 for both

    fun setDimensions(side : Double) {
        super.setDimensions(side, side, side)
    }

    override fun printDimensions(){
        println("Dimensions: Side [$side]")
    }

    override fun getArea(): Double {
        super.getArea()
        return area
    }
}
