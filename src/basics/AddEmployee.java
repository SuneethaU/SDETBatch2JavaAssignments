package basics;
import java.util.*;  
class AddEmployee{  
public static void main(String args[]){  
 ArrayList<String> al=new ArrayList<String>();  
          System.out.println("Initial list of elements: "+al);  
          al.add("Sunita");  
          al.add("Anitha");  
          al.add("Kavita");  
          System.out.println("After invoking add(E e) method: "+al);  
          //Adding an element at the specific position  
          al.add(2, "Ram");  
          System.out.println("After invoking add(int index, E element) method: "+al);  
            
}  
}