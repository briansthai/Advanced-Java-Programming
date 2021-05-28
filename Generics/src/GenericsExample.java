package Generics.src;

import java.util.ArrayList;
import java.util.List;

public class GenericsExample {
    public static void main(String[] args) throws Exception {
        //Used Generics on this List
        List<String> names = new ArrayList<>();
        names.add("Brian");
        //The following line works without casting to a String because the compiler knows the collection can only contain a String
        String name = names.get(0); 
        System.out.println("First name: " + name);
        //The following commented line results in an error because we used generics and the compiler is looking specifically for a String for this collection
        //names.add(7);
    }

    
}
