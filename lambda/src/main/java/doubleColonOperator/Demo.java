package doubleColonOperator;

import java.util.function.BiFunction;
import java.util.function.Consumer;

public class Demo
{
    public static void main(String[] args) {

        //Reference to a static method
        Calculate s1 = (x,y) -> Calculator.findSum(x,y);
        s1.calculate(10,20);

        // this is pretty much same thing above method
        Calculate s2 = Calculator::findSum;
        s2.calculate(10,45);

        //Reference to an instance method
        Calculate m1 = (x,y) -> new Calculator().findMultiply(x,y);
        m1.calculate(3,5);

        Calculator obj = new Calculator();
        Calculate m2 = obj::findMultiply;
        m2.calculate(2,4);

        Calculate m3 = new Calculator()::findMultiply;
        m3.calculate(3,5);

        //BiFunction accept 3 parameters and return 2 param
        BiFunction<String,Integer, String> fn = (str,i) -> str.substring(i);
        System.out.println(fn.apply("Developer",6));

        BiFunction<String,Integer,String> fn2 = String::substring;
        System.out.println(fn2.apply("Mobile Developer",6));

        // Consumer Interface no parameters
        Consumer<Integer> display = i-> System.out.println(i);
        display.accept(2);

        Consumer<Integer> display2 = System.out::println;
        display2.accept(7);

        BiFunction<MyClass,Integer,Double> v2 = MyClass::method;

         BiFunction<String, String, String> v3 = String::concat;



    }
}
/**
    Method Reference
    - shorthand for lambdas calling only a specific methods
    - call this method directly
    -
 */