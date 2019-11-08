import java.util.Scanner;

 class distanceBetweenPoints
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        int[] point1 = new int[2];
        int[] point2 = new int[2];
        
        System.out.println("Input points in (x,y) format (including parentheses)");
        System.out.print("Point #1: ");
        String in1 = scan.next();
        System.out.print("Point #2: ");
        String in2 = scan.next();
        
        in1 = in1.replace("(", "");
        in1 = in1.replace(")", "");
        in2 = in2.replace("(", "");
        in2 = in2.replace(")", "");
        
        String[] p1s = in1.split(",");
        String[] p2s = in2.split(",");

        //System.out.println(p1s[0]);
        //System.out.println(p1s[1]);

        point1[0] = Integer.parseInt(p1s[0]);
        point1[1] = Integer.parseInt(p1s[1]);
        point2[0] = Integer.parseInt(p2s[0]);
        point2[1] = Integer.parseInt(p2s[1]);
        
        double xpow = Math.pow(point2[0] - point1[0], 2);
        double ypow = Math.pow(point2[1] - point1[1], 2);
        
        double out = Math.sqrt(xpow + ypow);
        
        System.out.println("Distance = " + out);
        
    }
}