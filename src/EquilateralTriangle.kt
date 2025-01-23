class EquilateralTriangle(_name: String) : Triangle(_name) {

    private var side : Double = 0.0

    fun setDimensions(side : Double) {
        this.side = side
        super.setDimensions(side, side, side)
    }

    override fun printDimensions(){
        println("Dimensions: Side [$side]")
    }

    /*  redundant override
    override fun getArea(): Double {
        return super.getArea()
    }
     */
}
