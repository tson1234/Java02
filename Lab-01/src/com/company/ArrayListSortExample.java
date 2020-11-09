package com.company;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class ArrayListSortExample {
    public static void main(String[] args){
        List<String> names = new ArrayList<>();
        names.add("Lisa");
        names.add("Jennifer");
        names.add("Mark");
        names.add("David");

        System.out.println("Names : " + names);

        names.sort(new Comparator<String>() {
            @Override
            public int compare(String name1, String name2) {
                return 0;
            }
        });

        names.sort(Comparator.naturalOrder());

        System.out.println("Sorted Names : " + names);

    }
}
