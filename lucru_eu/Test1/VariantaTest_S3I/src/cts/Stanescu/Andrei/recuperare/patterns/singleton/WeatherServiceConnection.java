package cts.Stanescu.Andrei.recuperare.patterns.singleton;

public class WeatherServiceConnection implements ServiceConnection {
    private static WeatherServiceConnection instance;

    private WeatherServiceConnection() {

    }

    public static synchronized WeatherServiceConnection getInstance() {
        if (instance == null) {
            instance = new WeatherServiceConnection();
        }
        return instance;
    }

    @Override
    public void connect() {
        System.out.println("Connecting to the Weather Service...");
    }
}
