package view;

import java.util.Arrays;

public class prueba { 
public static void main(String args[]) 
    { 
        // define original array 
        //int[] even_Array = new int[] {2,4,6,8}; 
		String[] even_Array = new String[] {"Ana", "Juan", "Ari", "Héctor"}; 
	 
         System.out.println("Original Array:" + Arrays.toString(even_Array));
 
        // copying array even_Array to copy_Array
        String[] copy_Array = Arrays.copyOf(even_Array,even_Array.length+1); 
 
        System.out.println("Copied Array:" + Arrays.toString(copy_Array));
        // assign value to unassigned element of copied array 
        copy_Array[4] = "Ana"; 
 
          System.out.println("Copied and modified Array:" + Arrays.toString(copy_Array));
    } 
}