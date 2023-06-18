import java.util.List;

public interface SplitBacteria {

    //methods

    /*
    Method to split adult bacteria into two single bacteria of a given type.
    Bacteria are positioned as close as possible to parent bacteria (in a radius of 1 position from parent bacteria)

    example:
    [*, 0, 0, 0, 0]               [*, 0, 0, 0, 0]           [*, 0, a, 0, 0]
    [0, 0, A, *, *]     --->      [0, 0, a, a, *]   or      [b, 0, 0, a, *]    etc.
    [0, B, 0, 0, 0]               [0, B, 0, 0, 0]           [0, B, 0, 0, 0]
     */
    default List<List<String>> SplitBacteria(List<List<String>> Map, int positionY, int positionX, BacteriaCreator BacteriaType) {

        //declaring variables
        double x = 2, y = 6, r = 1;

        //applying logic
        double X = x * x;
        double Y = y * y;
        double R = r * r;
        double point = X + Y;

        //checking the condition
        if (point < R) {

            //print if point lie inside circle
            System.out.println("Point exist in circle sector.");

            for (int row = 0; row < 4; row++)
                for (int column = 0; column < 4; column++) {
                    Map.get(positionY + row).set(positionX + column, String.valueOf(BacteriaType.a));
                    Map.get(positionY + row + 1).set(positionX + column + 1, String.valueOf(BacteriaType.a));
                }
        } else {

            //print if point does not lie inside circle
            System.out.println("Point does not exist in circle sector.");
        }
        return Map;
    }


}
