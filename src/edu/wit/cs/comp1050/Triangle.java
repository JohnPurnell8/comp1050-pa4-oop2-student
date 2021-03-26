package edu.wit.cs.comp1050;

/**
 * triangle class for PA4b
 * 
 * @author norrisb1
 *
 */
public class Triangle extends Shape2D {
	
    String color;
    Point2D p1;
    Point2D p2;
    Point2D p3;
	/**
	 * Constructs a triangle given
	 * three points
	 * 
	 * @param color color
	 * @param p1 point 1
	 * @param p2 point 2
	 * @param p3 point 3
	 */
	public Triangle(String color, Point2D p1, Point2D p2, Point2D p3) {
		super(color, "Triangle");
		
	    this.color = color;
	    this.p1 = p1;
	    this.p2 = p2;
	    this.p3 = p3;
	}
	
	/**
	 * Returns the axis-aligned
	 * bounding box for this
	 * triangle
	 * 
	 * @return axis-aligned bounding box
	 */
	public Rectangle getAxisAlignedBoundingBox() {

	    double xMax = Math.max(p1.x, Math.max(p2.x, p3.x));
	    double yMax = Math.max(p1.y, Math.max(p2.y, p3.y));
	    double xMin = Math.min(p1.x, Math.min(p2.x, p3.x));
	    double yMin = Math.min(p1.y, Math.min(p2.y, p3.y));
	    Point2D point1 = new Point2D(xMin, yMin);
	    Point2D point2 = new Point2D(xMax, yMax);
	    Rectangle rect = new Rectangle(color, point1, point2);
		return rect;
	}

	@Override
	public double getArea() {
	    double s = getPerimeter() / 2;
	    double s1 = Point2D.distance(p1, p2);
	    double s2 = Point2D.distance(p2, p3);
	    double s3 = Point2D.distance(p3, p1);
	    double rootSum = s*(s-s1)*(s-s2)*(s-s3);
	    double area = Math.sqrt(rootSum);
		return area; // replace with your code
	}

	@Override
	public double getPerimeter() {
	    double d1 = Point2D.distance(p1, p2);
	    double d2 = Point2D.distance(p2, p3);
	    double d3 = Point2D.distance(p3, p1);
	    double perimeter = d1 + d2 + d3;
		return perimeter;
	}

	@Override
	public Point2D getCenter() {
	    double centerX = (getVertices()[0].x + getVertices()[1].x + getVertices()[2].x) /3;
	    double centerY = (getVertices()[0].y + getVertices()[1].y + getVertices()[2].y) /3;
	    Point2D center = new Point2D(centerX, centerY);
		return center; // replace with your code
	}

	@Override
	public Point2D[] getVertices() {
	    Point2D[] vertices = new Point2D[3];
	    vertices[0] = p1;
	    vertices[1] = p2;
	    vertices[2] = p3;
		return vertices;
	}

}
