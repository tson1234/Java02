package com.company;

import java.util.ArrayList;
import java.util.List;

public class RomoveElementsFromArrayListExample {
    public static void main(String[] args) {
        List<String> programminglanguages = new ArrayList<>();
        programminglanguages.add("C");
        programminglanguages.add("C++");
        programminglanguages.add("Java");
        programminglanguages.add("Kotlin");
        programminglanguages.add("Python");
        programminglanguages.add("Perl");
        programminglanguages.add("Ruby");

        System.out.println("Initial List: " + programminglanguages);

        programminglanguages.remove(5);
        System.out.println("After remove(5): " + programminglanguages);

        boolean isRemoved = programminglanguages.remove("Kotlin");
        System.out.println("After remove(\"Kotlin\"): " + programminglanguages);

        List<String> scriptLanguages = new ArrayList<>();
        scriptLanguages.add("Python");
        scriptLanguages.add("Ruby");
        scriptLanguages.add("Perl");

        programminglanguages.removeAll(scriptLanguages);
        System.out.println("After removeAll(scriptingLanguages): " + programminglanguages);

        programminglanguages.removeIf(n -> (n.charAt(0) == 'T'));

        System.out.println("After Removing all elements that start with \"C\": " + programminglanguages);

        programminglanguages.clear();
        System.out.println("After clear(): " + programminglanguages);
    }
}
