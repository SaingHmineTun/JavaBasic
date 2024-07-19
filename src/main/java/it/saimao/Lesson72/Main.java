package it.saimao.Lesson72;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        List<String> vector = new Vector<>(); // Upcasting
        Vector<String> list = (Vector<String>) vector; // Down-casting
        // Add new elements to Array list
        System.out.println("Before adding : " + list.size());
        list.addElement("Sai");
        list.add("Mao");
        list.add("From");
        list.add("Namkham");
        list.insertElementAt(",", 2);
        System.out.println("After adding : " + list.size());

        for (String str : list) {
            System.out.print(str + " : ");
        }
        System.out.println();

        // Retrieve element from list
        System.out.println("Index 2 : " + list.elementAt(2));
        System.out.println("Last index : " + list.getLast());

        // Update element in list
        list.setElementAt("Mu-se", list.size() - 1);
        Enumeration<String> iterator = list.elements();
        while (iterator.hasMoreElements()) {
            System.out.print(iterator.nextElement() + " ");
        }
        System.out.println();

        // Remove element from list
        list.removeElementAt(2);
        list.removeElement("Saii");
        System.out.println(list.size());

        System.out.println(list.contains("Saii"));


        System.out.println("Before clear " + list.isEmpty());
        list.removeAllElements();

        System.out.println("After clear " + list.isEmpty());

    }
}
