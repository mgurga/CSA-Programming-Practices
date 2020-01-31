package cw71;

public class Messages { 
	public static void main (String[] args) { 
		Thought thinking = new Thought(); 
		Advice speaking = new Advice(); 
		
		System.out.println("Moti Urga");
		System.out.println();
		
		thinking.message(); 
		speaking.message(); 
	}
} 
