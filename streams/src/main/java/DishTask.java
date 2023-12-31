import java.util.Comparator;

public class DishTask
{
    public static void main(String[] args)
    {
        // Print all dish's name that less than 400 calories

        DishData.getAll()
                .stream()
                .filter(dish -> dish.getCalories() < 400)
                .map(Dish::getName)
                .forEach(System.out::println);
        // the reason we implement map, I would get the only name from flowing object

        // Print the length of the name of each dish
        System.out.println("***************\n");

        DishData.getAll()
                .stream()
                .map(Dish::getName)
                .map(String::length)
                .forEach(System.out::println);

        // Print Three High Caloric Dish Name
        DishData.getAll()
                .stream()
                .filter(dish -> dish.getCalories() > 300)
                .map(Dish::getName)
                .limit(3)
                .forEach(System.out::println);

        // Print all dish name that are below 400 calories in sorted
        // reverse method advantage of Comparator interface
        System.out.println(" ");
        System.out.println("all dish name that are below 400 calories in sorted");
        DishData.getAll()
                .stream()
                .filter(dish -> dish.getCalories() < 400)
                .sorted(Comparator.comparing(Dish::getCalories).reversed())
                .map(Dish::getName)
                .forEach(System.out::println);
    }
}
