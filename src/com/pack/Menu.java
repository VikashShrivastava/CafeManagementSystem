package com.pack;

import java.util.*;

public class Menu {

    List<List<String>> menu = new ArrayList();

    public List<List<String>> getMenu(){

        List<String> item1 = new ArrayList();
        item1.add("1");item1.add("Sandwich");item1.add("5");

        List<String> item2 = new ArrayList();
        item2.add("2");item2.add("Coffe");item2.add("3");

        List<String> item3 = new ArrayList();
        item3.add("3");item3.add("Cereal");item3.add("3");

        List<String> item4 = new ArrayList();
        item4.add("4");item4.add("Pizza");item4.add("7");

        menu.add(item1);
        menu.add(item2);
        menu.add(item3);
        menu.add(item4);

        return this.menu;

    }
}
