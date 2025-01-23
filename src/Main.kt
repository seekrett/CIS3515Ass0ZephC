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


    // print results
    println("\n------- RESULTS -------")

    // square
    println("Shape: ${square.name}")
    square.printDimensions()
    println("Area: ${String.format("%.2f", square.getArea())}\n")

    // circle
    println("Shape: ${circle.name}")
    circle.printDimensions()
    println("Area: ${String.format("%.2f", circle.getArea())}\n")

    // triangle
    println("Shape: ${triangle.name}")
    triangle.printDimensions()
    println("Area: ${String.format("%.2f", triangle.getArea())}\n")

    // equilateral triangle
    println("Shape: ${equilateralTriangle.name}")
    equilateralTriangle.printDimensions()
    println("Area: ${String.format("%.2f", equilateralTriangle.getArea())}\n")
}
