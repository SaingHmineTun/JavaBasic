package it.saimao.Lesson74;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        LinkedList<String> list = new LinkedList<>();
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
        System.out.println("Peek first - " + list.peekFirst());
        System.out.println("Peek last - " + list.peekLast());

        System.out.println("Before poll - " + list.size());
        System.out.println("Poll first - " + list.pollFirst());
        System.out.println("After poll - " + list.size());

        // Update element in list
        list.set(list.size() - 1, "Mu-se");
        Iterator<String> iterator = list.descendingIterator();
        while (iterator.hasNext()) {
            System.out.print(iterator.next() + " ");
        }
        System.out.println();

        // Remove element from list
        list.remove(2);
        list.remove("Saii");
        System.out.println(list.size());

        System.out.println(list.contains("Saii"));


        System.out.println("Before clear " + list.isEmpty());
        list.clear();

        System.out.println("After clear " + list.isEmpty());

    }
}
