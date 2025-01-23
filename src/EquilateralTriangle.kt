class EquilateralTriangle(_name: String) : Triangle(_name) {

    // variable declarations
    private var side : Double = 0.0

    // set the dimension of the shape equilateral triangle
    fun setDimensions(side : Double) {
        this.side = side
        super.setDimensions(side, side, side)
    }

    // print dimensions of shape equilateral triangle, implemented from Dimensionable interface
    override fun printDimensions(){
        println("Dimensions: Side [$side]")
    }

    /*  redundant override, can use Triangle's getArea()
    override fun getArea(): Double {
        return super.getArea()
    }
     */
}
