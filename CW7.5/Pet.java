package cw75;

import java.text.DecimalFormat; // to format the weight in pounds
public abstract class Pet
{
    //Instance Variables
    protected String name;
    protected int age;
    protected double weight; //in kg
    DecimalFormat fmt = new DecimalFormat("#.#"); // create formatting object
    protected String food;
    abstract public int monthlyFeeding();

    //constructors
    public Pet (String name, int age, double weight, String food)
    {
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.food = food;
    }// end full constructor called child classes

    //Getters
    public String getName()
    {
        return name;
    }//end name getter

    //Setters
    public void setName(String name)
    {
        this.name = name;
    }//end name setter

    //Brain Methods
    abstract public String Speak(); // to be overridden in all child classes

    public double AmericanFreedomUnits()
    {
        return weight *2.205;
    }//end method to convert weight value into pounds

    //toString method
    public String toString()
    {
        String output = "Name: " + name;
        output += "\nAge: " + age;
        output += "\nWeight: " + weight + " kg" + "(" + fmt.format(AmericanFreedomUnits() )+ " in pounds)";
        output += "\nFood: " + food;

        return output;
    }//end toString which is called in all child classes
}//end abstract class Pet which is parent to child classes