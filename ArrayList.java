import java.util.ArrayList;

public class ArrayList {

    public static void main(String[] args)
    {

        ArrayList<String>
            list1 = new ArrayList<String>();

        list1.add("Hii");
        list1.add("Geeks");
        list1.add("for");
        list1.add("Geeks");

        System.out.println("List1: "
                           + list1);

        ArrayList<String>
            list2 = new ArrayList<String>();

        list2.add("Hii");
        list2.add("Geeks");
        list2.add("Gaurav");

        System.out.println("List2: "
                           + list2);

        list1.retainAll(list2);

        System.out.println("Common elements: "
                           + list1);
    }
}
