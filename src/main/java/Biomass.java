import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Biomass {

    public int GenerateBiomassQuantity(List<List<String>> Map) {
        //Method used to Generate biomass quantity

        Random random = new Random();
        int min = 0;
        int max = Map.get(0).size();

        //generating quantity of biomass

        return random.nextInt(max - min) + min;
    }

    public void AddBiomass(List<List<String>> Map, int GenerateBiomassQuantity) {
        //Method used to add Generated biomass to map

        List<String> Biomass = new ArrayList<>();

        //adding biomass to list
        for (int quantity_a = 1; quantity_a <= GenerateBiomassQuantity; quantity_a++)
            Biomass.add("*");


        int max = Map.get(0).size() - 1;

        int min = 0;


        for (int column = 0; column < GenerateBiomassQuantity; column++) {

            //generate position biomass drawing

            Random randomX = new Random();
            int x = randomX.nextInt(max - min) + min;

            Random randomY = new Random();
            int y = randomY.nextInt(max - min) + min;

            //checking, if there is a room for biomass
            if (Map.get(x).get(y).equals("0")) {

                //adding biomass list to every row of 2d map
                Map.get(x).set(y, Biomass.get(column));

            }

        }


    }
}
