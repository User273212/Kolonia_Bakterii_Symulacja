import java.util.List;

public abstract class BacteriaMovement extends CheckIfAdult {

    //fields


    //methods

    protected List<List<String>> MoveBacteria() {

        GetMap get = new GetMap();
        List<List<String>> Map = get.GetMap();

        CheckIfAdult check = new CheckIfAdult();

        check.CheckIfAdult(Map);

        //  switch(Map){
        //  case :
        //  }

        return Map;
    }
}
