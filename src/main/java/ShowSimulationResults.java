import java.util.List;

public class ShowSimulationResults implements BacteriaQuantity {

    /*
    Class used for storing final data of simulation
     */

    //fields
    private int Width;
    private int Lenght;

    //before simulation
    private int BacteriaChildA;
    private int BacteriaChildB;
    private int BacteriaAdultA;
    private int BacteriaAdultB;

    //after simulation
    private int BacteriaChildAQuantity;
    private int BacteriaChildBQuantity;
    private int BacteriaAdultAQuantity;
    private int BacteriaAdultBQuantity;
    private long SimulationTime;


    //constructor
    public ShowSimulationResults(List<List<String>> Map, int BacteriaChildA, int BacteriaChildB, int BacteriaAdultA, int BacteriaAdultB, long SimulationTime) {

        Width = Map.size();
        Lenght = Map.get(0).size();

        //before simulation
        this.BacteriaChildA = BacteriaChildA;
        this.BacteriaChildB = BacteriaChildB;
        this.BacteriaAdultA = BacteriaAdultA;
        this.BacteriaAdultB = BacteriaAdultB;

        //after simulation
        BacteriaChildAQuantity = BacteriaQuantity(Map, BacteriaCreator.a);
        BacteriaChildBQuantity = BacteriaQuantity(Map, BacteriaCreator.b);
        BacteriaAdultAQuantity = BacteriaQuantity(Map, BacteriaCreator.A);
        BacteriaAdultBQuantity = BacteriaQuantity(Map, BacteriaCreator.B);
        this.SimulationTime = SimulationTime;

    }
    //constructor


    //methods

    public void ShowResults() {


        //Simulation information
        System.out.println("\n\nSimulation data:\n");
        System.out.println("Width (x) of 2D map: " + Width);
        System.out.println("Lenght (y) of 2D map: " + Lenght);

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
