package edu.wit.cs.comp1050;

/**
 * Point2D class for PA4b
 * 
 * @author norrisb1
 *
 */
public class Point2D {
    
    double x;
    double y;
	
	/**
	 * Constructor to initialize coordinates
	 * 
	 * @param x x value
	 * @param y y value
	 */
	public Point2D(double x, double y) {
	    this.x = x;
	    this.y = y;
	    
		// replace with your code
	}
	
	/**
	 * Get the x coordinate
	 * 
	 * @return x coordinate
	 */
	public double getX() {
		return this.x; // replace with your code
	}
	
	/**
	 * Get the y coordinate
	 * 
	 * @return y coordinate
	 */
	public double getY() {
		return this.y; // replace with your code
	}
	
	/**
	 * Gets a String representation
	 * of the coordinate in the form
	 * "(x, y)" (each with three decimal
	 * places of precision)
	 * 
	 * @return "(x, y)"
	 */
	@Override
	public String toString() {
        String XString = String.format("%.3f", this.x);
        String YString = String.format("%.3f", this.y);
        String combined = "(" + XString + ", " + YString + ")";
        return combined; // replace with your code
	}
	
	/**
	 * Returns true if provided another
	 * point that is at the same (x,y)
	 * location (that is, the distance
	 * is "close enough" according to
	 * Shape2D)
	 * 
	 * @param o another object
	 * @return true if the other object is a point and the same location (within threshold)
	 */
	@Override
	public boolean equals(Object o) {
	    if(o instanceof Point2D) {

	        if(Shape2D.closeEnough(this.x,((Point2D) o).getX()) && Shape2D.closeEnough(this.y,((Point2D) o).getY())) {
	            return true;
	        }
	    }

		return false; // replace with your code
	}
	
	/**
	 * Method to compute the Euclidean/L2
	 * distance between two points in 2D
	 * space
	 * 
	 * @param p1 point 1
	 * @param p2 point 2
	 * @return straightline distance between p1 and p2
	 */
	public static double distance(Point2D p1, Point2D p2) {
        double straightline = Math.sqrt((p2.x - p1.x) * (p2.x - p1.x) + (p2.y - p1.y) * (p2.y - p1.y));
        return straightline;
	}
	
	/**
	 * Method to compute the Euclidean
	 * distance between this point
	 * and a supplied point
	 * 
	 * @param p input point
	 * @return straightline distance between this point and p
	 */
	public double distanceTo(Point2D p) {
        return distance(new Point2D(this.x, this.y), p);
	}

}