public class arrays {
    public static void main(String[] args) {
        int[][] array1 = new int[5][5];
        int[][] array2 = new int[5][5];
        int[][] array3 = new int[5][5];

        //calculate
        for(int i = 0; i < 5; i++) 
        {
            for(int j = 0; j < 5; j++) 
            {
                array1[i][j] = i;
            }
        }
        for(int i = 0; i < 5; i++) 
        {
            for(int j = 0; j < 5; j++) 
            {
                array2[i][j] = j;
            }
        }
        for(int i = 0; i < 5; i++) 
        {
            for(int j = 0, a = 4; j < 5; j++, a--) 
            {
                array3[j][i] = i*5 + a + 1;
            }
        }

        //printing stuff
        for(int i = 0; i < 5; i++) 
        {
            for(int j = 0; j < 5; j++) 
            {
                System.out.print(array1[j][i] + " ");
            }
            System.out.println();
        }
        System.out.println();
        for(int i = 0; i < 5; i++) 
        {
            for(int j = 0; j < 5; j++) 
            {
                System.out.print(array2[j][i] + " ");
            }
            System.out.println();
        }
        System.out.println();
        for(int i = 0; i < 5; i++) 
        {
            for(int j = 0; j < 5; j++) 
            {
                System.out.print(array3[j][i] + " ");
            }
            System.out.println();
        }
    }
}
