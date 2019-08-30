package com.company;

import java.util.Scanner;

class Favorites1
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        double in1 = scan.nextInt();
        double in2 = scan.nextInt();
        double in3 = scan.nextInt();

        double avg = (in1 + in2 + in3) / 3;
        System.out.println(avg);
    }
}
