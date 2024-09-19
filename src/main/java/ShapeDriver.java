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


        // TODO: After implementing a new shape of your choosing


    }


}