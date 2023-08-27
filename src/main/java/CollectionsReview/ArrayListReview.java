package CollectionsReview;

import org.w3c.dom.stylesheets.LinkStyle;

import java.util.*;

public class ArrayListReview
{
    public static void main(String[] args)
    {
        List<Student> students = new ArrayList<>();
        students.add(new Student(1,"Jose"));
        students.add(new Student(2,"Sayed"));
        students.add(new Student(3,"Nick"));
        students.add(new Student(4,"Trevor"));

        System.out.println(students);

        // Iteration on ArrayList
        // 1. For Loop with get(index)

        for(int i=0; i<students.size(); i++)
        {
            System.out.println(students.get(i));
        }
        System.out.println("\n");


        // 2. Iterator
        // It's not good for getting any element of middle
        // It's good for starting to end

        // Forward Iteration
        System.out.println("Printing with Iterator Forward......");

        Iterator iter = students.listIterator();
        while (iter.hasNext())
        {
            System.out.println(iter.next());
        }
        System.out.println("\n");

        // Backwards Iteration
        System.out.println("Printing with Iterator Backwards......");
        while (((ListIterator<?>) iter).hasPrevious())
        {
            System.out.println(((ListIterator<?>) iter).previous());
        }
        System.out.println("\n");

        // 3. For each loop
        System.out.println("Printing for each loop");
        for (Student each :students) {
            System.out.println(each);
        }
        System.out.println("\n");

        //4. Lambda
        System.out.println("Printing for lambda");
        students.forEach(student -> System.out.println(student));

        //Sorting Element List
        System.out.println("\n");
        System.out.println("Printing with sorted List by comp");
        Collections.sort(students, new sortByIdDesc());
        System.out.println(students);
        System.out.println("\n");
        System.out.println("Printing with sorted List by comp");
        Collections.sort(students, new sortByNameDesc());
        System.out.println(students);
    }


    static class sortByIdDesc implements Comparator<Student>{

        @Override
        public int compare(Student o1, Student o2) {
            return o2.id - o1.id;
        }
    }

    static class sortByNameDesc implements Comparator<Student>{

        @Override
        public int compare(Student o1, Student o2) {
            return o2.name.compareToIgnoreCase(o1.name);
        }
    }
}
/*
        Collections
            - Store and manipulate the group of objects
            - Collections is set of implementations of most used Data structures.
            - We can perform searching, sorting, inserting, manipulating and deletion
            - Collection framework provides many Interfaces
                - Set, List, Queue, Deque
            Classes
                ArrayList, Vector, LinkedList, PriorityQueue, HashSet, LinkedHashSet, TreeSet

            Advantage
                - Increase performance
                - Reducing programing effort
                - Reducing the effort required to learn
                - Reducing the effort required to design
                - Foster for reusing

            Array Data Structure
            - Array is the basic mechanism for storing a collection
            - Array use static memory allocation
                - We are not able to change the size
                - Fixed in size, predefine size and not dynamic
                Exp:
                    int[] myArray = new int[1000];

              Dynamic Array

                    - ArrayList
                        - Implement List interface
                        - Allows duplicate values
                        - Ordered collection and it maintain the insertion order of the elements
                        - It allows you to retrieve the elements by index
                        - Not Synchronized
                        - Size increased by %50 if full
                        - Performance wise Arraylist way faster because it's not Synchronized

                    - Vector
                        Size increased by %100 if full
                        (Synchronized)
                        Only single thread can access in multi tread enviroment
                        Performance is decrease because of it's Synchronized

 */