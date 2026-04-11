import java.util.*;

class CargoSafetyException extends RuntimeException {
    public CargoSafetyException(String message) {
        super(message);
    }
}
class GoodsBogie {
    String type;
    String cargo;

    GoodsBogie(String type) {
        this.type = type;
    }

    void assignCargo(String cargo) {
        try {
            if (type.equalsIgnoreCase("Rectangular") && cargo.equalsIgnoreCase("Petroleum")) {
                throw new CargoSafetyException("Unsafe: Petroleum cannot be assigned to Rectangular bogie");
            }

            this.cargo = cargo;
            System.out.println("Cargo '" + cargo + "' assigned to " + type + " bogie");

        } catch (CargoSafetyException e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            System.out.println("Cargo assignment attempt completed for " + type + " bogie\n");
        }
    }

    void display() {
        System.out.println("Bogie Type: " + type + ", Cargo: " + (cargo != null ? cargo : "None"));
    }
}

public class TrainConsistManagementApp {

    public static void main(String[] args) {

        System.out.println("=== Train Consist Management App ===");

        GoodsBogie b1 = new GoodsBogie("Cylindrical");
        GoodsBogie b2 = new GoodsBogie("Rectangular");

        b1.assignCargo("Petroleum");

        b2.assignCargo("Petroleum");

        b2.assignCargo("Coal");

        System.out.println("Final Bogie Status:");
        b1.display();
        b2.display();

        System.out.println("Program continues safely...");
    }
}