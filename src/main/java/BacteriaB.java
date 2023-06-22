
import java.util.List;

/**
 * The type Bacteria b.
 */
public class BacteriaB extends BacteriaMovement {

    /**
     * Move bacteria b.
     *
     * @param Map the map
     */
    public void moveBacteriaB(List<List<String>> Map) {
        //Method to activate bacteria type B movement
        moveBacteria(Map, BacteriaType.B, BacteriaType.b);
    }
}
