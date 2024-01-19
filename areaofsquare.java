import java.util.*;

public class areaofsquare {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the side of the square: ");
        double s = sc.nextDouble();

        double area = s * s;

        System.out.println("Area of Square: " + area);
    }

}
