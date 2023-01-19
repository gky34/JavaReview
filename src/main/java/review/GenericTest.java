package review;

import java.util.ArrayList;
import java.util.List;

public class GenericTest
{
    public static void main(String[] args)
    {

        List<Student> studentList = new ArrayList<>();
        studentList.add(new Student("Mike",101));
        studentList.add(new Student("Joe",102));
        studentList.add(new Student("Adam",103));

        List<Teacher> teacherList = new ArrayList<>();
        teacherList.add(new Teacher("Albus",201));
        teacherList.add(new Teacher("Severus",202));
        teacherList.add(new Teacher("Gokay",203));

//        printInfo(studentList);
//        printInfo2(studentList);
//        printInfo2(teacherList);
//

        System.out.println(lastElement(studentList));
        System.out.println(lastElement(teacherList));

    }

    // write a method that takes list of students, print each student and the total student count.

    public static void printInfo(List<Student> students)
    {
        for (Student student : students)
        {
            System.out.println(student);
        }
        int totalStudent = students.size();
        System.out.println(totalStudent);


        MyUtils<Student> obj1 = new MyUtils<>();
    }

    // Write a method that takes a list and print each item and its total count
    public static<T> void printInfo2(List<T> list)
    {
        for (T item : list)
        {
            System.out.println(item);
        }
        int totalStudent = list.size();
        System.out.println(totalStudent);
    }

    //write a method that takes a list and returns the last item of the list
    public static<T> T lastElement(List<T> list)
    {
        return list.get(list.size()-1);
    }


}


