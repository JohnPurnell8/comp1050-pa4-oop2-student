package edu.wit.cs.comp1050;

/**
 *  Part b of PA4, takes 7 inputs and creates a triangle and a bounding box of a given color out of them
 * 
 * @author norrisb1
 *
 */
public class PA4b {
	
	/**
	 * Error if incorrect command-line arguments are supplied
	 */
	public static final String ERR_USAGE = "Please supply correct inputs: color x1 y1 x2 y2 x3 y3";
	
	/**
	 * Number of command-line arguments
	 */
	public static final int NUM_ARGS = 7;
	
	/**
	 * Produces a string representing
	 * all vertex information in CSV
	 * format:
	 * "color",x,y
	 * 
	 * For all shape vertices,
	 * including axis-aligned bounding
	 * boxes for any included triangles
	 * 
	 * @param shapes array of shapes
	 * @return string of CSV information
	 */
	public static String shapeVertices(Triangle[] triangles) {
        StringBuilder CSV = new StringBuilder("");
	    
        if(triangles.length > 0) {
            for(int i = 0; i < triangles.length; i++) {
                
                //triangle coords
                CSV.append("\"");
                CSV.append(triangles[i].color);
                CSV.append("\"");
                CSV.append(",");
                CSV.append(triangles[i].getVertices()[0].x);
                CSV.append("00");
                CSV.append(",");
                CSV.append(triangles[i].getVertices()[0].y);
                CSV.append("00");
                CSV.append(System.getProperty("line.separator"));
                CSV.append("\"");
                CSV.append(triangles[i].color);
                CSV.append("\"");
                CSV.append(",");
                CSV.append(triangles[i].getVertices()[1].x);
                CSV.append("00");
                CSV.append(",");
                CSV.append(triangles[i].getVertices()[1].y);
                CSV.append("00");
                CSV.append(System.getProperty("line.separator"));
                CSV.append("\"");
                CSV.append(triangles[i].color);
                CSV.append("\"");
                CSV.append(",");
                CSV.append(triangles[i].getVertices()[2].x);
                CSV.append("00");
                CSV.append(",");
                CSV.append(triangles[i].getVertices()[2].y);
                CSV.append("00");

                CSV.append(System.getProperty("line.separator"));
                
                //rectangle coords
                CSV.append("\"");
                CSV.append(triangles[i].color);
                CSV.append("\"");
                CSV.append(",");
                CSV.append(triangles[i].getAxisAlignedBoundingBox().getLowerLeft().x);
                CSV.append("00");
                CSV.append(",");
                CSV.append(triangles[i].getAxisAlignedBoundingBox().getLowerLeft().y);
                CSV.append("00");
                
                CSV.append(System.getProperty("line.separator"));
                
                CSV.append("\"");
                CSV.append(triangles[i].color);
                CSV.append("\"");
                CSV.append(",");
                CSV.append(triangles[i].getAxisAlignedBoundingBox().getLowerLeft().x);
                CSV.append("00");
                CSV.append(",");
                CSV.append(triangles[i].getAxisAlignedBoundingBox().getUpperRight().y);
                CSV.append("00");
                
                CSV.append(System.getProperty("line.separator"));
                
                CSV.append("\"");
                CSV.append(triangles[i].color);
                CSV.append("\"");
                CSV.append(",");
                CSV.append(triangles[i].getAxisAlignedBoundingBox().getUpperRight().x);
                CSV.append("00");
                CSV.append(",");
                CSV.append(triangles[i].getAxisAlignedBoundingBox().getUpperRight().y);
                CSV.append("00");
                
                CSV.append(System.getProperty("line.separator"));
                
                CSV.append("\"");
                CSV.append(triangles[i].color);
                CSV.append("\"");
                CSV.append(",");
                CSV.append(triangles[i].getAxisAlignedBoundingBox().getUpperRight().x);
                CSV.append("00");
                CSV.append(",");
                CSV.append(triangles[i].getAxisAlignedBoundingBox().getLowerLeft().y);
                CSV.append("00");
                //if(i < triangles.length) {
                CSV.append(System.getProperty("line.separator"));
                //}
            }
            CSV.delete(CSV.lastIndexOf(System.getProperty("line.separator")), CSV.length());
        }
        


	       String finalString = CSV.toString();
	    
		return finalString; // replace with your code (use a StringBuilder for efficiency!)
	}

	/**
	 * Outputs vertex information in CSV
	 * format about the triangle supplied
	 * via command-line arguments, including
	 * its axis-aligned bounding box
	 * 
	 * @param args command-line arguments: color x1 y1 x2 y2 x3 y3
	 */
	public static void main(String[] args) {
	    if(args.length == NUM_ARGS) {
	        String color = args[0];
	        int x1 = Integer.parseInt(args[1]);
	        int y1 = Integer.parseInt(args[2]);
	        int x2 = Integer.parseInt(args[3]);
	        int y2 = Integer.parseInt(args[4]);
	        int x3 = Integer.parseInt(args[5]);
	        int y3 = Integer.parseInt(args[6]);
	        Point2D p1 = new Point2D(x1,y1);
	        Point2D p2 = new Point2D(x2,y2);
	        Point2D p3 = new Point2D(x3,y3);
	        Triangle t1 = new Triangle(color, p1, p2, p3);
	        Triangle tlist[] = new Triangle[1];
	        tlist[0] = t1;
	                
	        System.out.println(shapeVertices(tlist));
	    }
	    else {
	        System.out.println(ERR_USAGE);
	    }

		// replace with your code
	}

}
