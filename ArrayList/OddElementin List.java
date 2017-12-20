/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ArrayList;
import java.util.*;
/**
 *
 * @author Dell
 */
public class ArrayListOddElement {
    public static void main(String[] args) {
        
    
    ArrayList str=new ArrayList();
    int i;
    for(i=0;i<=10;i++)
    {
        str.add(i);
    }
        System.out.println(str);
    Iterator itr=str.iterator();
    while(itr.hasNext())
    {
        int j=(Integer)itr.next();
        if(j%2==0){
            itr.remove();
        }
    }
        System.out.println(str);
}
}
