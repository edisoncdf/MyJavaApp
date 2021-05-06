import java.util.Scanner;

public class TestTriangle {
    public static double CalculatePerimeter(double a, double b, double c)
    {
        System.out.print("Calculating perimeter of triangle with ");
        System.out.println("a= "+a+" cm and b= "+b+" cm and c= "+c+" cm");
        double perimeter= a + b + c ;
        return perimeter;
    }
    public static double CalculateArea(double h,double b)
    {
        System.out.print("Calculating area of triangle with");
        System.out.println(" b ="+b+" cm and h= "+h+" cm");
        double area=0.5*h*b;
        return area;
    }

    public static boolean EquilateralTF(double a, double b, double c)
    {
        System.out.print("Testing if the triangle is equilateral with");
        System.out.println(" a= "+a+" cm and b= "+b+" cm and c= "+c+" cm");
        if((a==b)&&(b==c))
        {
          return true;
        }
        else;
        {
          return false;
        }
    }

    public static void main(String[] args)
    {
        System.out.print("a= ");
        Scanner scanner= new Scanner(System.in);
        double a= scanner.nextInt();
        System.out.print("b= ");
        double b= scanner.nextInt();
        System.out.print("c= ");
        double c= scanner.nextInt();
        System.out.print("d= ");
        double h= scanner.nextInt();
        double perimeter= CalculatePerimeter(a,b,c);
        double area= CalculateArea(b,h);
        boolean result= EquilateralTF(a, b, c);
        System.out.println("Perimeter of triangle is= "+perimeter+"cm.");
        System.out.println("Area of triangle is= "+area+"cm sq.");
        System.out.println("The triangle is equilateral= "+result+".");
    }
}
