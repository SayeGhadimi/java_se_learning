public class Circle {
 2    /** The radius of the circle */
		 3    private double radius = 1;
 4
		 5    /** The number of objects created */
		 6    private static int numberOfObjects = 0;
 7
		 8    /** Construct a circle with radius 1 */
		 9    public Circle() {
		10      numberOfObjects++;
		11    }
 12
		 13    /** Construct a circle with a specified radius */
		 14    public Circle(double newRadius) {
		15      radius = newRadius;
		16      numberOfObjects++;
	}
 18
		 19
	/** Return radius */
	accessor method
	mutator method
	accessor method
	invoke public method
	invoke public method
	invoke public method
 20
		 21
	public double getRadius() {
		return radius;
		22    }
 23
		 24
/** Set a new radius */
		 25
	public void setRadius(double newRadius) {
		26      radius = (newRadius >= 0) ? newRadius : 0;
		27    }
 28
		 29
/** Return numberOfObjects */
		 30
		 31
	public static int getNumberOfObjects() {
		return numberOfObjects;
		32    }
 33
		 34
/** Return the area of this circle */
		 35
		 36
	public double getArea() {
		return radius * radius * Math.PI;
		37    }
 38  }