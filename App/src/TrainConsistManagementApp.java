import java.util.LinkedHashSet;
import java.util.Set;


public class TrainConsistManagementApp {

    public static void main(String[] args) {

        System.out.println("========================================");
        System.out.println(" UC5 - Preserve Insertion Order of Bogies ");
        System.out.println("========================================\n");

        // Create a LinkedHashSet to store bogies
        // Maintains insertion order + ensures uniqueness
        Set<String> formation = new LinkedHashSet<>();

        // ---- ATTACH BOGIES TO TRAIN FORMATION ----
        // add() inserts bogies while preserving order
        formation.add("Engine");
        formation.add("Sleeper");
        formation.add("Cargo");
        formation.add("Guard");

        // ---- ATTEMPT DUPLICATE ATTACHMENT ----
        // LinkedHashSet silently ignores duplicate entries
        formation.add("Sleeper"); // Duplicate - will be ignored

        // ---- DISPLAY FINAL TRAIN FORMATION ----
        System.out.println("Final Train Formation:");
        System.out.println(formation);

        System.out.println("\nNote:");
        System.out.println("LinkedHashSet preserves insertion order and removes duplicates automatically.");

        System.out.println("\nUC5 formation setup completed...");
    }
}