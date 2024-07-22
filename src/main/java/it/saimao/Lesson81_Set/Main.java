package it.saimao.Lesson81_Set;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        Set<String> northernCities = new LinkedHashSet<>();
        northernCities.add("muse");
        northernCities.add("namkham");
        northernCities.add("kyaukme");
        northernCities.add("kutkai");
        northernCities.add("lashio");

        List<String> southernCities = new ArrayList<>();
        southernCities.add("taunggyi");
        southernCities.add("panglong");
        southernCities.add("lashio");

        // Union / addAll
        northernCities.addAll(southernCities);
//        for (String city : northernCities) {
//            System.out.println(city);
//        }

        // Intersect / retainAll
        northernCities.retainAll(southernCities);
//        for (String city : northernCities) {
//            System.out.println(city);
//        }
        // Difference / removeAll
        northernCities.removeAll(southernCities);
        for (String city : northernCities) {
            System.out.println(city);
        }


    }
}
