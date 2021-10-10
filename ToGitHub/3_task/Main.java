package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int sum = 0;
        while(n != 0){
            sum += n;
            n = in.nextInt();
        }
        double c = Math.sqrt(sum);
        System.out.println((int)c);
    }
}