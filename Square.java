class Square extends Shape {
    int side;
    
	public Square(int side, String color, String type) {
		this.side=side;
		this.color=color;
		this.type=type;
	}
	public void area() {
		area=side*side;
	}
	public void perimeter() {
		perimeter=4*(side);
	}
	public void display() {
		System.out.println("This is "+color+" "+type+" with area "+area+" and perimeter "+perimeter);
	}
	

}
