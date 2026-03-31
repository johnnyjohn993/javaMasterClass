import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        Printer<String> printer = new Printer<>("25");
        printer.print();

        ArrayList<Object>  cats = new ArrayList<>();
        cats.add(new Cat());


    }
}
