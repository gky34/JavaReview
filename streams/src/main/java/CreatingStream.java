import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class CreatingStream
{
    public static void main(String[] args)
    {
        // Creating Stream from Array

        String[] course = {"Java","JS","ts"};
        Stream<String> courseStream = Arrays.stream(course);

        //  Creating Stream from Collection
        List<String> courseList = Arrays.asList("Java","DS","Spring");
        Stream<String> courseStream2 = courseList.stream();

        List<Course> myCourses = Arrays.asList(
                        new Course("Java",100),
                        new Course("DS",101),
                        new Course("Spring",102),
                        new Course("MicroServices",103));

        Stream<Course> myCourseStream = myCourses.stream();

        // Creating Stream from Values
        Stream<Integer> stream = Stream.of(1,2,3,4);
    }
}

/**
 STREAMS
 First Whatever the collection we have,  We need to convert to Streams from collection. So we can move into flow
 Intermediate Operations
 Transforms the stream into another one. Intermediate operations don't perform any process until a terminal operation is invoked.
 Stream Source - create Stream instance

 Terminal Operation
 - Actual result is produced. Since streams can be used only once, the streams is no longer valid after a terminal operations completes.
 - that means we can convert again from Streams to collection
 After we are done with Streams, we can get out from flow.
 */
