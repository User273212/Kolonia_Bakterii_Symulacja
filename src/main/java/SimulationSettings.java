public class SimulationSettings {

    //fields

    private int BacteriaNumberA;
    private int BacteriaNumberB;
    private int SimulationDuration;

    //methods

    public long SetSimulationDuration(int SimulationDurations) {

        long start = System.currentTimeMillis();
        long end = start + SimulationDurations * 1000;
        return end;

    }
}
