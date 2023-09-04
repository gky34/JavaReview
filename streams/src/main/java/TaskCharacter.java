import java.util.Arrays;
import java.util.List;

public class TaskCharacter
{
    public static void main(String[] args)
    {
        List<String> words = Arrays.asList("JAVA","Apple","Honda","Developer");

        // Finding length of each element
        words.stream()
                .map(String::length)
                .forEach(System.out::println);



    }
}

/**
    What is Stream and Stream Pipeline
    Stream is a sequence of elements from a source that supports data processing
    - update to the JAVA API that let you manipulate collections of data in a declarative way

    Stream Pipeline
    is a operations that run on a stream to produce a result.

    3 Component in Stream
    - Source
    - Intermediate Operation 
    - Terminal Operation


 *** INTERVIEW QUESTIONS    ****
    What is Flattening Streams?
    Stream interface support a flatMap
        It's used when we have a stream of collections, and we want to flatten it rather than using map() method and getting the nested Stream

    map() accept Stream<> and returns Stream<T>
    it's mapper function produces single value for each input value
    it called One-To-One mapping

    flatMap() accept Stream<Stream<T>> as input and return Stream<T>
    It's a mapper function and produces multiple value for each input value
    It's called One-To-Many mapping

    Stream.of(1,2,3,4); -> [1,2,3,4]
    [[1,2],[3,4],[5,6],[7,8]] -> [1,2,3,4,5,6,7,8]














 */