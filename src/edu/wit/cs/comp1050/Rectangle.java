package edu.wit.cs.comp1050;

/**
 * Rectangle class for PA4b
 * 
 * @author norrisb1
 *
 */
public class Rectangle extends Shape2D {
	
    String color;
    Point2D p1;
    Point2D p2;
    
    
	/**
	 * Constructs a rectangle given two points
	 * 
	 * @param color rectangle color
	 * @param p1 point 1
	 * @param p2 point 2
	 */
	public Rectangle(String color, Point2D p1, Point2D p2) {
		super(color, "Rectangle");
		this.color = color;
		this.p1 = p1;
		this.p2 = p2;
	}
	
	/**
	 * Returns true if provided
	 * another rectangle whose 
	 * lower-left and upper-right
	 * points are equal to this
	 * rectangle
	 * 
	 * @param o another object
	 * @return true if the same rectangle
	 */
	@Override
	public boolean equals(Object o) {
	    if(o instanceof Rectangle){
	       if(Shape2D.closeEnough(((Rectangle) o).getLowerLeft().x, this.getLowerLeft().x) && Shape2D.closeEnough(((Rectangle) o).getLowerLeft().y, this.getLowerLeft().y) && Shape2D.closeEnough(((Rectangle) o).getUpperRight().x, this.getUpperRight().x) && Shape2D.closeEnough(((Rectangle) o).getUpperRight().y, this.getUpperRight().y))  {
	           return true;
	       }
	    }
		return false;
	}
	
	/**
	 * Gets the lower-left corner
	 * 
	 * @return lower-left corner
	 */
	public Point2D getLowerLeft() {
	    if(p1.x < p2.x && p1.y < p2.y) {
	        return p1;
	    }
	    else if(p1.x < p2.x && p1.y > p2.y) {
	        Point2D pHalf = new Point2D(p1.x,p2.y);
	        return pHalf;
	        
	    }
        else if(p1.x > p2.x && p1.y < p2.y) {
            Point2D pHalf = new Point2D(p2.x,p1.y);
            return pHalf;
        }
        else if(p1.x > p2.x && p1.y > p2.y) {
            return p2;
        } 
		return null;
	}
	
	/**
	 * Gets the upper-right corner
	 * 
	 * @return upper-right corner
	 */
	public Point2D getUpperRight() {
        if(p1.x > p2.x && p1.y > p2.y) {
            return p1;
        }
        else if(p1.x > p2.x && p1.y < p2.y) {
            Point2D pHalf = new Point2D(p1.x,p2.y);
            return pHalf;
            
        }
        else if(p1.x < p2.x && p1.y > p2.y) {
            Point2D pHalf = new Point2D(p2.x,p1.y);
            return pHalf;
        }
        else if(p1.x < p2.x && p1.y < p2.y) {
            return p2;
        } 
        return null;
	}

	@Override
	public double getArea() {
	    double length = getUpperRight().x - getLowerLeft().x;
	    double height = getUpperRight().y - getLowerLeft().y;
	    double area = length * height;
		return area;
	}

	@Override
	public double getPerimeter() {
	    double length = getUpperRight().x - getLowerLeft().x;
	    double height = getUpperRight().y - getLowerLeft().y;
	    double perimeter = 2*length + 2*height;
		return perimeter;
	}

	@Override
	public Point2D getCenter() {
	    double midX = (getUpperRight().x + getLowerLeft().x)/2;
	    double midY = (getUpperRight().y + getLowerLeft().y)/2;
	    Point2D midPoint = new Point2D(midX,midY);
		return midPoint; // replace with your code
	}

	@Override
	public Point2D[] getVertices() {
	    Point2D[] vertices = new Point2D[4];
	    Point2D botLeft = new Point2D(getLowerLeft().x, getLowerLeft().y);
        Point2D topLeft = new Point2D(getLowerLeft().x, getUpperRight().y);
        Point2D topRight = new Point2D(getUpperRight().x, getUpperRight().y);
        Point2D botRight = new Point2D(getUpperRight().x, getLowerLeft().y);
        vertices[0] = botLeft;
        vertices[1] = topLeft;
        vertices[2] = topRight;
        vertices[3] = botRight;
		return vertices; // replace with your code
	}

}
