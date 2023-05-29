import java.util.ArrayList;
import java.util.List;

public class MapCreator {

    //instances

    Input input = new Input();

    //fields

    private int Lenght = input.GetLenght();
    private int Width = input.GetWidth();
    private List<List<String>> CreatedMap = Create2DMap(Width, Lenght);
    protected List<List<String>> Map = CreatedMap;

    //methods


    private List<List<String>> Create2DMap(int x, int y) {

        List<List<String>> Map = new ArrayList<>();

        //add sublists to main list
        for (int row = 0; row < x; row++) {
            Map.add(row, new ArrayList<>());
            for (int column = 0; column < y; column++) {
                Map.get(row).add(column, "0");
            }

        }
        return Map;
    }


}

