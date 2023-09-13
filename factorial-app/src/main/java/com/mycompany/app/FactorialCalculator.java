package com.mycompany.app;

import java.util.InputMismatchException;
import java.util.Scanner;

public class FactorialCalculator {

    public static void calFactorial() throws InputMismatchException {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = sc.nextInt();
        if(num == 0){
            System.out.println("Factorial: "+ 1);
            return;
        }else if(num<0){
            System.out.println("Number cannot be negative");
            return;
        }
        int fact = 1, i;
        for(i=1; i<=num; i++){
            fact = fact * i;
        }
        System.out.println("Factorial: "+ fact);
    }

}
