import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class AddBacteria {

    //fields

    // static GetMap get = new GetMap();
    // static List<List<String>> Map = get.GetMap();

    //methods

    public List<List<String>> AddBacteria(int BacteriaNumberA, int BacteriaNumberB, List<List<String>> Map) {

        //creating list, which will contain bacteria
        List<String> BacteriaList = new ArrayList<>();

        //adding bacteria "a" to list
        for (int quantity_a = 1; quantity_a <= BacteriaNumberA; quantity_a++)
            BacteriaList.add(BacteriaCreator.a.toString());

        //adding bacteria "b" to list
        for (int quantity_b = 1; quantity_b <= BacteriaNumberB; quantity_b++) {
            BacteriaList.add(BacteriaCreator.b.toString());
        }

        int SumBacteria = BacteriaList.size();

        int max = Map.get(0).size() - 1;

        int min = 0;


        for (int column = 0; column < SumBacteria; column++) {

            //generate position - bacteria

            Random randomX = new Random();
            int x = randomX.nextInt(max - min) + min;

            Random randomY = new Random();
            int y = randomY.nextInt(max - min) + min;

            //adding bacteria list to every row of 2d map
            Map.get(x).set(y, BacteriaList.get(column));
        }


        return Map;
    }

}
