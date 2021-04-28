import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class COMTAssignment5 {
    static void computeProduct(){
        int firstnumber, secondnumber;
        System.out.println("Enter first number: ");
        Scanner scanner = new Scanner(System.in);
        firstnumber=scanner.nextInt();
        System.out.println("Enter second number: ");
        Scanner input = new Scanner(System.in);
        secondnumber=scanner.nextInt();
        if ((10<=firstnumber)&&(firstnumber<51)&&(secondnumber<51)&&(10<=secondnumber))
        {
            System.out.println("The product of "+firstnumber+" and "+secondnumber+" is "+ firstnumber*secondnumber);
        }
        else
        {
            System.out.println("Not in range.");
        }

    }

    public static void main(String[] args) {
computeProduct();
    }

}
