import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.List;

@Data
@AllArgsConstructor
public class Employee
{
    private int employeeId;
    private String name;
    private String empEmail;
    private List<String> empPhoneNumber;
}
