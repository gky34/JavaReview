import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class AppleTest
{
    public static void main(String[] args) {

        List<Apple> inventory = new ArrayList<>();
        inventory.add(new Apple(100,Color.GREEN));
        inventory.add(new Apple(120,Color.RED));
        inventory.add(new Apple(500,Color.RED));
        inventory.add(new Apple(600,Color.RED));
        inventory.add(new Apple(800,Color.GREEN));
        inventory.add(new Apple(700,Color.GREEN));


//        List<Apple> heavyApple = filterApples(inventory, new AppleHeavyPredicate());
//        System.out.println(heavyApple);
//
//        List<Apple> greenApple = filterApples(inventory, new AppleGreenColorPredicate());
//        System.out.println(greenApple);


        List<Apple> greenApple = filterApples(inventory, apple -> apple.getColor().equals(Color.GREEN));
        System.out.println(greenApple);

        List<Apple> heavyApple = filterApples(inventory, apple -> apple.getWeight()> 200);
        System.out.println(heavyApple);


    }

//    private static List<Apple> filterApples(List<Apple> inventory, ApplePredicate applePredicate) {
//        List<Apple> result = new ArrayList<>();
//
//        for (Apple apple : inventory)
//        {
//            if (applePredicate.test(apple))
//            {
//                result.add(apple);
//            }
//        }
//        return  result;
//    }

    private static List<Apple> filterApples(List<Apple> inventory, Predicate<Apple> applePredicate) {
        List<Apple> result = new ArrayList<>();

        for (Apple apple : inventory)
        {
            if (applePredicate.test(apple))
            {
                result.add(apple);
            }
        }
        return  result;
    }
}
