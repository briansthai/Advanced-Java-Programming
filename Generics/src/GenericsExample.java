package Generics.src;

import java.util.ArrayList;
import java.util.List;


public class GenericsExample {

    static Character[] charArray = {'h','e','l','l','o'};
    static Boolean[] boolArray = {true, false, true, false};
    static Integer[] intArray = {1,2,3,4,5};

    public static void main(String[] args) throws Exception {
        //Used Generics on this List
        List<String> names = new ArrayList<>();
        names.add("Brian");
        //The following line works without casting to a String because the compiler knows the collection can only contain a String
        String name = names.get(0); 
        System.out.println("First name: " + name + "\n");
        //The following commented line results in an error because we used generics and the compiler is looking specifically for a String for this collection
        //names.add(7);

        List<Character> charList = arrayToList(charArray, new ArrayList<>());
        List<Boolean> boolList = arrayToList(boolArray, new ArrayList<>());
        List<Integer> intList = arrayToList(intArray, new ArrayList<>());

        String item1 = "Apple";
        String item2 = "Banana";
        printShoppingList(item1, item2);
        printShoppingList("Bread", "Milk", "Eggs");
    }

    //By using the <T> if forces the method to match data types, but allows the method to be flexible
    public static <T> List<T> arrayToList(T[] array, List<T> list)
    {
        for (T object : array)
        {
            list.add(object);
        }
        return list;
    }

    //The parameter data type with ... allows this method to have any variable number of arguments and still function correctly
    //This can replace method overloading if the methods execute the same task
    private static void printShoppingList(String... items)
    {
        System.out.println("SHOPPING LIST");
        for (int i = 0; i < items.length; i++)
        {
            System.out.println(i + 1 + ": " + items[i] + "\n");
        }
    }
}
