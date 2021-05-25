import java.util.Scanner;

public class COMTAssignment4 {
    static int calculatePrice () {
        int ipadquantity;
        int ipadprice = 1000;
        System.out.println("Enter the number of iPads: ");
        Scanner scanner = new Scanner(System.in);
        ipadquantity = scanner.nextInt();
        int cost= ipadprice*ipadquantity;
        return cost;
    }

    public static void main(String[] args)
    {
        System.out.println("The Total Cost of the iPads is: $" + calculatePrice());
    }
}

