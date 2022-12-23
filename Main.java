class Main {
	public static void main(String[] args) {
		Shape rect= new Rectangle(12,23,"blue","Rectangle");
		Shape cir=new Circle(5,"red","circle");
		Shape tri=new Triangle(12,23,11,10,"orange","triangle");
		Shape squr=new Square(10,"yellow","square");
		rect.area();
		rect.perimeter();
		cir.area();
		cir.perimeter();
		tri.area();
		tri.perimeter();
		squr.area();
		squr.perimeter();
		rect.display();
		System.out.println();
		cir.display();
		System.out.println();
		tri.display();
		System.out.println();
		squr.display();
	}

}
