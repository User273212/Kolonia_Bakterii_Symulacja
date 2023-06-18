import java.util.List;

public interface IsOutOfBorder {


    default boolean IsOutOfBorder(List<List<String>> Map, int row, int column) {

        /*
    function to check whether Bacteria's going to cross border of map in next move, if:

    1) yes -> function returns true
    1) no -> function returns false
     */

        int ActualRow = Map.size();
        int ActualColumn = Map.get(0).size();

        //return true if bacteria is/won't be out of border
        if (row >= 0 & column >= 0)
            return row < ActualRow & column < ActualColumn;

        //return false when bacteria is/will be out of border
        return false;
    }

}
