import java.util.Scanner;

class sphereVolSA
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        
        System.out.println("What is the radius of the sphere");
        System.out.print("r = ");
        double in1 = scan.nextDouble();
        
        System.out.println("Volume: " + String.format("%.4f", ((4.0 /3.0 ) * Math.PI * Math.pow(in1, 3))));
        System.out.println("Surface Area: " + String.format("%.4f",(4 * Math.PI * Math.pow(in1, 2))));
    }
}