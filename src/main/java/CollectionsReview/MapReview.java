package CollectionsReview;

import java.util.HashMap;
import java.util.Map;

public class MapReview
{
    public static void main(String[] args) {

        Map<Integer,String> map = new HashMap<>();
        map.put(1,"Sergio");
        map.put(2,"Liz");
        System.out.println(map.get(1));

        String str = "Java Developer";
        System.out.println(nonRepeatingChar(str));
    }

    //Find the first non-repeating char in a string
    public static Character nonRepeatingChar(String str){

        Map<Character, Integer> map = new HashMap<>();
        int count = 0;

        for(Character ch : str.toCharArray())
        {
            if (map.containsKey(ch))
            {
                count = map.get(ch);
                map.put(ch, count+1);
            }else {
                map.put(ch, 1);
            }
        }

        for (Character ch : str.toCharArray())
        {
            if (map.get(ch) ==1)
            {
                return ch;
            }
        }
        return Character.MIN_VALUE;
    }
}
/*
    Map
        - Map can handle more 2 values as KEY + VALUES
        - implement MAP interface
        - doesn't extend Collection interface

 */