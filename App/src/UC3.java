import java.util.HashSet;
import java.util.Set;

public class UC3 {

    public static void main(String[] args) {

        // 🔹 Welcome Message
        System.out.println("=== Train Consist Management App ===");

        // 🔹 Initialize HashSet for Bogie IDs
        Set<String> bogieIds = new HashSet<>();

        // 🔹 Add Bogie IDs (including duplicates)
        bogieIds.add("BG101");
        bogieIds.add("BG102");
        bogieIds.add("BG103");
        bogieIds.add("BG101"); // duplicate
        bogieIds.add("BG102"); // duplicate

        // 🔹 Display Unique Bogie IDs
        System.out.println("\nBogie IDs after insertion (duplicates ignored):");
        System.out.println(bogieIds);

        // 🔹 Program continues
        System.out.println("\nTotal unique bogies: " + bogieIds.size());
        System.out.println("System ensures no duplicate IDs exist.");
    }
}
