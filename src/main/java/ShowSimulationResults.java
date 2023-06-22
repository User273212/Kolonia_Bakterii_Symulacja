import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

/**
 * The type Show simulation results.
 */
public class ShowSimulationResults implements BacteriaQuantity {


    // Class used for storing final data of simulation


    //fields
    private final int Width;
    private final int Length;

    //before simulation
    private final int BacteriaChildA;
    private final int BacteriaChildB;
    private final int BacteriaAdultA;
    private final int BacteriaAdultB;

    //after simulation
    private final int BacteriaChildAQuantity;
    private final int BacteriaChildBQuantity;
    private final int BacteriaAdultAQuantity;
    private final int BacteriaAdultBQuantity;
    private final long SimulationTime;


    /**
     * Instantiates a new Show simulation results.
     *
     * @param Map            the map
     * @param BacteriaChildA the bacteria child a
     * @param BacteriaChildB the bacteria child b
     * @param BacteriaAdultA the bacteria adult a
     * @param BacteriaAdultB the bacteria adult b
     * @param SimulationTime the simulation time
     */
//constructor
    public ShowSimulationResults(List<List<String>> Map, int BacteriaChildA, int BacteriaChildB, int BacteriaAdultA, int BacteriaAdultB, long SimulationTime) {

        //Method used to assign data to private fields of ShowSimulationResults Class

        Length = Map.size();
        Width = Map.get(0).size();

        //before simulation
        this.BacteriaChildA = BacteriaChildA;
        this.BacteriaChildB = BacteriaChildB;
        this.BacteriaAdultA = BacteriaAdultA;
        this.BacteriaAdultB = BacteriaAdultB;

        //after simulation
        BacteriaChildAQuantity = BacteriaQuantity(Map, BacteriaType.a);
        BacteriaChildBQuantity = BacteriaQuantity(Map, BacteriaType.b);
        BacteriaAdultAQuantity = BacteriaQuantity(Map, BacteriaType.A);
        BacteriaAdultBQuantity = BacteriaQuantity(Map, BacteriaType.B);
        this.SimulationTime = SimulationTime;

    }


    /**
     * Show results.
     */
    public void ShowResults() {

        // Method used for printing enetered and final data of simulation

        //Simulation information
        System.out.println("\n\nSimulation data:\n");
        System.out.println("Width (x) of 2D map: " + Width);
        System.out.println("Length (y) of 2D map: " + Length);

        System.out.println("\nBefore simulation:\n");

        System.out.println("1)Number of adult Bacteria type A: " + BacteriaAdultA);
        System.out.println("2)Number of adult Bacteria type B: " + BacteriaAdultB);
        System.out.println("3)Number of child Bacteria type a: " + BacteriaChildA);
        System.out.println("4)Number of child Bacteria type b: " + BacteriaChildB);
        System.out.println("5)Number of Bacteria type A: " + (BacteriaChildA + BacteriaAdultA));
        System.out.println("6)Number of Bacteria type B: " + (BacteriaChildB + BacteriaAdultB));

        System.out.println("\nAfter simulation:\n");

        System.out.println("1)Number of adult Bacteria type A: " + BacteriaAdultAQuantity);
        System.out.println("2)Number of adult Bacteria type B: " + BacteriaAdultBQuantity);
        System.out.println("3)Number of child Bacteria type a: " + BacteriaChildAQuantity);
        System.out.println("4)Number of child Bacteria type b: " + BacteriaChildBQuantity);
        System.out.println("5)Number of Bacteria type A: " + (BacteriaChildAQuantity + BacteriaAdultAQuantity));
        System.out.println("6)Number of Bacteria type B: " + (BacteriaChildBQuantity + BacteriaAdultBQuantity));
        System.out.println("7)Total time of simulation: " + SimulationTime + " seconds");


        // Save data to "Simulation_Results.txt"


        // Define the path to the desktop
        String desktopPath = System.getProperty("user.home") + "/Desktop";
        // Create the Simulation directory on the desktop if it doesn't exist
        String simulationPath = desktopPath + "/Simulation";
        File simulationDir = new File(simulationPath);
        if (!simulationDir.exists()) {
            simulationDir.mkdir();
        }
        // File used to save data
        String fileName = "Simulation_Results.txt";
        // Define the path to the text file to be created
        String filePath = simulationPath + "/" + fileName;
        try {
            // Write the data to the text file
            FileWriter writer = new FileWriter(filePath);
            writer.write("\n\nSimulation data:\n\n");
            writer.write("Width (x) of 2D map: " + Width + "\n");
            writer.write("Length (y) of 2D map: " + Length + "\n\n");
            writer.write("Before simulation:\n\n");
            writer.write("1)Number of adult Bacteria type A: " + BacteriaAdultA + "\n");
            writer.write("2)Number of adult Bacteria type B: " + BacteriaAdultB + "\n");
            writer.write("3)Number of child Bacteria type a: " + BacteriaChildA + "\n");
            writer.write("4)Number of child Bacteria type b: " + BacteriaChildB + "\n");
            writer.write("5)Number of Bacteria type A: " + (BacteriaChildA + BacteriaAdultA) + "\n");
            writer.write("6)Number of Bacteria type B: " + (BacteriaChildB + BacteriaAdultB) + "\n\n");
            writer.write("After simulation:\n\n");
            writer.write("1)Number of adult Bacteria type A: " + BacteriaAdultAQuantity + "\n");
            writer.write("2)Number of adult Bacteria type B: " + BacteriaAdultBQuantity + "\n");
            writer.write("3)Number of child Bacteria type a: " + BacteriaChildAQuantity + "\n");
            writer.write("4)Number of child Bacteria type b: " + BacteriaChildBQuantity + "\n");
            writer.write("5)Number of Bacteria type A: " + (BacteriaChildAQuantity + BacteriaAdultAQuantity) + "\n");
            writer.write("6)Number of Bacteria type B: " + (BacteriaChildBQuantity + BacteriaAdultBQuantity) + "\n");
            writer.write("7)Total time of simulation: " + SimulationTime + " seconds\n");
            writer.close();
            System.out.println("\nData saved to file successfully.");
        } catch (IOException e) {
            System.out.println("An error occurred while saving data to file.");
            e.printStackTrace();
        }
    }


}
