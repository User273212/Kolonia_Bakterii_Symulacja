import java.util.List;

public abstract class BacteriaMovement implements CheckIfAdult, IsOutOfBorder, GrowBacteria, SplitBacteria {

    //fields


    //methods

    protected List<List<String>> MoveBacteria(List<List<String>> Map) {



        for (int y = 0; y < Map.size(); y++)
            for (int x = 0; x < Map.get(0).size(); x++) {


                //horizontal movement
//Map.get(y).get(x).equals(String.valueOf(BacteriaCreator.A))
                //CheckIfAdult
                if (Map.get(y).get(x).equals(String.valueOf(BacteriaCreator.A)) & (x + 2 < Map.get(0).size())) { //CheckIfAdult(Map, BacteriaCreator.A, y, x)

                    //move adult bacteria by 2 squares
                    Map.get(y).set(x + 2, String.valueOf(BacteriaCreator.A));

                    //delete bacteria from previous position
                    Map.get(y).set(x, "0");

                    //increase the value of row to stop moving this bacteria
                    x++;

                    //split bacteria
                    if (Map.get(y).get(x + 1).equals("*")) {
                        SplitBacteria(Map, y, x, BacteriaCreator.a);
                        Map.get(y).set(x, "0");
                    }

                    //vertical movement


                }
                if (Map.get(y).get(x).equals(String.valueOf(BacteriaCreator.a)) & (x + 1 < Map.get(0).size())) {


                    if (Map.get(y).get(x + 1).equals("*")) {


                        //growing bacteria
                        GrowBacteria(Map, y, x + 1, BacteriaCreator.A);
                        Map.get(y).set(x, "0");

                        //increase the value of row to stop moving this bacteria
                        x += 3;
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
