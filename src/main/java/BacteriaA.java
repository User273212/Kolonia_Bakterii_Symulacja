import java.util.List;

/**
 * The type Bacteria a.
 */
public class BacteriaA extends BacteriaMovement {

    /**
     * Move bacteria a.
     *
     * @param Map the map
     */
    public void moveBacteriaA(List<List<String>> Map) {
        //Method to activate bacteria type A movement
        moveBacteria(Map, BacteriaType.A, BacteriaType.a);
    }
}
