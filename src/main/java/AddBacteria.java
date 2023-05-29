import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class AddBacteria {

    //fields

    // static GetMap get = new GetMap();
    // static List<List<String>> Map = get.GetMap();

    //methods

    public List<List<String>> AddBacteria(int BacteriaNumberA, int BacteriaNumberB, List<List<String>> Map) {

        //creating list, which will generate position of bacteria
        List<String> ShuffledList = new ArrayList<>();

        //adding bacteria "a" to list
        for (int quantity = 1; quantity <= BacteriaNumberA; quantity++)
            ShuffledList.add(BacteriaCreator.a.toString());

        //adding bacteria "b" to list
        for (int quantity = 1; quantity <= BacteriaNumberB; quantity++) {
            quantity = 1;
            ShuffledList.add(BacteriaCreator.b.toString());
        }


        for (int row = 0; row < Map.size(); row++) {

            //generate position - shuffle list => bacteria drawing
            Collections.shuffle(ShuffledList);

                /*
                Random random = new Random();
                int RndX = random.nextInt(max - min) + min;
                int RndY = random.nextInt(max - min) + min;

                System.out.println("RNDX: " + RndX + "\nRNDY: " + RndY);
                */
            for (int column = 0; column < Map.get(row).size(); column++) {

                //adding shufled list to every row of 2d map
                Map.get(row).set(column, ShuffledList.get(column));
            }


        }

        return Map;
    }

}
