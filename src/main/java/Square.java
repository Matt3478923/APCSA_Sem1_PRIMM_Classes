/**
 * Implements a class that encapsulates data and methods for representing a square
 * @author Matthew
 * @version 1.0
 * @since 2024-09-16
 */

class Square {
        /** The side length of the square **/
    private double side = 1.0;

        /** The perimeter of the square **/
    private double perimeter = 4.0;

        /** The area of the square **/
    private double area = 1.0;

    /**
     * Constructor
     * @param side double representing the side length. Assumes positive non-zero 
     */
        // TODO: add a constructor that takes a side length


    /**
     * Gets side length
     * @return double representing side
     */
    public double getSide() {
        return side;
    }

    /**
     * Gets perimeter
     * @return double representing perimeter
     */
    // TODO: implement getter for perimeter

    /**
     * Gets area
     * @return double representing area
     */
    // TODO: implement getter for area

    /**
     * Sets side length. Perimeter and area are updated
     * @param s double representing the new side length.
     */
    public void setSide(double s) {
        side = s;
        perimeter = 4 * side; // calculate perimeter
        // TODO: calculate the area
    }

    /**
     * Sets area. Perimeter and side length are updated
     */
    // TODO: implement - you will need to import java.lang.Math to use sqrt() method


    /**
     * Sets perimeter. Area and side length are updated
     */
    // TODO: implement - you will need to import java.lang.Math to use sqrt() method

}