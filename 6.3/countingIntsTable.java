import java.util.Scanner;

public class countingIntsTable
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        boolean acceptingInputs = true;
        int[] out = new int[0];

        System.out.println("type numbers between 0-50. type 'stop' to stop");

        while(acceptingInputs)
        {
            String in = scan.nextLine();

            if(in.equals("stop"))
            {
                acceptingInputs = false;
            }
            else if(Integer.parseInt(in) >= 0 && Integer.parseInt(in) <= 50)
            {
                int[] newout = new int[out.length + 1];

                for(int i = 0; i < out.length; i++)
                {
                    newout[i] = out[i];
                }

                newout[out.length] = Integer.parseInt(in);

                out = newout;
            }
            else
            {
                System.out.println("Invalid input, not counted");
            }
        }

        int[] entries = {0,0,0,0,0};

        for(int num : out)
        {
            if(num >= 0 && num <= 10) 
            {
                entries[0]++;
            }
            else if(num >= 11 && num <= 20)
            {
                entries[1]++;
            }
            else if(num >= 21 && num <= 30)
            {
                entries[2]++;
            }
            else if(num >= 31 && num <= 40)
            {
                entries[3]++;
            }
            else if(num >= 41 && num <= 50)
            {
                entries[4]++;
            }
        }

        System.out.print("0-10\t|\t");
        for(int i = 0; i < entries[0]; i++)
            System.out.print("*");

        System.out.println();

        System.out.print("11-20\t|\t");
        for(int i = 0; i < entries[1]; i++)
            System.out.print("*");

        System.out.println();

        System.out.print("21-30\t|\t");
        for(int i = 0; i < entries[2]; i++)
            System.out.print("*");

        System.out.println();

        System.out.print("31-40\t|\t");
        for(int i = 0; i < entries[3]; i++)
            System.out.print("*");

        System.out.println();

        System.out.print("41-50\t|\t");
        for(int i = 0; i < entries[4]; i++)
            System.out.print("*");

    }
}
