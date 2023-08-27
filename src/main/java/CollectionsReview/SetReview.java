package CollectionsReview;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetReview
{
    public static void main(String[] args) {

        Set<Student> mySets = new HashSet<>();
        mySets.add(new Student(6,"Trevor"));
        mySets.add(new Student(3,"Trevor"));
        mySets.add(new Student(9,"Harvey"));
        mySets.add(new Student(9,"Harvey"));

        // It will not add another new Object because help of equals() and Hashcode() function in Student class
        // Hashset using Hashing mechanizim if we don't implement Hashcode and equals all the time, we can't prevent duplication
        // So hashcode is very important

        System.out.println(mySets);

        Set<Integer> numSet = new HashSet<>();
        numSet.add(3);
        numSet.add(3);
        numSet.add(1);
        numSet.add(2);
        numSet.add(1);

       System.out.println(numSet);

        String str = "Java Developer";
        System.out.println("First Repeating " + repeatingFirstCharacter(str));


    }

    // Find the first repeating char in  a string
    public static Character repeatingFirstCharacter(String str)
    {
        Set<Character> chars = new HashSet<>();

        for (Character each: str.toCharArray())
        {
            if (!chars.add(each))
            {
                return each;
            }
        }
        return null;
    }
}

/*
    SET
    - Set is child interface of Collection
    - Duplicates are NOT ALLOWED

    HASHSET
        - create a collection that uses a hash table for storage
        - contains unique elements only
        - is not synchronized
        - doesn't maintain insertion order

    What is HASHING?
        We don't have to iterate as Array and we have an location and right away it will go there and get the value

 */