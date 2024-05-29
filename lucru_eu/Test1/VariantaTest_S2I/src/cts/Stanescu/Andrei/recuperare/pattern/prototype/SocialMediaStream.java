package cts.Stanescu.Andrei.recuperare.pattern.prototype;

public class SocialMediaStream extends LiveStream {
    private String platformName;

    public SocialMediaStream(String platformName) {
        this.platformName = platformName;
    }


    @Override
    public Live clone() {
        SocialMediaStream clone = new SocialMediaStream(this.platformName);
        return clone;
    }

    public String getPlatformName() {
        return platformName;
    }
}
