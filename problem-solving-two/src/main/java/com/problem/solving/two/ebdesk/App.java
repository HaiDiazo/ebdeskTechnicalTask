package com.problem.solving.two.ebdesk;

import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App 
{
    public static Boolean palindromeInteger(int x)
    {
        int angkaTerakhir, susunAngka = 0, tempX = x;

        while(tempX != 0){
            angkaTerakhir = tempX % 10;
            susunAngka = susunAngka * 10 + angkaTerakhir;
            tempX = tempX / 10;
        }

        if (x == susunAngka)
        {
            return true;
        }else{
            return false;
        }
    }


    public static Boolean palindrome(int x)
    {
        char[] number = String.valueOf(x).toCharArray();



        return true;
    }


    public static void main( String[] args )
    {
        Scanner input = new Scanner(System.in);

        System.out.print("Input: x = ");
        System.out.println(palindromeInteger(input.nextInt()));
    }
}
