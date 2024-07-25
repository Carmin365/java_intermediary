import java.util.ArrayList;
import java.util.List;

public class ExampleLists {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("Adrian");
        names.add("Alexandra");
        names.add("Oliver");

        for (String name : names) {
            System.out.println(name);
        }
    }
}