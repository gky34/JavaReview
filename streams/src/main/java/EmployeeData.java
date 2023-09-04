import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class EmployeeData
{
    public static Stream<Employee> readAll(){

        return Stream.of(
          new Employee(100,"Mike","mike@cydeo.com", Arrays.asList("2342384","23423423")),
          new Employee(101,"Ozzy","ozzy@cydeo.com", Arrays.asList("7342384","73423426")),
          new Employee(102,"Peter","peter@cydeo.com", Arrays.asList("8342384","83423426"))
        );
    }
}
