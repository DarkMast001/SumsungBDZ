package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Long n = in.nextLong();
        Long copy_n = n;
        Long newNum = 0L;
        while(copy_n > 0){
            Long del = copy_n % 10;
            copy_n /= 10;
            newNum = newNum * 10 + del;
        }
        /*System.out.println(newNum);
        System.out.println(copy_n);*/
        if(newNum == n) System.out.println("Yes");
        else System.out.println("No");
    }
}