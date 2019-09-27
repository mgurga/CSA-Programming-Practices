import java.util.Scanner;

public class toKm
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.print("Input miles: ");
        double in1 = scan.nextDouble();
        
        System.out.println("Kilometers: " + (in1 * 1.60935));
    }
}