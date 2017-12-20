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
public class ArrayListAdd {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
        // TODO code application logic here
        ArrayList<String> str=new ArrayList<String>();
        str.add("karu");
        str.add("abi");
        str.add("priya");
        str.add("kavya");
        Iterator<String> itr=str.iterator();
        while(itr.hasNext())
        {
            System.out.println(itr.next());
        }
        
    }
    
}
