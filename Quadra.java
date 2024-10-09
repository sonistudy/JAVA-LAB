import java.util.Scanner;

public class Quadra {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

       
        System.out.print("Enter coefficient a: ");
        double a = scanner.nextDouble();
        
        System.out.print("Enter coefficient b: ");
        double b = scanner.nextDouble();
        
        System.out.print("Enter coefficient c: ");
        double c = scanner.nextDouble();


        double discriminant = b * b - 4 * a * c;


        if (discriminant > 0) {
           
            double root1 = (-b + Math.sqrt(discriminant)) / (2 * a);
            double root2 = (-b - Math.sqrt(discriminant)) / (2 * a);
            System.out.printf("The solutions are: %.2f and %.2f%n", root1, root2);
        } else if (discriminant == 0) {
            
            double root = -b / (2 * a);
            System.out.printf("There is one solution: %.2f%n", root);
        } else {
            
            System.out.println("There are no real solutions.");
        }

        scanner.close();
    }
}