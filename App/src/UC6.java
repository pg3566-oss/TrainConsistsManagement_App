import java.util.HashMap;
import java.util.Map;

public class UC6 {

    public static void main(String[] args) {

        // 🔹 Welcome Message
        System.out.println("=== Train Consist Management App ===");

        // 🔹 Create HashMap for Bogie-Capacity Mapping
        HashMap<String, Integer> bogieCapacity = new HashMap<>();

        // 🔹 Add Bogie Capacity Details
        bogieCapacity.put("Sleeper", 72);
        bogieCapacity.put("AC Chair", 54);
        bogieCapacity.put("First Class", 24);

        // 🔹 Display Capacity Details
        System.out.println("\nBogie Capacity Details:");

        for (Map.Entry<String, Integer> entry : bogieCapacity.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue() + " seats");
        }

        System.out.println("\nMapping completed successfully.");
    }
}
