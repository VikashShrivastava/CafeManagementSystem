package com.pack;

import java.util.*;

public class Chef{

    public void prepareOrder(List<Integer> orderList, int noOfChef, List<List<String>> menu,int orderId){

        PriorityQueue<Integer> pq = new PriorityQueue<>(noOfChef);

            pq.clear();
            List<Integer> time = new ArrayList<>();

            for (int j : orderList) {
                int t = Integer.parseInt(menu.get(j - 1).get(2));
                time.add(t);
            }
            Collections.sort(time);

            for(int k=time.size() -1;k>=0;k--){
                if(pq.size() < noOfChef){
                    pq.add(time.get(k));
                }else{
                    int minTime = pq.poll();
                    pq.add(minTime + time.get(k));
                }
            }
            while (pq.size() != 1){
                pq.poll();
            }

            int finishTime = pq.peek();
            System.out.println("Order id " + (orderId) + " gets ready in " + finishTime + " mins");

            System.out.println("======================================================================");



        }

    }

