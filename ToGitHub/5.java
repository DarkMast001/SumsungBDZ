package com.company;

import javax.crypto.spec.PSource;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int arr[] = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = in.nextInt();
        }
        String str = "";
        for(int i = 0; i < n; i++){
            int copy_arr_i = arr[i];
            int del = 0;
            while(copy_arr_i > 0){
                del = copy_arr_i % 10;
                copy_arr_i /= 10;
            }
            str += del;
        }
        System.out.println(str);
    }
}