package comparatorInterface;

import java.util.*;
import java.util.function.Predicate;

import static java.util.Comparator.comparing;

public class ComparatorDemo
{
    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(2,46,12,4,10);
        System.out.println(list);

        // Ascending order sort
        Collections.sort(list);
        System.out.println(list);

        // Descending order sort
        Collections.sort(list, new MyComparator());
        System.out.println(list);

        Collections.sort(list,(o1,o2) ->(o1 >o2) ? -1 : (o2 < o1) ? 1 :0);

         //Ascending
        list.sort((o1, o2) -> o1.compareTo(o2));
        System.out.println(list);

        //Descending
        list.sort((o2, o1) -> o1.compareTo(o2));
        System.out.println(list);

        List<Apple> myInvertory = Arrays.asList(
                new Apple(80,Color.RED),
                new Apple(150,Color.GREEN),
                new Apple(100,Color.GREEN));

        Comparator<Apple> sortApple = comparing((Apple apple) -> apple.getWeight());
        myInvertory.sort(sortApple);
        System.out.println(myInvertory);

        myInvertory.sort(comparing((apple) -> apple.getWeight()));

        // Another way of with :: operator
        myInvertory.sort(comparing(Apple::getWeight));

        //Reversed
        myInvertory.sort(comparing((Apple::getWeight)).reversed());
        System.out.println(myInvertory);

        //Chaining
        myInvertory
                .sort(comparing(Apple::getWeight).reversed()
                        .thenComparing(Apple::getColor));
        System.out.println(myInvertory);

    }
}

/**
    Comparator Interface
    - sort a list of objects based on CUSTOM order

    - Java offer us Collections class and we can do only asc order so we can use lambda expression for descending
    compareTo()
        implement this logic (o1,o2) ->(o1 >o2) ? -1 : (o2 < o1) ? 1 :0)
 */