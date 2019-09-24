import java.util.Scanner;

class toSeconds
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.print ("Hours: ");
        int hrs = scan.nextInt ();
        
        System.out.print ("Minutes: ");
        int mins = scan.nextInt ();
        
        System.out.print ("Seconds: ");
        int secs = scan.nextInt ();
        
        System.out.print ("Total Seconds: ");
        System.out.print ((hrs * 3600) + (mins * 60) + secs);
    }
}