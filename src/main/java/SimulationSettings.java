public class SimulationSettings {

    public long SetSimulationDuration(int SimulationDurations) {
        //Method to set simulation duration

        long start = System.currentTimeMillis();
        return start + SimulationDurations * 1000L;

    }

}
