import java.util.List;
import java.util.Random;

public class BacteriaB extends BacteriaMovement {

    //fields

    // public List<List<String>> Map;
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

        // GeneralizedMovement(Map, 0, 0, BacteriaCreator.a);

        for (int y = 0; y < Map.size(); y++)
            for (int x = 0; x < Map.get(0).size(); x++) {


                //horizontal movement

                //CheckIfAdult
                if (Map.get(y).get(x).equals(String.valueOf(BacteriaCreator.B)) & (x + 2 < Map.get(0).size())) { //CheckIfAdult(Map, BacteriaCreator.A, y, x)

                    //move adult bacteria by 2 squares
                    //      Map.get(y).set(x + 2, String.valueOf(BacteriaCreator.B));
                    GeneralizedMovement(Map, y, x, BacteriaCreator.B);
                    //delete bacteria from previous position
                    //       Map.get(y).set(x, "0");

                    //increase the value of row to stop moving this bacteria
                    x++;

                    //split bacteria
                    if (Map.get(y).get(x + 1).equals("*")) {
                        SplitBacteria(Map, y, x, BacteriaCreator.b);
                        Map.get(y).set(x, "0");
                    }

                    //vertical movement


                }
                if (Map.get(y).get(x).equals(String.valueOf(BacteriaCreator.b)) & (x + 1 < Map.get(0).size())) {


                    if (Map.get(y).get(x + 1).equals("*")) {


                        //growing bacteria
                        GrowBacteria(Map, y, x + 1, BacteriaCreator.B);
                        Map.get(y).set(x, "0");

                        //increase the value of row to stop moving this bacteria
                        x += 3;
                    } else {

                        //move small bacteria by 1 square
                        //          Map.get(y).set(x + 1, String.valueOf(BacteriaCreator.a));
                        GeneralizedMovement(Map, y, x, BacteriaCreator.b);
                        //delete bacteria from previous position
                        //       Map.get(y).set(x, "0");

                        //increase the value of row to stop moving this bacteria
                        x++;

                        //vertical movement

                    }
                }

            }

        return Map;
    }

    @Override
    protected List<List<String>> GeneralizedMovement(List<List<String>> Map, int PositionY, int PositionX, BacteriaCreator BacteriaType) {

        int min = 0;
        int max = 0;


        switch (BacteriaType) {

            case b:
                min = -1;
                max = 1;
                break;
            case B:
                min = -2;
                max = 2;
                break;
            default:
                break;
        }

        Random randomY = new Random();
        Random randomX = new Random();

        int y = randomY.nextInt(max - min + 1) + min;
        int x = randomX.nextInt(max - min + 1) + min;

        if (IsOutOfBorder(Map, PositionY + y, PositionX + x)) {

            Map.get(PositionY + y).set(PositionX + x, String.valueOf(BacteriaType));

            if (x != 0 | y != 0)
                Map.get(PositionY).set(PositionX, "0");
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
