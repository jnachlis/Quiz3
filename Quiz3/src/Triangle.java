
public class Triangle extends GeometricObject {
	
	private double side1 = 1.0;
	private double side2 = 1.0;
	private double side3 = 1.0;
	
	public Triangle() {
	}
	
	public double getSide1() {
	    return side1;
	}

	public double getSide2() {
		return side2;
	}

	public double getSide3() {
	    return side3;
	}
	
	public void getSide1(double side1) {
        this.side1 = side1;
    }

    public void getSide2(double side2) {
        this.side2 = side2;
    }

    public void getSide3(double side3) {
        this.side3 = side2;
        System.out.println("The Triangle Sides are \n side 1: " 
        + side1 + "\n Side 2: " + side2 + "\n Side 3: " + side3);
    }

    
    public double getArea() {
	   double s = 1/2 * (side1 + side2 + side3);
	   double area = Math.sqrt(s*(s-side1)*(s-side2)*(s-side3));
       System.out.println("The Triangle's Area is " + area);
       return Math.sqrt(s*(s-side1)*(s-side2)*(s-side3));
    }

    public double getPerimeter(){
    	double perimeter = side1 + side2 + side3;
        System.out.println("The Triangle's Perimeter is " 
    	+ perimeter);
    	return side1 + side2 + side3;
    }
    
	public String toString(){
	return " Triangle: Side 1 = " + side1 + " Side 2 = " + side2 
			+ " Side 3 = " + side3;
	}

}
