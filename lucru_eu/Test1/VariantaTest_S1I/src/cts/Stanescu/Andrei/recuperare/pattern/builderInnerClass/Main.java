package cts.Stanescu.Andrei.recuperare.pattern.builderInnerClass;

public class Main {
    public static void main(String[] args) {
        HolidayPackage holidayPackage = new HolidayPackage.Builder()
                .setTransportType("Plane")
                .setDuration(10)
                .setRoomType("Suite")
                .setHotelStars(5)
                .setGroupExcursions(true)
                .setMuseumVisits(true)
                .build();

        System.out.println(holidayPackage);
    }
}
