package functionalinterface;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class UserTest {

    public static void main(String[] args) {

        List<User> users = new ArrayList<>();
        users.add(User.builder().firstName("Gokay").lastName("Yazr").age(35).build());
        users.add(User.builder().firstName("Liz").lastName("Hanks").age(55).build());
        users.add(User.builder().firstName("Chris").lastName("Smith").age(32).build());
        users.add(User.builder().firstName("Trevor").lastName("Evan").age(45).build());



        //Print all elements in the list
//        printName(users, p -> true);

        //Print all users that last name starts with E
        printName(users, p -> p.getLastName().startsWith("E"));

        //Print all users more than 45
        printName(users, p -> p.getAge() >45);
    }

    private static void printName(List<User>users, Predicate<User> p)
    {
        for (User user : users)
        {
            if (p.test(user)){
                System.out.println(user.toString());
            }
        }
    }

}
