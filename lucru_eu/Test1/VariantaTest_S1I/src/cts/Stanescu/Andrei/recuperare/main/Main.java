package cts.Stanescu.Andrei.recuperare.main;

import cts.Stanescu.Andrei.recuperare.pattern.builder.HolidayPackage;
import cts.Stanescu.Andrei.recuperare.pattern.builder.HolidayPackageBuilder;
import cts.Stanescu.Andrei.recuperare.pattern.singleton.TourismLicense;


public class Main {
    public static void main(String[] args) {
        TourismLicense license1 = TourismLicense.getInstance();
        license1.setLicenseNumber("Lic123");

        TourismLicense license2 = TourismLicense.getInstance();

        final TourismLicense[] licenseHolder = new TourismLicense[1];



        Thread thread = new Thread(() -> {
            licenseHolder[0] = TourismLicense.getInstance();
        });
        thread.start();



        try {
            thread.join();

        } catch (InterruptedException e) {
            e.printStackTrace();
        }


        TourismLicense license3 = licenseHolder[0];




        System.out.println(license1 == license2);
        System.out.println(license1 == license3);

        System.out.println(license1);
        System.out.println(license2);
        System.out.println(license3);

        System.out.println("---------------");


        HolidayPackage onlyAccommodation = new HolidayPackageBuilder()
                .setDuration(7)
                .setRoomType("Double")
                .setHotelStars(4)
                .build();

        HolidayPackage transportAndAccommodation = new HolidayPackageBuilder()
                .setTransportType("Plane")
                .setDuration(7)
                .setRoomType("Suite")
                .setHotelStars(5)
                .setGroupExcursions(true)
                .build();

        HolidayPackage fullPackage = new HolidayPackageBuilder()
                .setTransportType("Bus")
                .setDuration(10)
                .setRoomType("Single")
                .setHotelStars(3)
                .setGroupExcursions(true)
                .setMuseumVisits(true)
                .build();

        System.out.println(onlyAccommodation);
        System.out.println(transportAndAccommodation);
        System.out.println(fullPackage);
        System.out.println("---------------------------");

        printHolidayPackageDetails(onlyAccommodation);
        printHolidayPackageDetails(transportAndAccommodation);
        printHolidayPackageDetails(fullPackage);
    }

    private static void printHolidayPackageDetails(HolidayPackage holidayPackage) {
        System.out.println("Holiday Package Details:");
        System.out.println("Transport Type: " + holidayPackage.getTransportType());
        System.out.println("Duration: " + holidayPackage.getDuration());
        System.out.println("Room Type: " + holidayPackage.getRoomType());
        System.out.println("Hotel Stars: " + holidayPackage.getHotelStars());
        System.out.println("Group Excursions: " + holidayPackage.isGroupExcursionsIncluded());
        System.out.println("Museum Visits: " + holidayPackage.isMuseumVisitsIncluded());
        System.out.println("------------------");
    }
}