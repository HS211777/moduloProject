package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
	Scanner input = new Scanner(System.in);

    System.out.println("Enter an integer:");
    int num = input.nextInt();
    if ((num % 2) == 0){
        System.out.println("This number is even");
    }
    else{
        System.out.println("this number is odd");
    }
    System.out.println("Enter another integer:");
    int num2 = input.nextInt();
    double div = (double) num / num2;
    int mod = num % num2;
    System.out.println(div);
    System.out.println(mod);
    }
}
