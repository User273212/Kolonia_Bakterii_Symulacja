import java.util.List;

public interface GrowBacteria {

    /*
    Method to "grow bacteria" transforms small bacteria to adult bacteria,
    after crossing "*" - biomass.
    E.g [0,a,*] -> [0,0,a] -> [0,0,A]
    or faster [0,a,*] -> [0,0,A]
     */
    default List<List<String>> GrowBacteria(List<List<String>> Map, int positionY, int positionX) {

        //transform small bacteria to adult bacteria
        Map.get(positionY).set(positionX, String.valueOf(BacteriaCreator.A));


        return Map;
    }
}
