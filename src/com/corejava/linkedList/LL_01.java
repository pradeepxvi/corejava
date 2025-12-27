package com.corejava.linkedList;

import java.util.*;

class LL_01 {
    public static void main(String[] args) {

        String[] names = { "pradeep", "kunwar" };

        for (String name : names) {
            System.out.println("name = " + name);
        }

        Arrays.stream(names).forEach((element) -> System.out.println(element));

        LinkedList<String> list = new LinkedList<String>();

        list.add("One");
        list.add("Two");
        list.add("Three");
        list.add("Four");
        list.add("Five");

        list.addFirst("first");
        list.addLast("last");

        System.out.println(list.getFirst());
        System.out.println(list.getLast());

        LinkedList<String> newList = new LinkedList<>();
        for (int i = 1; i <= 10; i++) {
            newList.add(String.valueOf(i));
        }

        System.out.println(list);
        System.out.println("contained One ??  = " + newList.contains("One"));

        list.addAll(newList);

        System.out.println(list);

        list.forEach(element -> System.out.println(element));

        Iterator<String> it = list.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
        for (String li : list) {
            System.out.println("for  = " + li);
        }
        System.out.println("peek = " + list.peek());

        System.out.println("isEmpty ? = " + list.isEmpty());
        list.clear();
        System.out.println("isEmpty ? = " + list.isEmpty());
        System.out.println(list);
    }
}