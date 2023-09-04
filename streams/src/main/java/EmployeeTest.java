import java.util.List;
import java.util.stream.Stream;

public class EmployeeTest
{
    public static void main(String[] args) {

        // Print all emails - One employee has one email - One to One
        System.out.println("Print all emails");

        EmployeeData.readAll().map(Employee::getEmpEmail)
                            .forEach(System.out::println);

        System.out.println("**********************");
        // Print all phone numbers
        EmployeeData.readAll()
                .map(Employee::getEmpPhoneNumber)
                .forEach(System.out::println);

        System.out.println("**********************");
        EmployeeData.readAll()
                .flatMap(employee -> employee.getEmpPhoneNumber().stream())
                .forEach(System.out::println);

        System.out.println("**********************");
        // This way is better
        // We have a list of phone number, so We call the class name of List
        EmployeeData.readAll()
                .map(Employee::getEmpPhoneNumber)
                .flatMap(List::stream)
                .forEach(System.out::println);


    }
}
