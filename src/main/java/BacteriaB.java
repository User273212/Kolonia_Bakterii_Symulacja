import java.util.List;

public class BacteriaB extends BacteriaMovement {

    //fields

    public List<List<String>> Map;
    private int BacteriaNumberB;

    //methods

    private void SetBacteriaQuantity(int BacteriaNumberA) {

    }

    private void BacteriaB(List<List<String>> Map) {

        MoveBacteria(Map);

    }

    public void GetBacteriaB(List<List<String>> Map) {
        BacteriaB(Map);
    }

    @Override
    protected List<List<String>> MoveBacteria(List<List<String>> Map) {

        for (int y = 0; y < Map.size(); y++)
            for (int x = 0; x < Map.get(0).size(); x++) {


                //horizontal movement
//Map.get(y).get(x).equals(String.valueOf(BacteriaCreator.A))
                //CheckIfAdult
                if (Map.get(y).get(x).equals(String.valueOf(BacteriaCreator.B)) & (x + 2 < Map.get(0).size())) {

                    //move adult bacteria by 2 squares
                    Map.get(y).set(x + 2, String.valueOf(BacteriaCreator.B));

                    //delete bacteria from previous position
                    Map.get(y).set(x, "0");

                    //increase the value of row to stop moving this bacteria
                    x++;

                    //vertical movement


                }
                if (Map.get(y).get(x).equals(String.valueOf(BacteriaCreator.b)) & (x + 1 < Map.get(0).size())) {


                    if (Map.get(y).get(x + 1).equals("*")) {


                        //growing bacteria
                        GrowBacteria(Map, y, x + 1, BacteriaCreator.B);
                        Map.get(y).set(x, "0");

                        //increase the value of row to stop moving this bacteria
                        x += 2;
                    } else {

                        //move small bacteria by 1 square
                        Map.get(y).set(x + 1, String.valueOf(BacteriaCreator.b));

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

    public int CountBacteria() {

        return 0;
    }

    public List<List<String>> SplitBacteria() {

        List<List<String>> Map = null;
        return Map;
    }

}
