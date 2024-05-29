package cts.Stanescu.Andrei.recuperare.pattern.singleton;




public class TourismLicense implements AbstractTourismLicense {


    private static TourismLicense instance;
    private String licenseNumber;
    private boolean isLicenseNumberSet = false;


    private TourismLicense() {

    }

    public static synchronized TourismLicense getInstance() {
        if (instance == null) {
            instance = new TourismLicense();
        }
        return instance;
    }

    @Override
    public void setLicenseNumber(String licenseNumber) {
        if (!isLicenseNumberSet) {
            this.licenseNumber = licenseNumber;
            isLicenseNumberSet = true;
        } else {
            throw new LicenseModificationException("License number can only be set once.");
        }
    }

    public String getLicenseNumber() {
        return licenseNumber;
    }

    @Override
    public String toString() {
        return "TourismLicense{" +
                "licenseNumber='" + licenseNumber + '\'' +
                ", isLicenseNumberSet=" + isLicenseNumberSet +
                '}';
    }


}

