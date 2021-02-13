package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args){
        System.out.println("Введите m и n:");
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int x;
        int[] nums = new int[n];
        for(int i = 1; i < n; i++)
        {
            x = 2 * i - 1;
            nums[i - 1] = x;
            System.out.println("Ответ: " + nums[i-1]);
        }

    }
}
