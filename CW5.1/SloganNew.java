<<<<<<< HEAD


public class Slogan
{
   private String phrase;
   private static int count = 0;

   public Slogan (String str)
   {
      phrase = str;
      count++;
   }

   public String toString()
   {
      return phrase;
   }

   public static int getCount ()
   {
      return count;
   }
=======


public class Slogan
{
   private String phrase;
   private static int count = 0;

   public Slogan (String str)
   {
      phrase = str;
      count++;
   }

   public String toString()
   {
      return phrase;
   }

   public static int getCount ()
   {
      return count;
   }
>>>>>>> 2e050396cc1d05c6bc8d09d782280ffe9857c1b4
}