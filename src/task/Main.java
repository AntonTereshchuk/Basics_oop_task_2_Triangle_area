package task;

public class Main {

	public static void main(String[] args) {
		
		Triangle triangle1 = new Triangle(1.5, 2.0, 3.2);
		
		System.out.println("Triangle 1");
		System.out.println("Side 1: " + triangle1.getSide1());
		System.out.println("Side 2: " + triangle1.getSide2());
		System.out.println("Side 3: " + triangle1.getSide3());
		System.out.println(triangle1.toString());
		System.out.println("Area of triangle 1: " + triangle1.getArea());
		System.out.println();
		
		Triangle triangle2 = new Triangle();
		
		triangle2.setSide1(4.0);
		triangle2.setSide2(5.5);
		triangle2.setSide3(6.5);
		
		System.out.println("Triangle 2");
		System.out.println(triangle2.toString());
		System.out.println("Area of triangle 2: " + triangle2.getArea());

	}

}
