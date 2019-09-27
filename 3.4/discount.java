import java.util.Scanner; 
public class discount 
{ 
	public static void main (String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		
	    System.out.print("purchase price = ");
	    double in1 = scan.nextDouble();
	    System.out.print("day of week = ");
	    String in2 = scan.next();
	    boolean eligible = false;
	    
	    if(in2.equals("Tuesday") && in1 > 20.00) 
	    {
	    	eligible = true;
	    }
	    if(in2.equals("Wednesday") || in1 > 40.00) 
	    {
	    	eligible = true;
	    }
	    if(in2.equals("Friday") && !(in1 % 2 == 0)) 
	    {
	    	eligible = true;
	    }
	    
	    if(eligible) 
	    {
	    	System.out.println("The purchase is eligible for a discount");
	    } 
	    else
	    {
	    	System.out.println("The purchase is NOT eligible for a discount");
	    }
	    
	} 
}
