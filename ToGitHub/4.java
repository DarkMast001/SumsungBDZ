package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int arr[] = new int[100_000];
        int k = 0;
        while(n != 0){
            arr[k] = n;
            k++;
            n = in.nextInt();
        }
        for(int i = 0; i <= k; i++){
            for(int j = 0; j <= k + 1; j++){
                if(arr[j] < arr[j + 1]){
                    int tmp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = tmp;
                }
            }
        }
        for(int i = 0; i < 5; i++){
            System.out.println(arr[i]);
        }
    }
}