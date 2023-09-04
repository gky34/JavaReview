import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Reducing
{
    public static void main(String[] args)
    {
        List<Integer> numbers = Arrays.asList(4,5,6,7,8);
        int result = numbers.stream().reduce(0,(a,b) -> a+b);
        System.out.println(result);

        //No initial value

        System.out.println("**********************");
        List<Integer> numbers2 = Arrays.asList(5,23,6,1,67,3);
        Optional result2 = numbers2.stream().reduce((a,b) -> a+b);
        System.out.println(result2);

        // Max and Min
        System.out.println("**********************");
        Optional<Integer> max = numbers.stream().reduce(Integer::max);
        Optional<Integer> min = numbers.stream().reduce(Integer::min);
        Optional<Integer> sum = numbers.stream().reduce(Integer::sum);

        System.out.println("max = " + max);
        System.out.println("min = " + min);
        System.out.println("sum = " + sum);

        // Task
        int dishCount = DishData.getAll().stream()
                .map(d -> 1).reduce(0, (a, b) -> a + b);
        System.out.println("dishCount = " + dishCount);

        long dCount = DishData.getAll().stream()
                .count();
        System.out.println("dCount = " + dCount);

    }
}
/**
 REDUCING
 Data is flowing and what's the sum off salary?? we can filter how much 2019 we paid salary
 - There are some queries combine all the elements in the stream to produce a single value as an INTEGER
 For exam
 Calculate the sum of all calories in the menu or what is the highest calories dish in the menu?
 It takes 2 arguments
 1- Initial Value, Binary Operations
 */