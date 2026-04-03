import java.util.LinkedList;

/**
 * ============================================================
 * MAIN CLASS - UseCase4TrainConsistMgmnt
 * ============================================================
 *
 * Use Case 4: Maintain Ordered Bogie Consist
 *
 * Description:
 * This class maintains the physical sequence of bogies
 * in a train formation using LinkedList.
 *
 * At this stage, the application:
 * - Stores bogies in insertion order
 * - Supports positional insertion and removal
 * - Models real train chaining behavior
 *
 * This maps ordered consist management using LinkedList.
 *
 * @author Developer
 * @version 4.0
 */
public class TrainConsistManagementApp {

    public static void main(String[] args) {

        System.out.println("========================================");
        System.out.println(" UC4 - Maintain Ordered Bogie Consist ");
        System.out.println("========================================\n");

        // Create a LinkedList to store bogies in order
        LinkedList<String> consist = new LinkedList<>();

        // ---- ADD BOGIES IN SEQUENCE ----
        // addLast() appends bogies to the end of the train
        consist.addLast("Engine");
        consist.addLast("Sleeper");
        consist.addLast("AC");
        consist.addLast("Cargo");
        consist.addLast("Guard");

        // Display initial train consist
        System.out.println("Initial Train Consist:");
        System.out.println(consist);

        // ---- INSERT PANTRY CAR AT POSITION 2 ----
        // add(index, element) inserts at the specified position
        consist.add(2, "Pantry Car");

        System.out.println("\nAfter Inserting 'Pantry Car' at position 2:");
        System.out.println(consist);

        // ---- REMOVE FIRST AND LAST BOGIE ----
        // removeFirst() detaches the locomotive (head)
        // removeLast() detaches the guard coach (tail)
        consist.removeFirst();
        consist.removeLast();

        System.out.println("\nAfter Removing First and Last Bogie:");
        System.out.println(consist);

        System.out.println("\nUC4 ordered consist operations completed...");
    }
}