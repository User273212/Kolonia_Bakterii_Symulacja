public class SimulationSettings {


    //methods

    public long SetSimulationDuration(int SimulationDurations) {

        long start = System.currentTimeMillis();
        long end = start + SimulationDurations * 100;
        return end;

    }

}
