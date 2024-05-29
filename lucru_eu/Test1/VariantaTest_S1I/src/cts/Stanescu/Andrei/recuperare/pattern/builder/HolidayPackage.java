package cts.Stanescu.Andrei.recuperare.pattern.builder;

public class HolidayPackage {

    private final String transportType;
    private final int duration; // în nopți
    private final String roomType;
    private final int hotelStars;
    private final boolean groupExcursions;
    private final boolean museumVisits;

    private HolidayPackage(String transportType, int duration, String roomType, int hotelStars, boolean groupExcursions, boolean museumVisits) {
        this.transportType = transportType;
        this.duration = duration;
        this.roomType = roomType;
        this.hotelStars = hotelStars;
        this.groupExcursions = groupExcursions;
        this.museumVisits = museumVisits;
    }

    public static HolidayPackage createPackage(String transportType, int duration, String roomType, int hotelStars, boolean groupExcursions, boolean museumVisits) {
        return new HolidayPackage(transportType, duration, roomType, hotelStars, groupExcursions, museumVisits);
    }


    public boolean isGroupExcursions() {
        return groupExcursions;
    }

    public boolean isMuseumVisits() {
        return museumVisits;
    }

    public String getTransportType() {
        return transportType;
    }


    public int getDuration() {
        return duration;
    }


    public String getRoomType() {
        return roomType;
    }


    public int getHotelStars() {
        return hotelStars;
    }


    public boolean isGroupExcursionsIncluded() {
        return groupExcursions;
    }


    public boolean isMuseumVisitsIncluded() {
        return museumVisits;
    }

    @Override
    public String toString() {
        return "HolidayPackage{" +
                "transportType='" + transportType + '\'' +
                ", duration=" + duration +
                ", roomType='" + roomType + '\'' +
                ", hotelStars=" + hotelStars +
                ", groupExcursions=" + groupExcursions +
                ", museumVisits=" + museumVisits +
                '}';
    }
}

