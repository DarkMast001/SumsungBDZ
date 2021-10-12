package com.company;

import java.util.Scanner;

public class Main {

    public static int Func(int a, int b){
        int carry	= 0x00;
        while(b != 0x00)
        {
            carry	= (a & b);
            a	= a ^ b;
            b	= (carry << 1);
        }
        return a;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        System.out.println(Func(a, b));
    }
}