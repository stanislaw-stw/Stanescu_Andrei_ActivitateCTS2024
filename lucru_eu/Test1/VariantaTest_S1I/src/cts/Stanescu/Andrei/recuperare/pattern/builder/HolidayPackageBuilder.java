package cts.Stanescu.Andrei.recuperare.pattern.builder;

public class HolidayPackageBuilder implements AbstractHolidayPackage {
    private String transportType = "None";
    private int duration = 0;
    private String roomType = "None";
    private int hotelStars = 0;
    private boolean groupExcursions = false;
    private boolean museumVisits = false;

    public HolidayPackageBuilder setTransportType(String transportType) {
        this.transportType = transportType;
        return this;
    }

    public HolidayPackageBuilder setDuration(int duration) {
        this.duration = duration;
        return this;
    }

    public HolidayPackageBuilder setRoomType(String roomType) {
        this.roomType = roomType;
        return this;
    }

    public HolidayPackageBuilder setHotelStars(int hotelStars) {
        this.hotelStars = hotelStars;
        return this;
    }

    public HolidayPackageBuilder setGroupExcursions(boolean groupExcursions) {
        this.groupExcursions = groupExcursions;
        return this;
    }

    public HolidayPackageBuilder setMuseumVisits(boolean museumVisits) {
        this.museumVisits = museumVisits;
        return this;
    }

    @Override
    public HolidayPackage build() {
        return HolidayPackage.createPackage(transportType, duration, roomType, hotelStars, groupExcursions, museumVisits);
    }

}
