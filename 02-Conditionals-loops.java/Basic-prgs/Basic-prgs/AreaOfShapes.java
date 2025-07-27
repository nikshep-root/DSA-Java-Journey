import java.util.Scanner;
public class AreaOfShapes {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter the shape for which you want to calculate the area:");
        String shape = sc.nextLine();
        if (shape.equalsIgnoreCase("circle")) { circle(); }
        else if (shape.equalsIgnoreCase("rectangle")) { rectangle(); }
        else if (shape.equalsIgnoreCase("triangle")) { triangle(); }
        else if (shape.equalsIgnoreCase("square")) { square(); }
        else if (shape.equalsIgnoreCase("parallelogram")) { parallelogram(); }
        else if (shape.equalsIgnoreCase("trapezium")) { trapezium(); }
        else if (shape.equalsIgnoreCase("rhombus")) { rhombus(); }
        else if (shape.equalsIgnoreCase("isosceles triangle")) { isoscelesTriangle(); }
        else if (shape.equalsIgnoreCase("equilateral triangle")) { equilateralTriangle(); }
        else { System.out.println("Entered shape is invalid or else shape not found!!"); }
    }

        static void circle() {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter the radius of the circle: ");
            double radius = sc.nextDouble();
            double area = Math.PI * Math.pow(radius, 2);
            System.out.println("Area of the circle is: " + area);
        }

        static void rectangle() {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter the length of the rectangle ");
            double length = sc.nextDouble();
            System.out.print("Enter the breadth of the rectangle ");
            double breadth = sc.nextDouble();
            double area = length *breadth;
            System.out.println("Area of the rectangle is : " + area);
        }

        static void triangle() {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter the base of the triangle: ");
            double base = sc.nextDouble();
            System.out.print("Enter the height of the triangle: ");
            double height = sc.nextDouble();
            double area = 0.5 * base * height;
            System.out.println("Area of the triangle is: " + area);
        }

        
        static void square() {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter the side length of the square: ");
            double side = sc.nextDouble();
            double area = Math.pow(side, 2);
            System.out.println("Area of the square is: " + area);
        }        

        static void parallelogram() {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter the base of the parallelogram: ");
            double base = sc.nextDouble();
            System.out.print("Enter the height of the parallelogram: ");
            double height = sc.nextDouble();
            double area = base * height;
            System.out.println("Area of the parallelogram is: " + area);
        }

        static void trapezium() {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter the length of the first parallel side: "); 
            double a = sc.nextDouble();
            System.out.println("Enter the Length of the second parallel side : ");
            double b = sc.nextDouble();
            System.out.println("Enter the height of the trapeziuum : ");
            double height = sc.nextDouble();
            double area = 0.5 * (a + b) * height;
            System.out.println("Area of the trapezium is: " + area);
        }

        static void rhombus() {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the length of the first diagonal : ");
            double d1 = sc.nextDouble();
            System.out.println("Enter the length of the second diagonal : ");
            double d2 = sc.nextDouble();
            double area = 0.5 * d1 * d2;
            System.out.println("Area of the rhombus is: " + area);
        }

        static void isoscelesTriangle() {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter the base of the isosceles triangle: ");
            double base = sc.nextDouble();
            System.out.print("Enter the height of the isosceles triangle: ");
            double height = sc.nextDouble();
            double area = 0.5 * base * height;
            System.out.println("Area of the isosceles triangle is: " + area);
        }

        static void equilateralTriangle() {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter the side length of the equilateral triangle: ");
            double side = sc.nextDouble();
            double area = (Math.sqrt(3) / 4) * Math.pow(side, 2);
            System.out.println("Area of the equilateral triangle is: " + area);
        }
}   