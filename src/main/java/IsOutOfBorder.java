import java.util.List;

public interface IsOutOfBorder extends CheckIfAdult {

    //methods

    /*
    function to check whether Bacteria's going to cross border of map in next move, if:

    1) yes -> function returns true
    1) no -> function returns false
     */

    default boolean IsOutOfBorder(List<List<String>> Map, BacteriaCreator BacteriaType, int positionX, int positionY) {

        String Small = String.valueOf(BacteriaType).toLowerCase();
        String Adult = String.valueOf(BacteriaType).toLowerCase();

        //check if bacteria is adult or small
        if (CheckIfAdult(Map, BacteriaType, positionY, positionX)) {

            //check next move of bacteria - adult
            if (positionX + 2 < Map.get(0).size()) {
                return true;
            }


        } else if (Map.get(positionY).get(positionX).equals(Small)) {

            //check next move of bacteria - small
            if (positionX + 1 < Map.get(0).size()) {
                return true;
            }

        }

        return false;
    }

}
