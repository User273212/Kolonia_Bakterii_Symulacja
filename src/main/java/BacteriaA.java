import java.util.List;

public class BacteriaA extends BacteriaMovement {

    public void moveBacteriaA(List<List<String>> Map) {
        //Method to activate bacteria type A movement
        moveBacteria(Map, BacteriaType.A, BacteriaType.a);
    }
}
