import java.util.List;
import java.util.Scanner;

public class Menu {

    private static final String Exit = "e";
    private static final String Start = "s";

    //variables

    public static void main(String[] args) {
        //Menu
        MainMenu();
        if (CheckButton()) {
            System.out.println("\n\b\bOptions:");
            System.out.println("\nWARNING!\nAll values must be integer!\n");
            System.out.println("1)Width (x) of 2D map");
            System.out.println("2)Length (y) of 2D map");
            System.out.println("3)Number of Bacteria type A");
            System.out.println("4)Number of Bacteria type B");
            System.out.println("5)Total time of simulation or number of maximum iterations");

            //preparing input
            Input input = new Input();
            MapCreator mapCreator = new MapCreator();
            //accessing created map
            List<List<String>> Map = mapCreator.getMap();
            //bacteria A number
            int BacteriaNumberA = input.getInputNextInt();
            //bacteria B number
            int BacteriaNumberB = input.getInputNextInt();
            int SimulationDuration = input.getInputNextInt();
            //get simulation duration
            long EndSimulation = SetSimulation(SimulationDuration);


            System.out.println("\n\b\bGenerating simulation...\n");

            //print as matrix
            PrintMap(Map);

            //add bacteria
            AddBacteria add_bacteria = new AddBacteria();
            Map = add_bacteria.AddBacteria(BacteriaNumberA, BacteriaNumberB, Map);

            System.out.println();
            PrintMap(Map);

            //adding biomass
            Biomass biomass = new Biomass();
            biomass.AddBiomass(Map, biomass.GenerateBiomassQuantity(Map));

            System.out.println();
            PrintMap(Map);

            //input information
            System.out.println("\n\nEntered data:\n");
            System.out.println("1)Width (x) of 2D map: " + Map.size());
            System.out.println("2)Length (y) of 2D map: " + Map.get(0).size());
            System.out.println("3)Number of Bacteria type A: " + BacteriaNumberA);
            System.out.println("4)Number of Bacteria type B: " + BacteriaNumberB);
            System.out.println("5)Total time of simulation: " + (EndSimulation - System.currentTimeMillis()) + " s"); //SimulationDuration


            //Testing movement of bacteria
            while (System.currentTimeMillis() + SimulationDuration < EndSimulation) {

                //check if current duration of simulation is smaller than given value

                //round of bacteria A
                BacteriaA bacteria_a = new BacteriaA();
                bacteria_a.moveBacteriaA(Map);

                System.out.println("\nround of bacteria A:");
                PrintMap(Map);

                //round of biomass - adding biomass
                biomass.AddBiomass(Map, biomass.GenerateBiomassQuantity(Map));

                System.out.println("\nround of biomass - adding biomass:");
                PrintMap(Map);

                //round of bacteria B
                BacteriaB bacteria_b = new BacteriaB();
                bacteria_b.moveBacteriaB(Map);

                System.out.println("\nround of bacteria B:");
                PrintMap(Map);
            }

            long SimulationTime = EndSimulation - System.currentTimeMillis();

            PrintSimulationData(Map, BacteriaNumberA, BacteriaNumberB, 0, 0, SimulationTime);
        }

    }

    private static void MainMenu() {
        //Method used to print Menu
        System.out.println("\n\b\bSimulation - \"Bacterial colony\"\n");
        System.out.println("Press desired button:");
        System.out.println("e - Exit simulation");
        System.out.println("s - Start simulation");
    }

    private static boolean CheckButton() {

        //Method used to react on entered option
        boolean value = false;
        Scanner insert = new Scanner(System.in);
        String button;
        do {
            button = insert.nextLine();
            switch (button) {
                case Exit -> ExitSimulation();
                case Start -> {
                    System.out.println("\n\nPlease, insert desired settings for simulation");
                    value = true;
                }
                default -> System.out.println("\n\nThere is no such option in the menu!");
            }
        } while ((!button.equals(Start)));

        return value;
    }

    private static void PrintMap(List<List<String>> Map) {

        //Prints Map as matrix
        for (List<String> matrix : Map)
            System.out.println(matrix);
    }

    private static void ExitSimulation() {
        //Method used to exit simulation
        System.exit(0);
    }

    private static long SetSimulation(int duration) {

        //setting duration of whole simulation

        SimulationSettings simulation_settings = new SimulationSettings();
        return simulation_settings.SetSimulationDuration(duration);

    }

    private static void PrintSimulationData(List<List<String>> Map, int BacteriaChildA, int BacteriaChildB, int BacteriaAdultA, int BacteriaAdultB, long SimulationTime) {
        //Accessing data of Simulation and printing it
        ShowSimulationResults results = new ShowSimulationResults(Map, BacteriaChildA, BacteriaChildB, BacteriaAdultA, BacteriaAdultB, SimulationTime);
        results.ShowResults();
    }
}
