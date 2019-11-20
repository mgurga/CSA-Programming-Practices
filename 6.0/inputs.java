import java.util.Scanner;

public class inputs 
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

        for(int num : out)
        {
            System.out.println(num);
        }
    }
}
