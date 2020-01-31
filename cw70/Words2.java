public class Words2
{
   public static void main (String[] args)
   {
      System.out.println("Moti Urga");
      System.out.println();
      
      Dictionary2 webster = new Dictionary2 (1500, 52500);

      webster.pageMessage();
      webster.definitionMessage();   
   }
}
