import java.util.Scanner;

public class triArea
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        
        System.out.println("What are the values of the triangle");

        System.out.print("a = ");
        double a = scan.nextDouble();
        System.out.print("b = ");
        double b = scan.nextDouble();
        System.out.print("c = ");
        double c = scan.nextDouble();

        double s = (a + b + c) / 2;

        System.out.println("Area = " + String.format("%.3f", (Math.sqrt(s * (s - a) * (s - b) * (s - c)))));
    }
}