/**
 * The type Simulation settings.
 */
public class SimulationSettings {

    /**
     * Set simulation duration long.
     *
     * @param SimulationDurations the simulation durations
     * @return the long
     */
    public long SetSimulationDuration(int SimulationDurations) {
        //Method to set simulation duration

        long start = System.currentTimeMillis();
        return start + SimulationDurations * 1000L;

    }

}
