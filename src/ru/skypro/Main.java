package ru.skypro;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Main {

    public static void main(String[] args) {
        List<String> abc = new ArrayList<>(List.of("Biba", "Boba", "Biba", "Pupa", "Biba"));
        Set<String> abc1 = new HashSet<>();
        Set<String> abc2 = new HashSet<>();
        int a = 1;
        for (String word: abc) {
            if (!abc1.add(word)) {
                abc2.add(word);
                a++;
            }
        }
        for (String s: abc1) {
            if (abc2.contains(s)) {
                abc1.remove(s);
            }
        }
        System.out.println(a);
        System.out.println(abc1);
    }
}
