/**
 * Driver class for the shapes
 * @author Matthew
 * @version 1.0
 * @since 2024-09-16
 */


class ShapeDriver {
    public static void main(String[] args) {

        Square sq1 = new Square(1.0);
        System.out.printf("Side: %.2f\n", sq1.getSide());
        System.out.printf("Area: %.2f\n", sq1.getArea());
        System.out.printf("Perimeter: %.2f\n", sq1.getPerimeter());

        sq1.setSide(5);
        System.out.printf("Side: %.2f\n", sq1.getSide());
        System.out.printf("Area: %.2f\n", sq1.getArea());
        System.out.printf("Perimeter: %.2f\n", sq1.getPerimeter());

        sq1.setPerimeter(10);
        System.out.printf("Side: %.2f\n", sq1.getSide());
        System.out.printf("Area: %.2f\n", sq1.getArea());
        System.out.printf("Perimeter: %.2f\n", sq1.getPerimeter());

        sq1.setArea(100);
        System.out.printf("Side: %.2f\n", sq1.getSide());
        System.out.printf("Area: %.2f\n", sq1.getArea());
        System.out.printf("Perimeter: %.2f\n", sq1.getPerimeter());



        // create a new square with side length 4.5
        Square sq2 = new Square(4.5);
        System.out.printf("Side: %.2f\n", sq2.getSide());
        System.out.printf("Area: %.2f\n", sq2.getArea());
        System.out.printf("Perimeter: %.2f\n", sq2.getPerimeter());


        // create a new right triangle with side1 length 3 and side2 length 4
        RightTriangle trig = new RightTriangle(3, 4);
        printTriangleValues(trig);

        trig.setSides(5, 12);
        printTriangleValues(trig);

        trig.setSide1AndHypotenuse(7, 25);
        printTriangleValues(trig);

        trig.setSide2AndHypotenuse(8, 17);
        printTriangleValues(trig);
        
        trig.setAreaAndSide1(9, 180);
        printTriangleValues(trig);

        trig.setAreaAndSide2(11, 330);
        printTriangleValues(trig);
    }

    private static void printTriangleValues(RightTriangle trig) {
        System.out.printf("Side 1: %.2f\n", trig.getSide1());
        System.out.printf("Side 2: %.2f\n", trig.getSide2());
        System.out.printf("Hypotenuse: %.2f\n", trig.getHypotenuse());
        System.out.printf("Perimeter: %.2f\n", trig.getPerimeter());
        System.out.printf("Area: %.2f\n", trig.getArea());
    }



    // l * w / 2 = a
    // a/l = w/2
    //
}