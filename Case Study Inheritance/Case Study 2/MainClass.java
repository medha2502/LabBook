package casestudy;
import java.util.Scanner;

public class MainClass {

	

		public static void CircleDetails() {
			Scanner sc=new Scanner(System.in);
			Circle cir =new Circle();
			System.out.print("Enter the radius : ");
			cir.radius=sc.nextDouble();
			System.out.println(cir);
			System.out.printf("Area of the circle : %.2f square units\n",cir.getArea());
			System.out.printf("Perimeter of the circle : %.2f units\n",cir.getPerimeter());
			
			sc.close();
		}
		public static void RectangleDetails() {
			Scanner sc=new Scanner(System.in);
			Rectangle rect = new Rectangle();
			System.out.print("Enter the length: ");
			rect.length=sc.nextDouble();
			System.out.print("Enter the width : ");
			rect.width=sc.nextDouble();
			
			System.out.println(rect);
			System.out.printf("Area of the rectangle : %.2f square units\n",rect.getArea());
			System.out.printf("Perimeter of the rectangle : %.2f units\n",rect.getPerimeter());
			
			sc.close();
		}
		
		public static void SquareDetails() {
			Scanner sc=new Scanner(System.in);
			Square sq =new Square();
			
			System.out.print("Enter the length : ");
			sq.length=sc.nextDouble();
			
			System.out.println(sq);
			System.out.printf("Area of the square : %.2f square units\n",sq.getArea());
			System.out.printf("Perimeter of the square : %.2f units\n",sq.getPerimeter());
			
			sc.close();
		}

		public static void main(String[] args) {
			
			Scanner sc=new Scanner(System.in);
			
			int ch;
			System.out.println("Enter your choice : ");
			System.out.println("1. Circle ");
			System.out.println("2. Rectangle  ");
			System.out.println("3. Square  ");
			ch = sc.nextInt();
			
			if (ch == 1)
	            CircleDetails();
	        else if (ch == 2)
	            RectangleDetails();
	        else if (ch == 3)
	        	SquareDetails();
	        else
	            System.out.println("Wrong Input, try again!!");

			
			sc.close();
		}

	}

