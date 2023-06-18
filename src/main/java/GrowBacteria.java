import java.util.List;

public interface GrowBacteria {


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
