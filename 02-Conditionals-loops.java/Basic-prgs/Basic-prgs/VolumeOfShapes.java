/*In this program i will use Hashmap and the time complexity of this program is 0(1) */

import java.util.HashMap;
import java.util.Scanner;
public class VolumeOfShapes {
    static HashMap<String, Double> volumeMap = new HashMap<>();
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the shape for which you want to calculate the volume:");
        String shape = sc.nextLine().toLowerCase();
        switch (shape) {
            case "sphere":
                sphere();
                break;

            case "cube":
                cube();
                break;

            case "cuboid":
                cuboid();
                break;

            case "cylinder":
                cylinder();
                break;

            case "cone":
                cone();
                break;

            case "pyramid":
                pyramid();
                break;

            case "prism":
                prism();
                break;
            
            case "hemisphere":
                hemisphere();
                break;

            default:
                System.out.println("Entered shape is invalid or else shape not found!!");
        }
    }

    static void sphere() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the radius of the sphere: ");
        volumeMap.put("Sphere", sc.nextDouble());
        double radius = volumeMap.get("Sphere");
        double volume = (4.0 / 3) * Math.PI * Math.pow(radius, 3);
        System.out.println("Volume of the sphere is: " + volume);
    }

    static void cube() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the side length of the cube: ");
        volumeMap.put("Cube", sc.nextDouble());
        double side = volumeMap.get("Cube");
        double volume = Math.pow(side, 3);
        System.out.println("Volume of the cube is: " + volume);
    }

    static void cuboid() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of the cuboid: ");
        volumeMap.put("Cuboid Length", sc.nextDouble());
        System.out.println("Enter the breadth of the cuboid: ");
        volumeMap.put("Cuboid Breadth", sc.nextDouble());
        System.out.println("Enter the height of the cuboid: ");
        volumeMap.put("Cuboid Height", sc.nextDouble());
        double length = volumeMap.get("Cuboid Length");
        double breadth = volumeMap.get("Cuboid Breadth");
        double height = volumeMap.get("Cuboid Height");
        double volume = length * breadth * height;
        System.out.println("Volume of the cuboid is: " + volume);
    }

    static void cylinder() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the radius of the cylinder: ");
        volumeMap.put("Cylinder Radius", sc.nextDouble());
        System.out.println("Enter the height of the cylinder: ");
        volumeMap.put("Cylinder Height", sc.nextDouble());
        double radius = volumeMap.get("Cylinder Radius");
        double height = volumeMap.get("Cylinder Height");
        double volume = Math.PI * Math.pow(radius, 2) * height;
        System.out.println("Volume of the cylinder is: " + volume);
    }

    static void cone() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the radius of the cone: ");
        volumeMap.put("Cone Radius", sc.nextDouble());
        System.out.println("Enter the height of the cone: ");
        volumeMap.put("Cone Height", sc.nextDouble());
        double radius = volumeMap.get("Cone Radius");
        double height = volumeMap.get("Cone Height");
        double volume = (1.0 / 3) * Math.PI * Math.pow(radius, 2) * height;
        System.out.println("Volume of the cone is: " + volume);
    }

    static void pyramid() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the base area of the pyramid: ");
        volumeMap.put("Pyramid Base Area", sc.nextDouble());
        System.out.println("Enter the height of the pyramid: ");
        volumeMap.put("Pyramid Height", sc.nextDouble());
        double baseArea = volumeMap.get("Pyramid Base Area");
        double height = volumeMap.get("Pyramid Height");
        double volume = (1.0 / 3) * baseArea * height;
        System.out.println("Volume of the pyramid is: " + volume);
    }
    
    static void prism() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the base area of the prism: ");
        volumeMap.put("Prism Base Area", sc.nextDouble());
        System.out.println("Enter the height of the prism: ");
        volumeMap.put("Prism Height", sc.nextDouble());
        double baseArea = volumeMap.get("Prism Base Area");
        double height = volumeMap.get("Prism Height");
        double volume = baseArea * height;
        System.out.println("Volume of the prism is: " + volume);
    }

    static void hemisphere() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the radius of the hemisphere: ");
        volumeMap.put("Hemisphere Radius", sc.nextDouble());
        double radius = volumeMap.get("Hemisphere Radius");
        double volume = (2.0 / 3) * Math.PI * Math.pow(radius, 3);
        System.out.println("Volume of the hemisphere is: " + volume);
    }
}
