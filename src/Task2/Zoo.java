package Task2;
import java.util.ArrayList;

public class Zoo {
    public static void main(String[] args) {

        ArrayList<String> arrayList = new ArrayList<>();

        arrayList.add(0,"Tiger");
        arrayList.add(1,"Elephant");
        arrayList.add(2,"Flamingo");
        arrayList.add(3,"Bear");
        arrayList.add(4,"Zebra");
        arrayList.add(5,"Giraffe");
        arrayList.add(6,"Lion");
        arrayList.add(7,"Fox");


        arrayList.remove(3);
        arrayList.remove(5);

        int index = arrayList.indexOf("Fox");
        arrayList.remove(index);

        System.out.println(arrayList.size());
        System.out.println(arrayList);
    }
}
