import java.util.Collections;
import java.util.List;

/**
 * The interface Bacteria quantity.
 */
public interface BacteriaQuantity {

    /**
     * Bacteria quantity int.
     *
     * @param Map          the map
     * @param BacteriaType the bacteria type
     * @return the int
     */
    default int BacteriaQuantity(List<List<String>> Map, BacteriaType BacteriaType) {
        //Method used count bacteria quantity of specified type

        int BacteriaOccurrences = 0;
        for (int row = 0; row < Map.size(); row++)
            //count occurrences of bacteria type
            BacteriaOccurrences += Collections.frequency(Map.get(row), String.valueOf(BacteriaType));
        return BacteriaOccurrences;
    }
}
