import java.util.Scanner;
    public class COMTAssignment1 {
            public static void main(String[] args) {
                int Firstnumber, Secondnumber, Thirdnumber;
                Scanner scanner = new Scanner(System.in);
                System.out.println("First number: ");
                Firstnumber = scanner.nextInt();
                System.out.println("Second number: ");
                Secondnumber = scanner.nextInt();
                System.out.println("Third number: ");
                Thirdnumber = scanner.nextInt();
                if ((Firstnumber<= Secondnumber)&&(Firstnumber<= Thirdnumber))
                {
                    System.out.println("The smallest number is "+Firstnumber);
                }
                else
                {
                    if ((Secondnumber<=Firstnumber)&&(Secondnumber<= Thirdnumber))
                    {
                        System.out.println("The smallest number is "+Secondnumber);
                    }
                    else
                    {
                        System.out.println("The smallest number is "+Thirdnumber);
                    }
                }
            }
        }
