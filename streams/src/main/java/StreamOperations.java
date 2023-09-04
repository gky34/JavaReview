import java.util.Arrays;
import java.util.List;

public class StreamOperations
{
    public static void main(String[] args)
    {
        List<Integer> myList = Arrays.asList(1,2,3,4,3,5,9,2,2,6);
//        filter.forEach(x -> System.out.println(x));
        myList.forEach(System.out::println);

        // Intermediate Operation
        // FILTER
        // We can implement more than one operation as well
        System.out.println("Filter");
        myList.stream().
                filter(i -> i%3 ==0)
                .distinct()
                .forEach(System.out::println);

        // LIMIT
        System.out.println("\nLimit");
        myList.stream()
                .filter(i -> i%2 ==0)
                .limit(1)
                .forEach(System.out::println);

        // SKIP
        System.out.println("SKIP");
        myList.stream()
                .filter(i -> i%2 ==0)
                .skip(2)
                .forEach(System.out::println);

        //MAP using a lot
        // Supports a map method, takes a function as argument and applied each element, mapping it to a new element

        System.out.println("MAP");
        myList.stream()
                .map(num -> num*2)
                .filter(i -> i%3 == 0)
                .forEach(System.out::println);



    }
}

/**
    Filtering a Stream
    - This operation takes an argument a predicate - return boolean and returns Stream
    - Terminate it with forEach function



 */