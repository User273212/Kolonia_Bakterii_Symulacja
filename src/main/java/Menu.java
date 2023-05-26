import java.util.List;
import java.util.Scanner;

public class Menu {

    //instances

    //fields
    private static final String Exit = "e";
    private static final String Start = "s";
    static Scanner insert = new Scanner(System.in);

    //variables

    public static void main(String[] args) {

        //Menu
        MainMenu();

        //DetectButton, eventually set simulation


        if (CheckButton(insert.nextLine())) {


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
            //bacteria B number
            long EndSimulation = SetSimulation(input.GetSimulationDuration()); //get simulation duration

            //check if current duration of simulation is smaller than given value
            if (System.currentTimeMillis() < EndSimulation) {

                StartSimulation();
                System.out.println("\n\b\bGenerating simulation...");

                //print as matrix
                for (List<String> matrix : Map)
                    System.out.println(matrix);
            }

        }


    }

    private static void MainMenu() {
        System.out.println("\n\b\bSimulation - \"Bacterial colony\"\n");
        System.out.println("Press desired button:");
        System.out.println("e - Exit simulation");
        System.out.println("s - Start simulation");
    }

    private static boolean CheckButton(String button) {

        boolean value = false;

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
