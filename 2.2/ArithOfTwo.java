import java.util.Scanner;

class ArithOfTwo
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        double in1 = scan.nextDouble();
        double in2 = scan.nextDouble();
        
        System.out.println(in1 + in2);
        System.out.println(in1 - in2);
        System.out.println(in1 * in2);
    }
}