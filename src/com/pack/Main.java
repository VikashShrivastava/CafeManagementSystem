package com.pack;

import java.util.*;

public class Main {
    public static void main(String[] args) throws CustException {

        System.out.println("======================================================================");

        Scanner sc = new Scanner(System.in);
        System.out.println("Please provide Cafe's Configuration !!");
        System.out.println("Number of chef's in the cafe : ");
        int noOfChef =sc.nextInt();

        if(noOfChef <= 0){
            throw new CustException("Number of chef's can't be zero or less.");
        }

        Cafe cafe = new Cafe(noOfChef);
        System.out.println(cafe);

        Menu menu = new Menu();

        Waiter waiter = new Waiter();
        waiter.waiterIntro();
        waiter.getOrder(cafe,menu);

        System.out.println("Hope you enjoyed !!");

        System.out.println("======================================================================");

    }
}
