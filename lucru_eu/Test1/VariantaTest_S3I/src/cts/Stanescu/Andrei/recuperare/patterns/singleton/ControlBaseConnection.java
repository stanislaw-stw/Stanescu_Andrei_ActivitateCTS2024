package cts.Stanescu.Andrei.recuperare.patterns.singleton;

public class ControlBaseConnection implements ServiceConnection {
    private static ControlBaseConnection instance;

    private ControlBaseConnection() {

    }

    public static synchronized ControlBaseConnection getInstance() {
        if (instance == null) {
            instance = new ControlBaseConnection();
        }
        return instance;
    }

    @Override
    public void connect() {
        System.out.println("Connecting to the Control Base...");
    }
}
