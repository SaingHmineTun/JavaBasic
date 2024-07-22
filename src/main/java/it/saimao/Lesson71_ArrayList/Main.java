package it.saimao.Lesson71_ArrayList;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<String> list = new ArrayList<>();
        // Add new elements to Array list
        System.out.println("Before adding : " + list.size());
        list.add("Sai");
        list.add("Mao");
        list.add("From");
        list.add("Namkham");
        list.add(2, ",");
        System.out.println("After adding : " + list.size());

        for (String str : list) {
            System.out.print(str + " : ");
        }
        System.out.println();

        // Retrieve element from list
        System.out.println("Index 2 : " + list.get(2));
        System.out.println("Last index : " + list.getLast());

        // Update element in list
        list.set(list.size() - 1, "Mu-se");
        Iterator<String> iterator = list.iterator();
        while (iterator.hasNext()) {
            System.out.print(iterator.next() + " ");
        }
        System.out.println();

        // Remove element from list
        list.remove(2); // Remove with index
        list.remove("Saii"); // Remove with element
        System.out.println(list.size());

        System.out.println(list.contains("Saii"));


        System.out.println("Before clear " + list.isEmpty());
        list.clear();

        System.out.println("After clear " + list.isEmpty());

    }

}
