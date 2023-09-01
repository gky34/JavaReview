package doubleColonOperator;

import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class CarTest
{
    public static void main(String[] args)
    {
        //Zero argument
        //Supplier doesn't accept anything and return param
        //we call constructor, which is the empty one
        Supplier<Car> c1 = () -> new Car();
        System.out.println(c1.get().getModel());

        Supplier<Car> c2 = Car::new;
        System.out.println(c2.get().getModel());

        //One argument constructor
        Function<Integer, Car> c3 = (model) -> new Car(model);
        Car bmw = c3.apply(2009);
        System.out.println(bmw.getModel());

        Function<Integer, Car> c4 = Car::new;
        Car mercedes = c4.apply(2020);
        System.out.println(mercedes.getModel());

        //Two argument constructor
        BiFunction<String,Integer,Car> c5 = (make,model)-> new Car(make,model);
        Car mercedez = c5.apply("BMW",2022);
        System.out.println(mercedez.getModel() + mercedez.getMake());

        BiFunction<String,Integer,Car> c6 = Car::new;
        Car nissan =c6.apply("Nissan", 2023);
        System.out.println(nissan.getMake() +" "+nissan.getModel());

    }
}
