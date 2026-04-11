import java.util.*;

// Custom Exception Class
class InvalidCapacityException extends Exception {
    public InvalidCapacityException(String message) {
        super(message);
    }
}

// Passenger Bogie Class
class PassengerBogie {
    String type;
    int capacity;

    // Constructor with validation
    PassengerBogie(String type, int capacity) throws InvalidCapacityException {
        if (capacity <= 0) {
            throw new InvalidCapacityException("Capacity must be greater than zero");
        }
        this.type = type;
        this.capacity = capacity;
    }

    void display() {
        System.out.println("Bogie Type: " + type + ", Capacity: " + capacity);
    }
}

public class TrainConsistManagementApp {

    public static void main(String[] args) {

        System.out.println("=== Train Consist Management App ===");

        List<PassengerBogie> train = new ArrayList<>();

        try {
            // Valid bogies
            PassengerBogie b1 = new PassengerBogie("Sleeper", 72);
            PassengerBogie b2 = new PassengerBogie("AC Chair", 60);

            train.add(b1);
            train.add(b2);

            // Invalid bogie (will throw exception)
            PassengerBogie b3 = new PassengerBogie("First Class", 0);
            train.add(b3);

        } catch (InvalidCapacityException e) {
            System.out.println("Error: " + e.getMessage());
        }

        // Display valid bogies
        System.out.println("Final Train Composition:");
        for (PassengerBogie b : train) {
            b.display();
        }

        System.out.println("Program continues safely...");
        System.out.println("Program continues...");
        System.out.println("\nUC7 sorting completed...");
        System.out.println("\nUC6 bogie-capacity mapping completed...");
        System.out.println("\nNote:");
        System.out.println("LinkedHashSet preserves insertion order and removes duplicates automatically.");

        System.out.println("\nUC5 formation setup completed...");
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