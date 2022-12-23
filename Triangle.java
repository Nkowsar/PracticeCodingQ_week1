class Triangle extends Shape {
    int base, height, side1, side2;
    
	public Triangle(int base,int side1, int side2, int height, String color, String type) {
                this.base=base;
                this.height=height;
                this.color=color;
                this.side1=side1;
                this.side2=side2;
                this.type=type;

	}
	public void area() {
		area=(base*height)/2;
	}
	public void perimeter() {
		perimeter=base+side1+side2;
	}
	public void display() {
		System.out.println("This is "+color+" "+type+" with area "+area+" and perimeter "+perimeter);
	}

}