import java.util.Optional;

public class MatchingAndFinding {
    public static void main(String[] args)
    {
        //AllMatch
        System.out.println("***********************");
        boolean isHealthy = DishData.getAll().stream().allMatch(dish -> dish.getCalories() < 1000);
        System.out.println(isHealthy);

        //ANY MATCH
        System.out.println("***********************");
        if(DishData.getAll().stream().anyMatch(Dish::isVegetarian))
        System.out.println("The menu is vegetarian friendly");

        //Non Match
        System.out.println("***********************");
        boolean isHealthy2 = DishData.getAll().stream().noneMatch(dish -> dish.getCalories() >= 1000);
        System.out.println(isHealthy2);

        //Find Any
        System.out.println("***********************");
        // It's a new type
        // Optional created for null pointer exception
        Optional<Dish> dish = DishData.getAll().stream()
                .filter(Dish::isVegetarian)
                .findAny();
        System.out.println(dish.get());

        //Find First
        System.out.println("***********************");

        Optional<Dish> dish2 = DishData.getAll().stream()
                .filter(Dish::isVegetarian)
                .findFirst();
        System.out.println(dish2.get());


    }
}
