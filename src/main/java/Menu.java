import java.util.List;
import java.util.Scanner;

public class Menu {

    //instances

    //fields
    private static final String Exit = "e";
    private static final String Start = "s";

    //variables

    public static void main(String[] args) {

        //Menu
        MainMenu();

        //DetectButton, eventually set simulation


        if (CheckButton()) {


            System.out.println("\n\b\bOptions:");
            System.out.println("\nWARNIG!\nAll values must be integer!\n");
            System.out.println("1)Width (x) of 2D map");
            System.out.println("2)Lenght (y) of 2D map");
            System.out.println("3)Number of Bacteria type A");
            System.out.println("4)Number of Bacteria type B");
            System.out.println("5)Total time of simulation or number of maximum iterations");


            Input input = new Input(); //preparing input
            GetMap get_map = new GetMap(); //creating 2D Map - inserting Lenght and Width
            List<List<String>> Map = get_map.GetMap(); //accesing created map
            //bacteria A number
            int BacteriaNumberA = input.GetBacteriaNumberA();
            //bacteria B number
            int BacteriaNumberB = input.GetBacteriaNumberB();
            int SimulationDuration = input.GetSimulationDuration();
            long EndSimulation = SetSimulation(SimulationDuration); //get simulation duration

            //check if current duration of simulation is smaller than given value


            StartSimulation();
            System.out.println("\n\b\bGenerating simulation...\n");

            //print as matrix
            for (List<String> matrix : Map)
                System.out.println(matrix);


            //add bacteria
            AddBacteria add_bacteria = new AddBacteria();
            //     Map = add_bacteria.AddBacteria(BacteriaNumberA, BacteriaNumberB, Map); //ERROR

            //input information
            System.out.println("\n\nEntered data:\n");
            System.out.println("1)Width (x) of 2D map: " + Map.size());
            System.out.println("2)Lenght (y) of 2D map: " + Map.get(0).size());
            System.out.println("3)Number of Bacteria type A: " + BacteriaNumberA);
            System.out.println("4)Number of Bacteria type B: " + BacteriaNumberB);
            System.out.println("5)Total time of simulation or number of maximum iterations: " + SimulationDuration);

            //print as matrix
            System.out.println("\nMatrix:\n");
            for (List<String> matrix : Map)
                System.out.println(matrix);


        }


    }

    private static void MainMenu() {
        System.out.println("\n\b\bSimulation - \"Bacterial colony\"\n");
        System.out.println("Press desired button:");
        System.out.println("e - Exit simulation");
        System.out.println("s - Start simulation");
    }

    private static boolean CheckButton() {

        boolean value = false;
        Scanner insert = new Scanner(System.in);
        String button;
        do {
            button = insert.nextLine();
            switch (button) {
                case Exit:
                    ExitSimulation();
                    break;
                case Start: {
                    System.out.println("\n\nPlease, insert desired settings for simulation");
                    value = true;
                }
                break;
                default:
                    System.out.println("\n\nThere is no such option in the menu!");
                    break;
            }
        } while ((!button.equals(Start)));

        System.out.println("value: " + value);
        return value;
    }

    //methods
    private static void ExitSimulation() {
        System.exit(0);
    }

    private static long SetSimulation(int duration) {

        //setting duration of whole simulation

        SimulationSettings simulation_settings = new SimulationSettings();
        return simulation_settings.SetSimulationDuration(duration);

    }

    private static void StartSimulation() {

    }
}
