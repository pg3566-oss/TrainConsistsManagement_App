import java.util.LinkedList;

public class UC4{

    public static void main(String[] args) {

        // 🔹 Welcome Message
        System.out.println("=== Train Consist Management App ===");

        // 🔹 Initialize LinkedList for Train Consist
        LinkedList<String> train = new LinkedList<>();

        // 🔹 Add Bogies (Initial Formation)
        train.add("Engine");
        train.add("Sleeper");
        train.add("AC");
        train.add("Cargo");
        train.add("Guard");

        System.out.println("\nInitial Train Consist:");
        System.out.println(train);

        // 🔹 Insert Pantry Car at position 2
        train.add(2, "Pantry");

        System.out.println("\nAfter adding Pantry Car at position 2:");
        System.out.println(train);

        // 🔹 Remove First and Last Bogie
        train.removeFirst(); // Engine removed
        train.removeLast();  // Guard removed

        // 🔹 Final Train Consist
        System.out.println("\nFinal Train Consist:");
        System.out.println(train);

        System.out.println("\nSystem maintains correct train order.");
    }
}
