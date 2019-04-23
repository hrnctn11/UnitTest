package unitTest.com;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Created by Harun on 23.04.2019.
 */
public class HashSetExample {

    //Eğer ki Liste içindeki elemanlar Integer, String gibi tiplerde olsaydı liste içerisindeki elemanları HashSet içerisine atarak tekilleştirebilirdim.
    public static void main( String[] args )
    {

        List<String> stringList = new ArrayList<String>();
        stringList.add("String1");
        stringList.add("String2");
        stringList.add("String2");
        stringList.add("String3");
        stringList.add("String3");
        stringList.add("String3");

        Set<String> stringSet = new HashSet<String>();
        stringSet.addAll(stringList);

        System.out.println("list size: " + stringList.size());
        System.out.println("hash set size: " + stringSet.size());


    }
}
