package cts.Stanescu.Andrei.recuperare.pattern.prototype2;

public class Main {
    public static void main(String[] args) {
        LiveStream prototypeStream = new LiveStream("Prototype Platform");

        Live streamFacebook = prototypeStream.clone();
        streamFacebook.setPlatform("Facebook");
        streamFacebook.addComment("Comment on Facebook stream");

        Live streamYoutube = prototypeStream.clone();
        streamYoutube.setPlatform("YouTube");
        streamYoutube.addComment("Comment on YouTube stream");

        Live streamInstagram = prototypeStream.clone();
        streamInstagram.setPlatform("Instagram");
        streamInstagram.addComment("Comment on Instagram stream");

        streamFacebook.displayComments();
        streamYoutube.displayComments();
        streamInstagram.displayComments();
    }
}


