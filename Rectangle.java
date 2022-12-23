class Rectangle extends Shape{
    int height1, width1;
     
     
	public Rectangle(int height, int width, String color, String type) {
		this.height1=height;
		this.width1=width;
		this.color=color;
		this.type=type;
	}
	public void area() {
		area=height1*width1;
	}
	public void perimeter() {
		perimeter=2*(height1+width1);
	}
	public void display() {
		System.out.println("This is "+color+" "+type+" with area "+area+" and perimeter "+perimeter);
	}

}
