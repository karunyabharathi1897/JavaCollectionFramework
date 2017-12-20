/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LinkedList;

import java.util.LinkedList;

/**
 *
 * @author Dell
 */
public class ListOperations {
    public static void main(String[] args) {
        LinkedList<String> str=new LinkedList<String>();
        str.add("karu");
        str.add("swa");
        str.add("kaviya");
        System.out.println(str);
        //to add in first and last position
        str.addFirst("buji");
        str.addLast("jimmy");
        System.out.println(str);
        //to use get and set methods
        Object a=str.get(0);
        System.out.println(a);
        str.set(1, "karun");
        System.out.println(str);
        //to remove an element and add element at position
        str.add(1,"dingu");
        System.out.println(str);
                
        str.remove(2);
        System.out.println(str);
        //to remove first and last element
        str.removeFirst();
        str.removeLast();
        System.out.println(str);
     
    }
    
}
