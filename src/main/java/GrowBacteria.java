import java.util.List;

/**
 * The interface Grow bacteria.
 */
public interface GrowBacteria {


    /**
     * Grow bacteria.
     *
     * @param Map          the map
     * @param positionY    the position y
     * @param positionX    the position x
     * @param BacteriaType the bacteria type
     */
    default void GrowBacteria(List<List<String>> Map, int positionY, int positionX, BacteriaType BacteriaType) {

        /*
    Method to "grow bacteria" transforms small bacteria to adult bacteria,
    after crossing "*" - biomass.
    E.g [0,a,*] -> [0,0,a] -> [0,0,A]
    or faster [0,a,*] -> [0,0,A]
     */

        //transform small bacteria to adult bacteria
        Map.get(positionY).set(positionX, String.valueOf(BacteriaType));


    }
}
