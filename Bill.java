//Enter cost of 3 items from the user (using float data type) - a pencil, a pen and an eraser. You have to output the total cost of the items back to the user as their bill.
//(Add on : You can also try adding 18% gst tax to the items in the bill as an advanced problem) 

import java.util.*;

public class Bill {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Cost of Pen:");
        float pen = sc.nextFloat();

        System.out.print("Cost of Pencil:");
        float pencil = sc.nextFloat();

        System.out.print("Cost of Eraser:");
        float eraser = sc.nextFloat();

        float total = pen + pencil + eraser;

        System.out.println("Total Bill:" + total);
    }

}
