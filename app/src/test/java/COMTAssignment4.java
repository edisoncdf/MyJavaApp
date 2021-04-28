import java.util.Scanner;

public class COMTAssignment4 {
        static void calculatePrice () {
            int ipadquantity;
            int ipadprice = 1000;
            System.out.println("Enter the number of iPads: ");
            Scanner scanner = new Scanner(System.in);
            ipadquantity = scanner.nextInt();
            System.out.println("The Total Cost of the iPads is: $" + ipadprice * ipadquantity);
        }

    public static void main(String[] args) {
        calculatePrice();
    }
    }



