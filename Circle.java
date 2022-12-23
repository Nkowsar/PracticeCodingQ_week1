class Circle extends Shape{
    int radius;
    
	public Circle(int radius, String color, String type) {
		this.radius=radius;
		this.color=color;
		this.type=type;
	}
	public void area() {
		area=2*3.14*radius*radius;
	}
	public void perimeter() {
		perimeter=2*3.14*radius;
	}
	public void display() {
		System.out.println("This is "+color+" "+type+" with area "+area+" and perimeter "+perimeter);
	}


}
