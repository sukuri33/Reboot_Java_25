package Day8_ArrayList_CollectionsUtilClass;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListToArray {
    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<>(Arrays.asList("Hello","Wrold"));
        String[] strArr = list.toArray(new String[0]);
        System.out.println(Arrays.toString(strArr));

        ArrayList<Integer> listNum = new ArrayList<>(Arrays.asList(1,2,3));
        Integer[] intArr = listNum.toArray(new Integer[0]);//Array object returned from toArray() method. Not regular array
        System.out.println(Arrays.toString(intArr));

    }
}
