package review;

import java.util.List;

public class MyUtils<T>
{
    public void printInfo2(List<T> list)
    {
        for (T item : list)
        {
            System.out.println(item);
        }
        int totalStudent = list.size();
        System.out.println(totalStudent);
    }

    //write a method that takes a list and returns the last item of the list
    public  T lastElement(List<T> list)
    {
        return list.get(list.size()-1);
    }

    // write a method that takes a list and returns the last item name of the list.(Student, Teacher)
    //instanceof => checking object created from Student class

    public String getLastItemName(List<T> list) throws Exception {
        T lastItem = list.get(list.size()-1);

        if (lastItem instanceof Student)
        {
            return ((Student) lastItem).getName();
        }else if(lastItem instanceof Teacher){
            return ((Teacher) lastItem).getName();
        }else{
            throw new Exception("Not a valid type");
        }
    }
}
