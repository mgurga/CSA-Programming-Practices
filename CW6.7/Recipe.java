import java.util.ArrayList;
import java.util.ListIterator;

public class cw6o7 
{
    public static void main(String[] args) 
    {
        System.out.println("Moti Urga");

        ArrayList<String> ingredients = new ArrayList<String>();
        ingredients.add("Flour");
        ingredients.add("sugar");
        ingredients.add("cocoa");
        ingredients.add("oil");
        ingredients.add("butter");
        ingredients.add("eggs");
        ingredients.add("baking soda");

        System.out.println("To make a chocolate cake, use the following " + ingredients.size() + " ingredients");

        ListIterator iterator = ingredients.listIterator();

        while(iterator.hasNext())
            System.out.println(iterator.next());
    }
}
