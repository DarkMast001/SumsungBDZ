package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int arr[] = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = in.nextInt();
        }
        int max = -2147483648;
        for(int i = 0; i < n; i++){
            if(arr[i] % 100 == 11 && arr[i] > max){
                max = arr[i];
            }
        }
        System.out.println(max);
    }
}