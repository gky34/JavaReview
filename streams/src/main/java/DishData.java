import java.util.Arrays;
import java.util.List;

public class DishData
{
    public static List<Dish> getAll(){

        return Arrays.asList(
                new Dish("pork",false,800,Type.MEAT),
                new Dish("beef",false,600,Type.MEAT),
                new Dish("chicken",false,700,Type.MEAT),
                new Dish("frenchFries",true,560,Type.OTHER),
                new Dish("rice",true,120,Type.OTHER),
                new Dish("season fruit",true,120,Type.OTHER),
                new Dish("shrimp",false,300,Type.FISH),
                new Dish("salmon",false,450,Type.FISH)
        );
    }
}

