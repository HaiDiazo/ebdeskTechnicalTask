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

        if (x == susunAngka && x > 0)
        {
            System.out.println(susunAngka);
            return true;
        }else{
            return false;
        }
    }

    public static Boolean palindrome(int x)
    {
        char[] number = String.valueOf(x).toCharArray();
        char[] temp = new char[number.length];
        int index = number.length - 1;

        for (int i = 0; i < number.length; i++)
        {
            temp[i] = number[index - i];
        }

        String num2 = String.valueOf(temp);

        if (String.valueOf(x).equals(num2))
        {
            return true;
        }else {
            return false;
        }
    }


    public static void main( String[] args )
    {
        Scanner input = new Scanner(System.in);

        System.out.print("Input: x = ");
        System.out.println(palindrome(input.nextInt()));
    }
}
