package com.example.lib;

import java.util.Scanner;

public class MyClass {
    public static void main ( String[] args ) {

        int a,b=0;

        Scanner scanner = new Scanner(System.in);

        System.out.println("�п�J�Ʀr");

        a = scanner.nextInt();

        for(;a>0;a--){

            b+=a;
        }
        System.out.println("�`�M��"+b);
    }
}
