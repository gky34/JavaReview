package task;

import lombok.*;

@Getter @Setter @ToString
@EqualsAndHashCode
@Builder
public class Orange
{
    private int weight;
    private Color color;
}
/**
     Builder is going to give a creation instance so easy
     We are going to create an object through Builder
    Advantage
        - generates an AllArgConstructor unless there is another @Constructor
        - We don't use in develop much because we need an empty constructor all the time

 */