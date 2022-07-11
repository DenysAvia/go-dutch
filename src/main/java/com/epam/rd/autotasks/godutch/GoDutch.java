package com.epam.rd.autotasks.godutch;
import java.util.Scanner;
public class GoDutch {

    public static void main(String[] args) {
        //Write code here
        Scanner sc = new Scanner(System.in);
        int bill = sc.nextInt();
        int frds = sc.nextInt();
        if (bill<0) System.out.println("Bill total amount cannot be negative"); else {if (frds<=0)
            System.out.println("Number of friends cannot be negative or zero"); else {
            int total = (bill + (bill/10))/frds;
            System.out.println(total);}}

    }
}
