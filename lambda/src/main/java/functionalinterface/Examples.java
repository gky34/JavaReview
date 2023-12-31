package functionalinterface;

import java.util.function.*;

public class Examples
{
    public static void main(String[] args)
    {
        // Predicate Example
//        Predicate<Integer> lesserThan = new Predicate<Integer>() {
//            @Override
//            public boolean test(Integer integer) {
//                return integer < 18;
//            }
//         };

//        lesserThan.test(50);

                                         // Implementation of test method belong to Predicate interface
        Predicate<Integer> lessertThan = a -> a <18;
        Boolean result = lessertThan.test(50);
        System.out.println(result);


        // CONSUMER INTERFACE
        // No return type
        Consumer<Integer> display = i -> System.out.println(i);
        display.accept(50);

        //BICONSUMER
        BiConsumer<Integer, Integer> addTwo = (x,y) -> System.out.println(( x+ y));
        addTwo.accept(100,200);

        // FUNCTION
        Function<String,String> fun = s-> "Hello " + s;
        String str = fun.apply("Gokay");
        System.out.println(str);

        //SUPPLIER
        Supplier<Double> randomValue = () -> Math.random();
        System.out.println(randomValue.get());

        Predicate<Integer> pred = (p) -> p%2 == 0 ? true : false;
        System.out.println(pred.test(10));

        BiConsumer<Integer, String> bn = (x,y) -> System.out.println(x+y);
        bn.accept(5,"apple");




    }

}

/**
    Predicate
    - Generics interface defines an abstract method name test that accept an object generic type of T and returns Boolean
    Accept one object and return boolean

 Always find to right Interface
 - Either we can write to interface or We can use the ready API Interface
 - find interface and implementation of the abstract method, which is what parameter and what return type
 signature has to match it

 */
