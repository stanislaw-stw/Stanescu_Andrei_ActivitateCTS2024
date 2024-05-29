package cts.Stanescu.Andrei.recuperare.main;


import cts.Stanescu.Andrei.recuperare.patterns.singleton.ControlBaseConnection;
import cts.Stanescu.Andrei.recuperare.patterns.singleton.GPSConnection;
import cts.Stanescu.Andrei.recuperare.patterns.singleton.ServiceConnection;
import cts.Stanescu.Andrei.recuperare.patterns.singleton.WeatherServiceConnection;

public class Main {
    public static void main(String[] args) {
        ServiceConnection controlBase = ControlBaseConnection.getInstance();
        controlBase.connect();

        ServiceConnection weatherService = WeatherServiceConnection.getInstance();
        weatherService.connect();

        ServiceConnection gps = GPSConnection.getInstance();
        gps.connect();

        ServiceConnection anotherControlBase = ControlBaseConnection.getInstance();
        System.out.println("Same Control Base instance? " + (controlBase == anotherControlBase));

        ServiceConnection anotherWeatherService = WeatherServiceConnection.getInstance();
        System.out.println("Same Weather Service instance? " + (weatherService == anotherWeatherService));

        ServiceConnection anotherGPS = GPSConnection.getInstance();
        System.out.println("Same GPS instance? " + (gps == anotherGPS));
    }
}