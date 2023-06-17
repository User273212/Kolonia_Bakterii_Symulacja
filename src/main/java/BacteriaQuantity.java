import java.util.Collections;
import java.util.List;

public interface BacteriaQuantity {

    //methods

    /*
    Method to count occurrences of bacteria type
     */
    default int BacteriaQuantity(List<List<String>> Map, BacteriaCreator BacteriaType) {

        int BacteriaOccurrences = 0;
        for (int row = 0; row < Map.size(); row++)
            //count occurrences of bacteria type
            BacteriaOccurrences += Collections.frequency(Map.get(row), String.valueOf(BacteriaType));
        return BacteriaOccurrences;
    }
}
