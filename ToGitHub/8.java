package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int del = 2;
        boolean flag = false;
        while(n > 1){
            if(n % del == 0){
                n /= del;
                if(!flag){
                    System.out.print(del);
                    flag = true;
                }
                System.out.print("*" + del);
            }
            else{
                del += 1;
            }
        }
    }
}