package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int max = -2_147_483_648;
        int min = 2_147_483_647;
        float sum = 0;
        int n = in.nextInt();
        int arr[] = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = in.nextInt();
            if(arr[i] < min) min = arr[i];
            else if(arr[i] > max) max = arr[i];
            sum += arr[i];
        }
        System.out.println("min: " + min + " max: " + max + " average: " + sum / n);
    }
}