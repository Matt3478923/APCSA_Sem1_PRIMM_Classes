/**
 * Implements a class that encapsulates data and methods for representing a square
 * @author Matthew
 * @version 1.0
 * @since 2024-09-16
 */

import static java.lang.Math.sqrt;

class Square {
        /** The side length of the square **/
    private double side = 1.0;

        /** The perimeter of the square **/
    private double perimeter = 4.0;

        /** The area of the square **/
    private double area = 1.0;

    /**
     * Constructor
     * @param s double representing the side length. Assumes positive non-zero
     */
    public Square(double s) {
        this.side = s;
    }

    /**
     * Gets side length
     * @return double representing side
     */
    public double getSide() {
        return this.side;
    }

    /**
     * Gets perimeter
     * @return double representing perimeter
     */
    public double getPerimeter() { return this.perimeter; }


    /**
     * Gets area
     * @return double representing area
     */
    public double getArea() { return this.area; }


    /**
     * Sets side length. Perimeter and area are updated
     * @param side double representing the new side length.
     */
    public void setSide(double side) {
        this.side = side;
        this.perimeter = 4 * side; // calculate perimeter
        this.area = side * side;
    }

    /**
     * Sets area. Perimeter and side length are updated
     * @param perimeter double representing the new perimeter
     */
    public void setPerimeter(double perimeter) {
        this.perimeter = perimeter;
        this.side = perimeter/4;
        this.area = this.side * this.side;
    }


    /**
     * Sets perimeter. Area and side length are updated
     * @param area double representing the new area
     */
    public void setArea(double area) {
        this.area = area;
        this.side = sqrt(area);
        this.perimeter = this.side * 4;
    }

}