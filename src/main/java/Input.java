import java.util.Scanner;

public class Input {

    //instances

    Scanner input = new Scanner(System.in);

    //methods

    public int GetLenght() {
        return input.nextInt();
    }

    public int GetWidth() {
        return input.nextInt();
    }

    public int GetBacteriaNumberA() {
        return input.nextInt();
    }

    public int GetBacteriaNumberB() {
        return input.nextInt();
    }


    public int GetSimulationDuration() {
        return input.nextInt();
    }
}
