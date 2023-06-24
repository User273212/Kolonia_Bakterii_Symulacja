import java.util.ArrayList;
import java.util.List;

/**
 * The type Map creator.
 */
public class MapCreator {

    private List<List<String>> CreatedMap;

    /**
     * Instantiates a new Map creator.
     */
    public MapCreator() {
        //Map constructor
        Input input = new Input();
        int length = input.getInputNextInt();
        int width = input.getInputNextInt();
        if (length < 0 || width < 0) {
            System.out.println("\nValues have to be positive!");
            System.exit(0);
        }
        this.CreatedMap = Create2DMap(width, length);
    }

    /**
     * Create 2 d map list.
     *
     * @param x the x
     * @param y the y
     * @return the list
     */
    public List<List<String>> Create2DMap(int x, int y) {

        //Method use to create 2d Map

        List<List<String>> Map = new ArrayList<>();

        //add sublist to main list
        for (int row = 0; row < x; row++) {
            Map.add(row, new ArrayList<>());
            for (int column = 0; column < y; column++) {
                Map.get(row).add(column, "0");
            }

        }
        return Map;
    }


    /**
     * Gets map.
     *
     * @return the map
     */
    public List<List<String>> getMap() {
        //Getter for created Map
        return CreatedMap;
    }

    /**
     * Sets map.
     *
     * @param map the map
     */
    public void setMap(List<List<String>> map) {
        //Setter for Map
        CreatedMap = map;
    }
}

