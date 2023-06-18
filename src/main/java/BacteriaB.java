
import java.util.List;

public class BacteriaB extends BacteriaMovement {

    public void moveBacteriaB(List<List<String>> Map) {
        //Method to activate bacteria type B movement
        moveBacteria(Map, BacteriaType.B, BacteriaType.b);
    }
}
