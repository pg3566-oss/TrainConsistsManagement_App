import java.util.*;

class Bogie {
    String name;
    int capacity;

    // Constructor
    Bogie(String name, int capacity) {
        this.name = name;
        this.capacity = capacity;
    }

    // Display method
    public String toString() {
        return name + " -> " + capacity + " seats";
    }
}

public class UC7 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("=== Train Consist Management App ===");

        // 🔹 List to store bogies
        List<Bogie> bogies = new ArrayList<>();

        // 🔹 User Input
        System.out.print("\nEnter number of bogies: ");
        int n = sc.nextInt();
        sc.nextLine(); // consume newline

        for (int i = 0; i < n; i++) {
            System.out.println("\nEnter details for Bogie " + (i + 1));

            System.out.print("Enter Bogie Name: ");
            String name = sc.nextLine();

            System.out.print("Enter Capacity: ");
            int capacity = sc.nextInt();
            sc.nextLine(); // consume newline

            bogies.add(new Bogie(name, capacity));
        }

        // 🔹 Sorting using Comparator (by capacity)
        bogies.sort(Comparator.comparingInt(b -> b.capacity));

        // 🔹 Display Sorted Bogies
        System.out.println("\nBogies Sorted by Capacity:");
        for (Bogie b : bogies) {
            System.out.println(b);
        }

        System.out.println("\nSorting completed successfully.");
    }
}
