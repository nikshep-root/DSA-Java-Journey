/* In the previous program (Area of Shapes), i used if elseif case which has the time complexity of 0(n) but in this program i will use 
   switch case which has the time complexity of 0(1) and it is more efficient than if elseif case. */

import java.util.Scanner;

public class PerimeterOfShapes {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter the shepe for which you want to calculate the perimeter:");
        String shape = sc.nextLine();
        switch (shape.toLowerCase()) {
            case "circle":
                circle();
                break;

            case "rectangle":
                rectangle();
                break;

            case "triangle":
                triangle();
                break;

            case "square":
                square();
                break;

            case "parallelogram":
                parallelogram();
                break;

            case "trapezium":
                trapezium();
                break;

            case "rhombus":
                rhombus();
                break;

            case "isosceles triangle":
                isoscelesTriangle();
                break;

            case "equilateral triangle":
                equilateralTriangle();
                break;

            default:
                System.out.println("Entered shape is invalid or else shape not found!!");
        }
    }

        static void circle() {
            Scanner sc = new Scanner (System.in);
            System.out.println("Enter the radius of the cirlcle: ");
            double radius = sc.nextDouble();
            double peri = 2*Math.PI*radius;
            System.out.println("Perimeter of the circle is: " + peri);
        }

        static void rectangle() {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter the length of the rectangle: ");
            double length = sc.nextDouble();
            System.out.print("Enter the breadth of the rectangle: ");
            double breadth = sc.nextDouble();
            double peri = 2 * (length + breadth);
            System.out.println("Perimeter of the rectangle is: " + peri);
        }

        static void triangle() {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter the length of the first side of the triangle: ");
            double side1 = sc.nextDouble();
            System.out.print("Enter the length of the second side of the triangle: ");
            double side2 = sc.nextDouble();
            System.out.print("Enter the length of the third side of the triangle: ");
            double side3 = sc.nextDouble();
            double peri = side1 + side2 + side3;
            System.out.println("Perimeter of the triangle is: " + peri);
        }

        static void square() {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter the side length of the square: ");
            double side = sc.nextDouble();
            double peri = 4 * side;
            System.out.println("Perimeter of the square is: " + peri);
        }

        static void parallelogram() {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter the length of the first side of the parallelogram: ");
            double side1 = sc.nextDouble();
            System.out.print("Enter the length of the second side of the parallelogram: ");
            double side2 = sc.nextDouble();
            double peri = 2 * (side1 + side2);
            System.out.println("Perimeter of the parallelogram is: " + peri);
        }

        static void trapezium() {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter the length of the first parallel side: ");
            double a = sc.nextDouble();
            System.out.print("Enter the length of the second parallel side: ");
            double b = sc.nextDouble();
            System.out.print("Enter the length of the third side: ");
            double c = sc.nextDouble();
            System.out.print("Enter the length of the fourth side: ");
            double d = sc.nextDouble();
            double peri = a + b + c + d;
            System.out.println("Perimeter of the trapezium is: " + peri);
        }

        static void rhombus() {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter the length of one side of the rhombus: ");
            double side = sc.nextDouble();
            double peri = 4 * side;
            System.out.println("Perimeter of the rhombus is: " + peri);
        }

        static void isoscelesTriangle() {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter the length of the equal sides of the isosceles triangle: ");
            double side = sc.nextDouble();
            System.out.print("Enter the length of the base of the isosceles triangle: ");
            double base = sc.nextDouble();
            double peri = 2 * side + base;
            System.out.println("Perimeter of the isosceles triangle is: " + peri);
        }
        
        static void equilateralTriangle() {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter the length of the sides of the equilateral triangle: ");
            double side = sc.nextDouble();
            double peri = 3 * side;
            System.out.println("Perimeter of the equilateral triangle is: " + peri);
        }
}