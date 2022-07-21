package Question3;

import java.util.Scanner;

public class Question_3{



    public static void main(String[] args) {
        ShapeImpl shape = new ShapeImpl();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your choice: C for circle, S for Square, R for rectangle");
        String choice = scanner.nextLine();
        if (choice.equalsIgnoreCase("c")) {

            System.out.println("Enter radius of a circle");
            while (!scanner.hasNextDouble()) {
                System.out.println("Please enter a valid number");
                scanner.nextLine();
            }
            double radius = scanner.nextDouble();
            System.out.println(shape.area(radius));
            System.out.println(shape.perimeter(radius));
        }

         else if (choice.equalsIgnoreCase("R")) {

            System.out.println("Enter length of a Rectangle");
            while (!scanner.hasNextDouble()) {
                System.out.println("Please enter a valid number");
                scanner.nextLine();
            }
            double length = scanner.nextDouble();
            System.out.println("Enter breadth of a Recatangle");
            double breadth = scanner.nextDouble();
            System.out.println(shape.area(length, breadth));
            System.out.println(shape.perimeter(length, breadth));
        }

         else if (choice.equalsIgnoreCase("S")) {

            System.out.println("Enter length of a Square");
            while (!scanner.hasNextDouble()) {
                System.out.println("Please enter a valid number");
                scanner.nextLine();
            }
            double length = scanner.nextDouble();
            System.out.println(shape.area(length, length));
            System.out.println(shape.perimeter(length, length));
        }  else {
            System.out.println("Invalid");
        }


    }


}
