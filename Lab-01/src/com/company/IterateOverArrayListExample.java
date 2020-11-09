package com.company;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class IterateOverArrayListExample {
    public static void main(String[] args) {
        List<String> tvshows = new ArrayList<>();
        tvshows.add("Breaking bad");
        tvshows.add("Game Of Thrones");
        tvshows.add("Friends");
        tvshows.add("Prison break");

        System.out.println("=== Iterate using Java 8 forEach and lambda ===");
        tvshows.forEach(tvshow -> {
            System.out.println(tvshow);
        });

        System.out.println("\n=== Iterate using an iterator() ===");
        Iterator<String> tvShowIterator = tvshows.iterator();
        while (tvShowIterator.hasNext()) {
            String tvshow = tvShowIterator.next();
            System.out.println(tvshow);
        }

        System.out.println("\n=== Iterate using listIterator() to traverse in both directions ===");
        ListIterator<String> tvShowListIterator = tvshows.listIterator(tvshows.size());
        while (tvShowListIterator.hasPrevious()) {
            String tvShow = tvShowListIterator.previous();
            System.out.println(tvShow);
        }

        System.out.println("\n=== Iterate using simple for-each loop ===");
        for (String tvShow: tvshows) {
            System.out.println(tvShow);
        }

        System.out.println("\n=== Iterate using for loop with index ===");
        for (int i =0; i< tvshows.size(); i++) {
            System.out.println(tvshows.get(i));
        }



    }
}
