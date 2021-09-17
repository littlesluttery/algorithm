package com.nlp.test;

import java.util.Scanner;

public class Main1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i <t ; i++) {
            int n = sc.nextInt();
            int p = sc.nextInt();
            int m = sc.nextInt();
            if (n==1){
                System.out.println(0);
            }else {
                System.out.println(2*n-3);
            }


        }
    }
}
