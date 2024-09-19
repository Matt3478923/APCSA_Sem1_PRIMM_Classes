/**
 * Implements a class that encapsulates data and methods for representing a square
 * @author Matthew
 * @version 1.0
 * @since 2024-09-16
 */

import static java.lang.Math.sqrt;

public class RightTriangle {
        /** Side 1 of the right triangle **/
    private double side1;
        /** Side 2 of the right triangle **/
    private double side2;
        /** Hypotenuse of the right triangle **/
    private double hypotenuse;
        /** Perimeter of the right triangle **/
    private double perimeter;
        /** Area of the right triangle **/
    private double area;

    /**
     * Creates a right triangle with side1 length and side2 length, calculates hypotenuse, perimeter, area.
     * @param side1 double representing new side 1
     * @param side2 double representing new side 2
     */
    public RightTriangle(double side1, double side2) {
        this.side1 = side1;
        this.side2 = side2;
        this.hypotenuse = sqrt(side1 * side1 + side2 * side2);
        this.perimeter = side1 + side2 + this.hypotenuse;
        this.area = (side1 * side2)/2;
    }

    /**
     * Gets perimeter of right triangle
     * @return double representing perimeter
     */
    public double getPerimeter() { return this.perimeter; }

    /**
     * Gets area of right triangle
     * @return double representing area
     */
    public double getArea() { return this.area; }

    /**
     * Gets side 1 of right triangle
     * @return double representing side 1
     */
    public double getSide1() { return this.side1; }

    /**
     * Gets side 2 of right triangle
     * @return double representing side 2
     */
    public double getSide2() { return this.side2; }

    /**
     * Gets hypotenuse of right triangle
     * @return double representing hypotenuse
     */
    public double getHypotenuse() { return this.hypotenuse; }

    /**
     * Sets the side1 length, and side2 length. Perimeter, area, and hypotenuse are updated.
     * @param side1 double representing new side 1
     * @param side2 double representing new side 2
     */
    public void setSides(double side1, double side2) {
        this.side1 = side1;
        this.side2 = side2;
        this.hypotenuse = sqrt(side1 * side1 + side2 * side2);
        this.perimeter = side1 + side2 + this.hypotenuse;
        this.area = (side1 * side2)/2;
    }

    /**
     * Sets the side1 length, and hypotenuse length. Perimeter, area, and side2 are updated.
     * @param side1 double representing new side 1
     * @param hypotenuse double representing new hypotenuse
     */
    public void setSide1AndHypotenuse(double side1, double hypotenuse) {
        this.side1 = side1;
        this.hypotenuse = hypotenuse;
        this.side2 = sqrt(hypotenuse * hypotenuse - side1 * side1);
        this.perimeter = side1 + this.side2 + hypotenuse;
        this.area = (side1 * this.side2)/2;
    }

    /**
     * Sets the side2 length, and hypotenuse length. Perimeter, area, and side1 are updated.
     * @param side2 double representing new side 2
     * @param hypotenuse double representing new hypotenuse
     */
    public void setSide2AndHypotenuse(double side2, double hypotenuse) {
        this.side2 = side2;
        this.hypotenuse = hypotenuse;
        this.side1 = sqrt(hypotenuse * hypotenuse - side2 * side2);
        this.perimeter = this.side1 + side2 + hypotenuse;
        this.area = (this.side1 * side2)/2;
    }

    /**
     * Sets the side1 length, and area. Perimeter, hypotenuse, and side2 are updated.
     * @param side1 double representing new side 1
     * @param area double representing new area
     */
    public void setAreaAndSide1(double side1, double area) {
        this.side1 = side1;
        this.area = area;
        this.side2 = area / 2 * side1;
        this.hypotenuse = sqrt(side1 * side1 + this.side2 * this.side2);
        this.perimeter = side1 + this.side2 + this.hypotenuse;
    }

    /**
     * Sets the side2 length, and area. Perimeter, hypotenuse, and side1 are updated.
     * @param side2 double representing new side 2
     * @param area double representing new area
     */
    public void setAreaAndSide2(double side2, double area) {
        this.side2 = side2;
        this.area = area;
        this.side1 = area / (side2 / 2);
        this.hypotenuse = sqrt(this.side1 * this.side1 + side2 * side2);
        this.perimeter = this.side1 + side2 + this.hypotenuse;
    }
}
