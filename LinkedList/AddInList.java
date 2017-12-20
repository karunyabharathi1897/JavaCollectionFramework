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
public class AddInList {
    public static void main(String[] args) {
        LinkedList<String> str=new LinkedList<String>();
        str.add("karu");
        str.add("priya");
        str.add("abi");
        str.add("kaviya");
        for(String s:str)
        {
            System.out.println(s);
        }
    }
}
