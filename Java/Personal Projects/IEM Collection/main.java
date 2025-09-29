import java.util.*;

public class main {
    static Scanner input = new Scanner(System.in);
    static ArrayList<String> item = new ArrayList<String>();
    public static void main(String[] args) {
        System.out.println("My IEM Collection\n1. See Collection\n2. Edit Collection");
        int act_1 = input.nextInt();
        if (act_1 == 1) {
            item.add("a");
            item.add("b");
            item.add("c");
            item.add("d");
            for (int i = 0; i < item.size(); i+=2) {
                System.out.println(item.get(i) + " | " + item.get(i+1));
            }
        } else if (act_1 == 2) {
            System.out.println("Input name : ");
            String item_name = input.nextLine();
            item.add(item_name);
            String item_sound = input.nextLine();
            item.add(item_sound);
        }
    }
}
