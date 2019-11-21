import java.util.ArrayList;

public class myGroceries 
{
    public static void main(String[] args) 
    {
        ArrayList<String> groceries = new ArrayList<String>();

        groceries.add("Cheeto");
        groceries.add("Milk");
        groceries.add("Banana");

        System.out.println("Original List: ");
        System.out.println(groceries);
        System.out.println("with a length of " + groceries.size());

        groceries.remove(1);

        System.out.println();

        System.out.println("Removed 2nd item: ");
        System.out.println(groceries);
        System.out.println("with a length of " + groceries.size());

        System.out.println();

        System.out.println("First Item:");
        System.out.println(groceries.get(0));
    }
}
