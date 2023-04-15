//(a) Create a program to set view of Keys from the Java Hash table.

import java.util.Enumeration;
import java.util.Iterator;
import java.util.Hashtable;
import java.util.Set;
  
public class exp5a 
{
  
    public static void main(String[] args)
    {
  
        
        Hashtable<String, String> hash_t
            = new Hashtable<String, String>();

        hash_t.put("1", "I");
        hash_t.put("2", "Love");
        hash_t.put("3", "Python");
  
        
        Set hash_set = hash_t.keySet();
  
        System.out.println(
            "Set created from Hashtable Keys contains :");
  
        Iterator itr = hash_set.iterator();
        while (itr.hasNext())
            System.out.println(itr.next());
    }
}