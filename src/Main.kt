fun main() {
    // creating instances of shapes
    var square : Shape = Square("SQUARE")
    var circle : Shape = Circle("CIRCLE")
    var triangle : Shape = Triangle("TRIANGLE")
    var equilateralTriangle : Shape = EquilateralTriangle("EQUILATERAL TRIANGLE")

    // variable declarations

    println("Please enter the value for each side of the following shapes.")

    // square
    print("Square Length: ")
    val sqLength = readln().toDouble()
    print("Square Height: ")
    val sqHeight = readln().toDouble()
    (square as Square).setDimensions(sqLength, sqHeight)

    /*
    // circle
    print("Circle Radius: ")
    val cRadius = readln().toDouble()
    (circle as Circle).setDimensions(cRadius)

    // triangle
    print("Triangle Side 1: ")
    val tSide1 = readln().toDouble()
    print("Triangle Side 2: ")
    val tSide2 = readln().toDouble()
    print("Triangle Side 3: ")
    val tSide3 = readln().toDouble()
    (triangle as Triangle).setDimensions(tSide1, tSide2, tSide3)

    // equilateral triangle
    print("Equilateral Triangle Side: ")
    val etSide = readln().toDouble()
    (equilateralTriangle as EquilateralTriangle).setDimensions(etSide)
     */

    println("\nRESULTS:")

    println("${square.name} \n${square.printDimensions()} \nArea: ${square.getArea()}")


    //println("${circle}\n${circle.printDimensions()}\nArea: ${circle.getArea()}")
    //println("${triangle}\n${triangle.printDimensions()}\nArea: ${triangle.getArea()}")
    //println("${equilateralTriangle}\n${equilateralTriangle.printDimensions()}\nArea: ${equilateralTriangle.getArea()}")

}
