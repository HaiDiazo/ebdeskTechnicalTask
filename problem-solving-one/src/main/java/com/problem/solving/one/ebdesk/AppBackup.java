package com.problem.solving.one.ebdesk;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class AppBackup
{
    /**
     * Batasan:
     * 2 <= nums.length <= 104
     * -109 <= nums[i] <= 109
     * -109 <= target <= 109
     * Hanya satu jawaban.
     */

    public static Boolean cekNumsAndTarget(int nums)
    {
        if (-109 <= nums && nums <= 109)
        {
            return true;
        }else{
            return false;
        }
    }

    public static Boolean cekNumsLength(int[] nums)
    {
        if (2 <= nums.length && nums.length <= 104)
        {
            return true;
        }else{
            return false;
        }
    }

    public static void getIndexValue(int[] nums, int target)
    {
        int jum, temp = 0;

        for (int i = 0; i < nums.length; i++)
        {
            for (int j = 0; j < nums.length; j++)
            {
                if (i != j)
                {
                    jum = nums[i] + nums[j];

                    if (jum == target)
                    {
                        temp++;
                    }

                    if (temp == 1)
                    {
                        System.out.println("["+i+", "+j+"]");
                        temp++;
                    }
                }
            }
        }
    }

    public static void main( String[] args )
    {
        Scanner input = new Scanner(System.in);
        Boolean ulang = true;
        int[] nums = {-4, -3, 3, 2, -3};
        int target = -6;
        String answer;

        while(ulang)
        {
            System.out.print("Input Menu: ");
            answer = input.nextLine();
            switch (answer)
            {
                case "nums":
                    System.out.print("Input Nums: ");

                    break;
                case "target":
                    System.out.print("Input Nums: ");
                    break;
                case "proses":

                    break;
            }
        }
    }
}
