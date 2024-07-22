package it.saimao.Lesson78_HashMap;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {

        Map<String, String> fruits = new HashMap<>();

        // Insert element into map
        fruits.put("apple", "မၢၵ်ႇၵႅမ်ႈၶွင်ႇ");
        fruits.put("orange", "မၢၵ်ႇၸွၵ်");
        fruits.put("coconut", "မၢၵ်ႇဢုၼ်");
        fruits.putIfAbsent("lemon", "မၢၵ်ႇဝၢၼ်");

        System.out.println(fruits.size());

        // Read element from map
        String apple = fruits.get("apple");
        System.out.println(fruits.getOrDefault("avocado", "default"));

        // Update element from map
        fruits.replace("apple", "မၢၵ်ႇပၢၼ်းတီး");
        System.out.println(fruits.get("apple"));

        // Remove element from map
        System.out.println("Before remove : " + fruits.size());
        fruits.remove("apple");
        System.out.println("After remove : " + fruits.size());

        // Loop map
        for (String value : fruits.values()) {
            System.out.println("Value : " + value);
        }

        for (String key : fruits.keySet()) {
            System.out.println("Key : " + key);
        }

        for (Map.Entry<String, String> entry : fruits.entrySet()) {
            System.out.println("Key : " + entry.getKey());
            System.out.println("Value : " + entry.getValue());
        }




    }
}
