package cts.Stanescu.Andrei.recuperare.pattern.builderInnerClass;

public class HolidayPackage {

    private final String transportType;
    private final int duration;
    private final String roomType;
    private final int hotelStars;
    private final boolean groupExcursions;
    private final boolean museumVisits;

    private HolidayPackage(Builder builder) {
        this.transportType = builder.transportType;
        this.duration = builder.duration;
        this.roomType = builder.roomType;
        this.hotelStars = builder.hotelStars;
        this.groupExcursions = builder.groupExcursions;
        this.museumVisits = builder.museumVisits;
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



    public static class Builder {
        private String transportType = "None";
        private int duration = 0;
        private String roomType = "None";
        private int hotelStars = 0;
        private boolean groupExcursions = false;
        private boolean museumVisits = false;

        public Builder setTransportType(String transportType) {
            this.transportType = transportType;
            return this;
        }

        public Builder setDuration(int duration) {
            this.duration = duration;
            return this;
        }

        public Builder setRoomType(String roomType) {
            this.roomType = roomType;
            return this;
        }

        public Builder setHotelStars(int hotelStars) {
            this.hotelStars = hotelStars;
            return this;
        }

        public Builder setGroupExcursions(boolean groupExcursions) {
            this.groupExcursions = groupExcursions;
            return this;
        }

        public Builder setMuseumVisits(boolean museumVisits) {
            this.museumVisits = museumVisits;
            return this;
        }

        public HolidayPackage build() {
            return new HolidayPackage(this);
        }


    }

}
