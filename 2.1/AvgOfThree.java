import java.util.Scanner;

class AvgOfThree
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        int in1 = scan.nextInt();
        int in2 = scan.nextInt();
        int in3 = scan.nextInt();

        double avg = ((double)in1 + (double)in2 + (double)in3) / 3;
        System.out.println(avg);
    }
}
