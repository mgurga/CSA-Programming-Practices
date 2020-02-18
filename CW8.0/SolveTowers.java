package cw80;

//********************************************************************
// SolveTowers.java Author: Lewis/Loftus
//
// Demonstrates recursion.
//
//********************************************************************
public class SolveTowers
{

//-----------------------------------------------------------------
 // Creates a TowersOfHanoi puzzle and solves it.

//-----------------------------------------------------------------
	public static void main (String[] args)
	{
		System.out.println("Moti Urga");
		TowersOfHanoi towers = new TowersOfHanoi(4);
		towers.solve();
 	}
}
