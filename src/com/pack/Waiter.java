package com.pack;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.util.*;

public class Waiter {

    private String nameOfWaiter = "Jack";

    public void waiterIntro() {
        System.out.println("Hii, my name is " + this.nameOfWaiter + " , your waiter.");
    }

    public void showMenu() {

        Menu menu = new Menu();
        List<List<String>> menuList = menu.getMenu();

        for (List<String> l : menuList) {
            System.out.println("ItemId : " + l.get(0) + ", ItemName : " + l.get(1) + ", Preparation Time :" + l.get(2));
        }
    }

    public void getOrder(Cafe cafe, Menu menu) throws CustException {

        Scanner sc = new Scanner(System.in);

        List<List<Integer>> ordersList = new ArrayList();

        System.out.println("Order Please : ");

        int orderId = 1;

        while (true) {

            System.out.println("Want to order again ? (yes/no): ");
            String s = sc.next();

            if (s.equals("yes")) {

                System.out.println("Order no : " + orderId);
                System.out.println("Order from the menu Please :");
                this.showMenu();

                List<Integer> l = new ArrayList();

                while(true){
                    System.out.println("Enter itemId to order :");
                    int id = sc.nextInt();
                    if(id < 1 || id > 4){
                        throw new CustException("Please enter valid itemId ...... Restart the process.");
                    }

                    l.add(id);
                    System.out.println("Want to add something more ? (yes/no) :");
                    String more = sc.next();

                    if(!more.equals("yes") && !more.equals("no")){
                        throw new CustException("Please type 'yes' for adding item else 'no' properly ....... Restart the process.");
                    }

                    if(more.equals("no")){
                        break;
                    }
                }
                ordersList.add(l);

                DateFormat dateFormat = new SimpleDateFormat("HH:mm:ss");
                Date date = new Date();
                String time = dateFormat.format(date);


                System.out.println("Order Placed -- > orderId is " + orderId + " ---> At time : " + time);

                System.out.println("======================================================================");

                Chef chef = new Chef();

                chef.prepareOrder(l, cafe.getNoOfChef(), menu.getMenu(), orderId);
                orderId++;
            } else if (s.equals("no")) {
                break;
            } else {
                throw new CustException("Please select the option wisely......");
            }

        }

    }
}