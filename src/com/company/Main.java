package com.company;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Integer> lst = new ArrayList<>(10);
        for (int i = 0; i < 10; i++) {
            lst.add((int) (Math.random() * 10));
        }
        System.out.println(lst);
        lst.remove(0);
        lst.remove(0);
        System.out.println(lst);
        lst.remove(lst.size() - 1);
        System.out.println(lst);
    }
}
