import java.util.Scanner;

class FirstNameLastName
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.print ("First Name: ");
        String fn = scan.nextLine();
        
        System.out.print ("Last Name: ");
        String ln = scan.nextLine ();
        
        System.out.println(fn.concat(ln));
        System.out.println("First Name Length: " + fn.length() + 
        				   " Last Name Length: " + ln.length() + 
        				   " Combined Length: " + (fn.length() + ln.length()));
        System.out.println(fn.concat(ln).toUpperCase());
    }
}