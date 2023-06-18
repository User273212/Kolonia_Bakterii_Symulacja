import java.util.ArrayList;
import java.util.List;

public class MapCreator {

    private List<List<String>> CreatedMap;

    public MapCreator() {
        //Map constructor
        Input input = new Input();
        int length = input.getInputNextInt();
        int width = input.getInputNextInt();
        this.CreatedMap = Create2DMap(width, length);
    }

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


    public List<List<String>> getMap() {
        //Getter for created Map
        return CreatedMap;
    }

    public void setMap(List<List<String>> map) {
        //Setter for Map
        CreatedMap = map;
    }
}

