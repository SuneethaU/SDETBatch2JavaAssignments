//Program to Remove the Duplicate strings in an Array
package basics;
import java.util.Arrays;
import java.util.LinkedHashSet;
 
public class RemoveDuplicateStrings {
 
    public static void main(String[] args) {
        
        String[] strStrings = {
                "AAA",
                "BBB",
                "AAA",
                "CCC", 
                "DDD",
                "BBB"          
        };
        
        System.out.println("Original array: " 
                    + Arrays.toString(strStrings));
        
        /*
         * convert array to list and then add all
         * elements to LinkedHashSet. LinkedHashSet
         * will automatically remove all duplicate elements. 
         */
        LinkedHashSet<String> lhSetStrings =  
                new LinkedHashSet<String>(Arrays.asList(strStrings));
        
        //create array from the LinkedHashSet
        String[] newArray = lhSetStrings.toArray(new String[ lhSetStrings.size() ]);
        
        System.out.println("Array after removing duplicates: " 
                + Arrays.toString(newArray));
 
    }
}
