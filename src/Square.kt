class Square(_name: String) : Shape(_name) {

    // variable declarations
    private var length : Double = 0.0
    private var height : Double = 0.0

    // set the dimension of the shape square
    fun setDimensions(length : Double, height : Double) {
        this.length = length
        this.height = height
    }

    // print dimensions of shape square, implemented from Dimensionable interface
    override fun printDimensions() {
        println("Dimensions: Length [$length] Height [$height]")
    }

    // calculates and returns area of shape square
    override fun getArea(): Double {
        return length * height
    }
}
