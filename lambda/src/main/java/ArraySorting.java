import java.util.ArrayList;

public class ArraySorting {
    public static void main(String[] args) {

        ArraySorting as = new ArraySorting();
//        as.sort();

        // This is my behavior now
        QuickSort qs = new QuickSort();
        BubbleSorting bs = new BubbleSorting();
        as.sort(qs);
        as.sort(bs);

        Sorting myLambda = () -> System.out.println("Sorting the array");
        Sorting myLambda2 = () -> System.out.println("Sorting the array");

        Sorting noLambda = new QuickSort();
        noLambda.sort();

        Sorting quickSort = () -> System.out.println("Quick Sorting");
        as.sort(quickSort);

        Sorting bubbleSort = () -> System.out.println("Bubble Sorting");
        as.sort(bubbleSort);

    }

    private void sort(Sorting sorting) {
       sorting.sort();
    }

}

/**
 * Biggest Update JAVA 8
     - Most of the framework doesn't support less than Java 5
       Biggest Update
     - Lambda

 WHY LAMBDA -> Enable FUNCTIONAL Programming
    - Readable code
    -
     There are so many different way to sort the Array
    - Quick sorting
    - Bubble sorting
    - LAMBDA is just function so we don't have to create so many interface or class
        They don't belong any class
        These function can assume as values, which mean
            String name = "Gokay"
            abc = () -> System.out.println("QuickSorting");
        *** If it's only line of we don't need a parenthesis

        If Function takes parameter:

            weightApple = (Apple apple) -> apple.getWeight()>150;

            lengthCount = (String str) -> s.length;

            myFunction = (int x, int y) -> { System.out.println("Result");
                                             System.out.println(x+y); };

            myLambda = () -> 42;  Nothing return


            Creating Lambda
                We need a 2 steps:
                1.Create a new interface

                interface MyLambda{

                }

                2. Create a method, exact same signature with lambda expression

                interface Mylambda{
                    void print();
                }

            Mylambda  myLambda = () -> System.out.print("Sorting array");

            *** If interface has more than 2 function
                We can't use it as a lambda
            If there is one abstract method we can use it @FunctionalInterface that
            means we're implementing lambda expression so don't add anything in this interface

 Behavior parameterization

 */

