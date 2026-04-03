import java.util.ArrayList;
import java.util.List;

public class TrainConsistManagementApp {

    public static void main(String[] args) {

        System.out.println("=====================================");
        System.out.println("=== Add Passenger Bogies to Train ===");
        System.out.println("=====================================");

        // Step 2: Create ArrayList for passenger bogies
        List<String> bogies = new ArrayList<>();

        // Step 3: Add bogies
        bogies.add("Sleeper");
        bogies.add("AC Chair");
        bogies.add("First Class");

        // Step 4: Display bogies after insertion
        System.out.println("\nBogies after addition:");
        System.out.println(bogies);

        // Step 5: Remove one bogie (AC Chair)
        bogies.remove("AC Chair");

        // Step 6: Display after removal
        System.out.println("\nAfter removing AC Chair:");
        System.out.println(bogies);

        // Step 7: Check if Sleeper exists
        if (bogies.contains("Sleeper")) {
            System.out.println("\nSleeper bogie is present.");
        } else {
            System.out.println("\nSleeper bogie is NOT present.");
        }

        // Step 8: Final list state
        System.out.println("\nFinal Train Consist:");
        System.out.println(bogies);
    }
}