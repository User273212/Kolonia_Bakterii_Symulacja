import java.util.List;

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


    //constructor
    public ShowSimulationResults(List<List<String>> Map, int BacteriaChildA, int BacteriaChildB, int BacteriaAdultA, int BacteriaAdultB, long SimulationTime) {

        //Method used to assign data to private fields of ShowSimulationResults Class

        Width = Map.size();
        Length = Map.get(0).size();

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


    public void ShowResults() {

        // Method used for printing enetered and final data of simulation

        //Simulation information
        System.out.println("\n\nSimulation data:\n");
        System.out.println("Width (x) of 2D map: " + Width);
        System.out.println("Lenght (y) of 2D map: " + Length);

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
        System.out.println("7)Total time of simulation or number of maximum iterations: " + SimulationTime + " seconds");
    }


}
