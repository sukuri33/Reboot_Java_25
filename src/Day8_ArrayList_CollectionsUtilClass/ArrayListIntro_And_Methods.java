package Day8_ArrayList_CollectionsUtilClass;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

/*
 * Data Structures:
 *   1.Array
 *   2.Collection: ArrayList belongs to Collection framework in Java and this segment is just an introduction - will come back to this topic after the OOP concepts are done.
 *   3.Map
 * */
public class ArrayListIntro_And_Methods {
    public static void main(String[] args) {

        ArrayList<String> strList = new ArrayList<>(Arrays.asList("Heloo","Hi"));
        for (String s : strList) {
            System.out.println("s = " + s);
        }
        System.out.println("************** add() ******************");
        /*
        Purpose:
        Inserts a new element into the list.

        Behavior:
        At the End: add(element) appends the element to the end of the list.

        At a Specific Index: add(index, element) inserts the element at the specified position and shifts subsequent elements to the right.

        Impact on List Size:
        Increases the size of the ArrayList by one.
        */
        ArrayList<String> groceriesList = new ArrayList<>();
        groceriesList.add("Eggs");
        groceriesList.add("paper Towels");
        groceriesList.add("Apples");
        groceriesList.add("Cooking oil");
        System.out.println(groceriesList);
        System.out.println("************** set() ******************");
        /*
        Purpose:
        Replaces an existing element at a specified index with a new element.

        Behavior:
        It does not change the size of the ArrayList.

        Throws an IndexOutOfBoundsException if the index is out of the list’s current range.

        Impact on List Size:
        Does not change the size; it only updates an element.
        * */
        groceriesList.set(2, "Oranges");
        System.out.println(groceriesList);
        groceriesList.add(2, "Chicken");
        System.out.println(groceriesList);

        System.out.println("************** remove() ******************");
        groceriesList.remove(0);//by index
        System.out.println(groceriesList);

        groceriesList.remove("paper Towels");//by value
        System.out.println(groceriesList);

        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(10); // 0
        numbers.add(20); // 1
        numbers.add(30); // 2
        numbers.add(40); // 3
        numbers.add(50); // 4


        boolean r1 = numbers.remove( Integer.valueOf(10) );
        System.out.println(numbers);
        System.out.println(r1);

        System.out.println("************** size() ******************");
        System.out.println(numbers.size());
        System.out.println("************** get() ******************");
        System.out.println(numbers.get(3));
        System.out.println(numbers.getFirst());
        System.out.println(numbers.getLast());

        System.out.println("************** clear() ******************");
        numbers.clear();
        System.out.println(numbers);

        System.out.println("************** indexOf() & lastIndexOf() ******************");
        ArrayList<String> names = new ArrayList<>();

        names.add("Vasyl"); // 0
        names.add("Vasyl"); // 1
        names.add("Sumeye"); //2
        names.add("Sumeye");
        names.add("Ali");
        names.add("Sumeye");

        System.out.println(  names.indexOf("Vasyl") );
        System.out.println( names.lastIndexOf("Vasyl") );
        System.out.println( names.lastIndexOf("Sumeye") );

        System.out.println("************** contains() ******************");
        boolean hasMuhtar = names.contains("Muhtar"); // false
        boolean hasAli = names.contains("Ali"); // true
        System.out.println("hasMuhtar = " + hasMuhtar);
        System.out.println("hasAli = " + hasAli);

        System.out.println("************** equals() ******************");
        ArrayList<Integer> n1 = new ArrayList<>();
        n1.add(10);
        n1.add(20);
        n1.add(30);

        ArrayList<Integer> n2 = new ArrayList<>();
        n2.add(30);
        n2.add(10);
        n2.add(20);

        System.out.println("n1 = " + n1);
        System.out.println("n2 = " + n2);

        System.out.println(n1.equals(n2));
        System.out.println("************** isEmpty() ******************");
        System.out.println(n1.isEmpty());
        System.out.println(n2.isEmpty());

        n1.clear();
        n2.clear();

        System.out.println(n1.isEmpty());
        System.out.println(n2.isEmpty());

        //Bulk Operational Methods
        System.out.println("************** addAll() ******************");
        ArrayList<Integer> scores = new ArrayList<>();

        scores.addAll( Arrays.asList(75, 85, 95, 70, 80) );

        System.out.println(scores);

        System.out.println("---------------addAll more example--------------------------");

        ArrayList<String> students = new ArrayList<>();
        students.addAll(  Arrays.asList("Gadir", "Jacob", "Smith", "Bilal" )   );

        System.out.println(students);

        students.addAll(2,  Arrays.asList("Shukur", "Sharman", "Tatiana") );

        System.out.println(students);

        System.out.println("************** containsAll() ******************");
        ArrayList<String> employeesList = new ArrayList<>();
        employeesList.addAll( Arrays.asList(  "Alena", "Muhtar", "Gadir", "Ali" )  );

        System.out.println(employeesList);

        boolean hasAlena = employeesList.contains("Alena");
        boolean hasAlenaGadir = employeesList.containsAll( Arrays.asList("Alena", "Gadir") );
        boolean hasMuhtarAliJason = employeesList.containsAll( Arrays.asList("Muhtar", "Ali", "Jason") );

        System.out.println("hasAlena = " + hasAlena);
        System.out.println("hasAlenaGadir = " + hasAlenaGadir);
        System.out.println("hasMuhtarAliJason = " + hasMuhtarAliJason);

        System.out.println("************** removeAll() ******************");
        ArrayList<Integer> list = new ArrayList<>();
        list.addAll( Arrays.asList(10, 10, 20, 30, 40, 50, 60, 70, 10, 10, 10, 10, 20, 20, 20, 20) );

        list.removeAll( Arrays.asList(10, 20) );

        System.out.println(list);
        System.out.println("************** retainAll() ******************");
        ArrayList<String> developers = new ArrayList<>();
        developers.addAll( Arrays.asList(  "Alena", "Muhtar", "Gadir", "Ali", "Khashayar", "Madiyar", "Muhtar", "Muhtar" , "Alena")  );
        System.out.println(developers);
        developers.retainAll(  Arrays.asList("Alena", "Khashayar", "Muhtar") );

        System.out.println(developers);

        Iterator irt = developers.iterator();
        irt.hasNext();
    }
}
