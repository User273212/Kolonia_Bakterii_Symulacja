import java.util.List;

public abstract class BacteriaMovement implements CheckIfAdult, IsOutOfBorder, GrowBacteria {

    //fields


    //methods

    protected List<List<String>> MoveBacteria(List<List<String>> Map) {


        //CheckIfAdult
        for (int y = 0; y < Map.size(); y++)
            for (int x = 0; x < Map.get(0).size(); x++) {


                //horizontal movement

                if (CheckIfAdult(Map, BacteriaCreator.A, y, x) & (x + 2 < Map.get(0).size())) {

                    //move adult bacteria by 2 squares
                    Map.get(y).set(x + 2, String.valueOf(BacteriaCreator.A));

                    //delete bacteria from previous position
                    Map.get(y).set(x, "0");

                    //increase the value of row to stop moving this bacteria
                    x++;

                    //vertical movement


                } else if (Map.get(y).get(x).equals(String.valueOf(BacteriaCreator.a)) & (x + 1 < Map.get(0).size())) {


                    if (Map.get(y).get(x + 1).equals("*")) {

                        Map.get(y).set(x + 1, String.valueOf(BacteriaCreator.A));
                        //growing bacteria
                        //   GrowBacteria(Map, y, x + 1);
                        Map.get(y).set(x, "0");
                        // x++;
                    } else {

                        //move small bacteria by 1 square
                        Map.get(y).set(x + 1, String.valueOf(BacteriaCreator.a));

                        //delete bacteria from previous position
                        Map.get(y).set(x, "0");

                        //increase the value of row to stop moving this bacteria
                        x++;

                        //vertical movement

                    }
                }

            }

        return Map;
    }
}
