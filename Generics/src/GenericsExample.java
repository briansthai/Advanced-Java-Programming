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

        //List<Character> charList = arrayToList(charArray, new ArrayList<>());
        //List<Boolean> boolList = arrayToList(boolArray, new ArrayList<>());
        //List<Integer> intList = arrayToList(intArray, new ArrayList<>());

        String item1 = "Apple";
        String item2 = "Banana";
        printShoppingList(item1, item2);
        printShoppingList("Bread", "Milk", "Eggs");

        /* Liskov Substitution Principle - maintainable, usable code
         * The substitution principle lets you assign a variable of a given type to a subtype, but does not always apply to types of lists.
         * We can fix that by using wildcards
         * When an Object extends another, you can override methods so they have the same name, but perform differently. 
         * This is seen most commonly in a toString() method.
         */
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

    //With the wildcard, this method can be passed any type (subtype) that extends the building class
    static void printBuildings(List<? extends Building> buildings)
    {
        for (int i = 0; i < buildings.size(); i++) {
            System.out.println(buildings.get(i).toString() + " " + (i+1));
        }
        System.out.println();
    }

    //With this wildcard, this method can be passed any super type of that object
    static void addHouseToList(List<? super House> buildings)
    {
        buildings.add(new House());
        System.out.println();
    }
}
