import java.util.List;

public class ShowSimulationResults extends BacteriaTypeQuantity {

    //methods

    private void ShowResults(List<List<String>> Map) {
        //input information
        System.out.println("\n\nEntered data:\n");
        System.out.println("1)Width (x) of 2D map: " + Map.size());
        System.out.println("2)Lenght (y) of 2D map: " + Map.get(0).size());
        // System.out.println("3)Number of Bacteria type A: " + BacteriaNumberA);
        //  System.out.println("4)Number of Bacteria type B: " + BacteriaNumberB);
        // System.out.println("5)Total time of simulation or number of maximum iterations: " + (EndSimulation - System.currentTimeMillis()) );
    }

}
