package Task3;

import java.util.ArrayList;
import java.util.Iterator;

public class Main {
    public static int size;

    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();

        arrayList.add(0,12);
        arrayList.add(1,15);
        arrayList.add(2,16);
        arrayList.add(3,13);
        arrayList.add(4,11);
        arrayList.add(5,19);
        arrayList.add(6,14);
        arrayList.add(7,20);
        arrayList.add(8,18);
        arrayList.add(9,17);


        System.out.println("Индекс самого большого числа = " + arrayList.indexOf(20));
        System.out.println("Индекс самого маленького числа = " + arrayList.indexOf(11));

        Iterator<Integer> iterator = arrayList.iterator();
        while (iterator.hasNext()) {
            Integer integer = iterator.next();
            integer++;
            System.out.print(integer + ", " );
        }

    }
}
