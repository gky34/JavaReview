import java.util.ArrayList;

public class ArrayListExample
{
    public static void main(String[] args)
    {
        ArrayList<Integer> items = new ArrayList<>();
        items.add(1);
        items.add(2);
        items.add(3);
        items.add(4);
//        items.add("apple");
//          - there is no error because if we don't specify Object type, we can't get an compiler error or we need to casted
        printDouble(items);
    }

    private static void printDouble(ArrayList<Integer> items)
    {
//        for(Object i : items)
//        {
//            System.out.println((Integer) i *2);
//        }

        for(int i : items)
        {
            System.out.println( i *2);
        }
    }
}
/*
    - ArrayList is a class
    - List is an INTERFACE

     GENERICS is type checking
        ArrayList <String, Integer...> this is generic
        <> this is the way that we're checking types


 */

