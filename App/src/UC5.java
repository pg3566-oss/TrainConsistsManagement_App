import java.util.LinkedHashSet;

public class UC5 {

    public static void main(String[] args) {

        // 🔹 Welcome Message
        System.out.println("=== Train Consist Management App ===");

        // 🔹 Create LinkedHashSet for Train Formation
        LinkedHashSet<String> train = new LinkedHashSet<>();

        // 🔹 Add Bogies
        train.add("Engine");
        train.add("Sleeper");
        train.add("Cargo");
        train.add("Guard");

        // 🔹 Attempt to add duplicate
        train.add("Sleeper");  // Duplicate (will be ignored)

        // 🔹 Display Train Formation
        System.out.println("\nFinal Train Formation (Insertion Order Preserved):");
        System.out.println(train);
    }
}
