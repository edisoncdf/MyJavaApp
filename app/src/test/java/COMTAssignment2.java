import java.util.Scanner;
public class COMTAssignment2 {
    public static void main(String[] args) {
        int minnum,maxnum;
        System.out.println("Enter lower limit: ");
        Scanner scanner = new Scanner(System.in);
        minnum= scanner.nextInt();
        System.out.println("Enter upper limit:");
        maxnum= scanner.nextInt();
        System.out.print("Counting: ");
        for (int index=++minnum; index<maxnum; index=index+1){
            System.out.print(index+" ");
        }
        }
    }

