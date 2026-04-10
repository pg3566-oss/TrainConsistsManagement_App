import java.util.ArrayList;
import java.util.List;

public class UC2 {

    public static void main(String[] args) {

        // 🔹 Welcome Message
        System.out.println("=== Train Consist Management App ===");

        // 🔹 Initialize Passenger Bogies List
        List<String> passengerBogies = new ArrayList<>();

        // 🔹 Add Bogies (CREATE)
        passengerBogies.add("Sleeper");
        passengerBogies.add("AC Chair");
        passengerBogies.add("First Class");

        // 🔹 Display Bogies (READ)
        System.out.println("\nPassenger Bogies after addition:");
        System.out.println(passengerBogies);

        // 🔹 Remove a Bogie (DELETE)
        passengerBogies.remove("AC Chair");

        System.out.println("\nAfter removing 'AC Chair':");
        System.out.println(passengerBogies);

        // 🔹 Check Existence (SEARCH)
        if (passengerBogies.contains("Sleeper")) {
            System.out.println("\n'Sleeper' bogie exists in the train.");
        } else {
            System.out.println("\n'Sleeper' bogie not found.");
        }

        // 🔹 Final State
        System.out.println("\nFinal Passenger Bogies:");
        System.out.println(passengerBogies);

        // 🔹 Program continues
        System.out.println("\nSystem ready for next operations...");
    }
}