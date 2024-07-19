package it.saimao.Lesson73;

import java.util.Enumeration;
import java.util.List;
import java.util.Stack;
import java.util.Vector;

public class Main {
    public static void main(String[] args) {

        Stack<String> list = new Stack<>(); // Upcasting
        // Add new elements to Array list
        System.out.println("Before adding : " + list.size());
        list.addElement("Sai");
        list.add("Mao");
        list.push("From");
        list.push("Namkham");
        list.insertElementAt(",", 2);
        System.out.println("After adding : " + list.size());

        for (String str : list) {
            System.out.print(str + " : ");
        }
        System.out.println();

        // Retrieve element from list
        System.out.println("Peek : " + list.peek());
        System.out.println("After peek : " + list.size());
        System.out.println("Pop : " + list.pop());
        System.out.println("After pop : " + list.size());


        // Search
        System.out.println(list.search("MAO"));
    }
}
