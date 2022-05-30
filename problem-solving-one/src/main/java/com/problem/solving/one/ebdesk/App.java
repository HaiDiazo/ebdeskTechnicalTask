package com.problem.solving.one.ebdesk;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App 
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
        return -109 <= nums && nums <= 109;
    }

    public static Boolean cekNumsLength(List<Integer> nums)
    {
        return 2 <= nums.size() && nums.size() <= 104;
    }

    public static void getIndexValue(List<Integer> nums, int target)
    {
        int jum, temp = 0;

        for (int i = 0; i < nums.size(); i++)
        {
            for (int j = 0; j < nums.size(); j++)
            {
                if (i != j)
                {
                    jum = nums.get(i) + nums.get(j);

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

        if (temp == 0)
        {
            System.out.println("target not found");
        }
    }


    public static void main( String[] args )
    {
        List<Integer> nums = new ArrayList<>();
        Scanner inputLine = new Scanner(System.in);
        Scanner inputInt = new Scanner(System.in);
        int target, num;

        while(true)
        {
            System.out.println(nums);
            if (cekNumsLength(nums) || nums.size() < 2)
            {
                if (nums.size() >= 2) System.out.print("Tambahkan nilai lagi? (y/n): ");
                if (nums.size() < 2 || inputLine.nextLine().startsWith("y"))
                {
                    System.out.print("Masukan nilai: ");
                    num = inputInt.nextInt();
                    if (cekNumsAndTarget(num)){
                        nums.add(num);
                    }else{
                        System.out.println("Out of range");
                    }
                }else{
                    break;
                }
            }else{
                System.out.println("Size array out of range");
                break;
            }
        }

        do {
            System.out.print("Masukan target: ");
            target = inputInt.nextInt();
        } while (!cekNumsAndTarget(target));
        
        inputLine.close();
        inputInt.close();

        getIndexValue(nums, target);
    }
}
