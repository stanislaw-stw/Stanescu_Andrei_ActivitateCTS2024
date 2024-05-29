package cts.Stanescu.Andrei.recuperare.patterns.singleton;

public class GPSConnection implements ServiceConnection {
    private static GPSConnection instance;

    private GPSConnection() {

    }

    public static synchronized GPSConnection getInstance() {
        if (instance == null) {
            instance = new GPSConnection();
        }
        return instance;
    }

    @Override
    public void connect() {
        System.out.println("Connecting to the GPS Satellite...");
    }
}
