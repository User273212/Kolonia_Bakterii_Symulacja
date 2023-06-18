import java.util.List;
import java.util.Random;

public abstract class BacteriaMovement implements IsOutOfBorder, GrowBacteria, SplitBacteria {

    public void moveBacteria(List<List<String>> Map, BacteriaType bigBacteria, BacteriaType smallBacteria) {
        //Method used to move bacteria around the Map and if possible, to activate bacteria splitting
        for (int y = 0; y < Map.size(); y++)
            for (int x = 0; x < Map.get(0).size(); x++) {
                if (Map.get(y).get(x).equals(String.valueOf(bigBacteria))) {

                    //Splitting bacteria
                    SplitBacteria(Map, y, x, smallBacteria);
                }

                if (Map.get(y).get(x).equals(String.valueOf(smallBacteria)) & (x + 1 < Map.get(0).size())) {
                    if (Map.get(y).get(x + 1).equals("*")) {
                        GrowBacteria(Map, y, x + 1, bigBacteria);
                        Map.get(y).set(x, "0");
                        x += 3;
                    } else {
                        //Moving bacteria in any direction
                        generalizedMovement(Map, y, x, smallBacteria, true);
                        x++;
                    }
                }
            }
    }

    private void generalizedMovement(List<List<String>> Map, int PositionY, int PositionX, BacteriaType bacteriaType, boolean isBacteriaSmall) {
        //Method used to move bacteria around the Map in any direction, using pseudorandom numbers
        int min;
        int max;

        if (isBacteriaSmall) {
            min = -1;
            max = 1;
        } else {
            min = -2;
            max = 2;
        }

        Random randomY = new Random();
        Random randomX = new Random();

        int y = randomY.nextInt(max - min + 1) + min;
        int x = randomX.nextInt(max - min + 1) + min;

        //Check if bacteria is going to be out of border
        if (IsOutOfBorder(Map, PositionY + y, PositionX + x)) {

            Map.get(PositionY + y).set(PositionX + x, String.valueOf(bacteriaType));

            if (x != 0 | y != 0)
                Map.get(PositionY).set(PositionX, "0");
        }
    }
}
