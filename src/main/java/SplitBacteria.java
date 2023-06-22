import java.util.List;

/**
 * The interface Split bacteria.
 */
public interface SplitBacteria {


    /**
     * Split bacteria.
     *
     * @param Map           the map
     * @param y             the y
     * @param x             the x
     * @param smallBacteria the small bacteria
     */
    default void SplitBacteria(List<List<String>> Map, int y, int x, BacteriaType smallBacteria) {

            /*
    Method to split adult bacteria into two single bacteria of a given type.
    Bacteria are positioned as close as possible to parent bacteria (in a radius of 1 position from parent bacteria)

    example:
    [*, 0, 0, 0, 0]               [*, 0, 0, 0, 0]           [*, 0, a, 0, 0]
    [0, 0, A, *, *]     --->      [0, 0, a, a, *]   or      [b, 0, 0, a, *]    etc.
    [0, B, 0, 0, 0]               [0, B, 0, 0, 0]           [0, B, 0, 0, 0]
     */

        if (x + 1 <= Map.get(0).size() && Map.get(y).get(x + 1).equals("*")) {
            Map.get(y).set(x, String.valueOf(smallBacteria));
            Map.get(y).set(x + 1, String.valueOf(smallBacteria));

        } else if (x > 0 && Map.get(y).get(x - 1).equals("*")) {
            Map.get(y).set(x, String.valueOf(smallBacteria));
            Map.get(y).set(x - 1, String.valueOf(smallBacteria));

        } else if (y + 1 <= Map.size() && Map.get(y + 1).get(x).equals("*")) {
            Map.get(y).set(x, String.valueOf(smallBacteria));
            Map.get(y + 1).set(x, String.valueOf(smallBacteria));

        } else if (y > 0 && Map.get(y - 1).get(x).equals("*")) {
            Map.get(y).set(x, String.valueOf(smallBacteria));
            Map.get(y - 1).set(x, String.valueOf(smallBacteria));

        } else if (x + 1 <= Map.get(0).size() && y + 1 <= Map.size() && Map.get(y + 1).get(x + 1).equals("*")) {
            Map.get(y).set(x, String.valueOf(smallBacteria));
            Map.get(y + 1).set(x + 1, String.valueOf(smallBacteria));

        } else if (x > 0 && y + 1 <= Map.size() && Map.get(y + 1).get(x - 1).equals("*")) {
            Map.get(y).set(x, String.valueOf(smallBacteria));
            Map.get(y + 1).set(x - 1, String.valueOf(smallBacteria));

        } else if (x + 1 <= Map.get(0).size() && y > 0 && Map.get(y - 1).get(x + 1).equals("*")) {
            Map.get(y).set(x, String.valueOf(smallBacteria));
            Map.get(y - 1).set(x + 1, String.valueOf(smallBacteria));

        } else if (x > 0 && y > 0 && Map.get(y - 1).get(x - 1).equals("*")) {
            Map.get(y).set(x, String.valueOf(smallBacteria));
            Map.get(y - 1).set(x - 1, String.valueOf(smallBacteria));
        }
    }


}
