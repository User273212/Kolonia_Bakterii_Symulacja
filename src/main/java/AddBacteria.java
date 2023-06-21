
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class AddBacteria {

    public List<List<String>> AddBacteria(int BacteriaNumberA, int BacteriaNumberB, List<List<String>> Map) {
        //Method used for adding bacteria to map

        //creating list, which will contain bacteria
        List<String> BacteriaList = new ArrayList<>();

        //adding bacteria "a" to list
        for (int quantity_a = 1; quantity_a <= BacteriaNumberA; quantity_a++)
            BacteriaList.add(BacteriaType.a.toString());

        //adding bacteria "b" to list
        for (int quantity_b = 1; quantity_b <= BacteriaNumberB; quantity_b++) {
            BacteriaList.add(BacteriaType.b.toString());
        }

        int Xmax = Map.size() - 1;
        int min = 0;

        int Ymax = Map.get(0).size() - 1;


        for (String add : BacteriaList) {

            //generate position - bacteria

            Random randomX = new Random();
            int x = randomX.nextInt(Xmax - min + 1) + min;

            Random randomY = new Random();
            int y = randomY.nextInt(Ymax - min + 1) + min;

            //adding bacteria list to every row of 2d map
            Map.get(x).set(y, add);
        }


        return Map;
    }

}
