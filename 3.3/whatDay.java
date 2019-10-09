import java.util.Scanner; 

public class whatDay {
	public static void main (String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		
	    System.out.print("age = ");
	    int in1 = scan.nextInt();
	    System.out.print("day of week = ");
	    String in2 = scan.next();
	    
	    if(in1 < 18) 
	    {
	    	if(in2.equals("Monday") || in2.equals("Tuesday") || in2.equals("Wednesday") || in2.equals("Thursday") || in2.equals("Friday")) 
	    	{
	    		System.out.println("Today is a school day");
	    	} 
			else 
			{
	    		System.out.println("Celebrate");
	    	}
	    }
	    else 
	    {
	    	if(in2.equals("Monday") || in2.equals("Tuesday") || in2.equals("Wednesday") || in2.equals("Thursday") || in2.equals("Friday")) 
	    	{
	    		System.out.println("Today is a work day");
	    	} 
			else 
			{
	    		System.out.println("Celebrate");
	    	}
	    }
	} 
}
