class EquilateralTriangle(_name: String) : Triangle(_name) {

    private var side : Double = 0.0

    // FIX SETDIMENSIONS AND GETAREA. functions print 0.0 for both

    fun setDimensions(side : Double) {
        this.side = side
        super.setDimensions(side, side, side)
    }

    override fun printDimensions(){
        println("Dimensions: Side [$side]")
    }

    override fun getArea(): Double {
        return super.getArea()
    }
}
