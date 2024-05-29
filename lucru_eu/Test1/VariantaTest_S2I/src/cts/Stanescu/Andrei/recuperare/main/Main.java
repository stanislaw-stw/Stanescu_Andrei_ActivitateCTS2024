package cts.Stanescu.Andrei.recuperare.main;

import cts.Stanescu.Andrei.recuperare.pattern.prototype.Live;
import cts.Stanescu.Andrei.recuperare.pattern.prototype.SocialMediaStream;

public class Main {
    public static void main(String[] args) {

        SocialMediaStream prototype = new SocialMediaStream("Original Platform");

        Live stream1 = prototype.clone();
        Live stream2 = prototype.clone();
        Live stream3 = prototype.clone();

        stream1.addComment("Comment on stream 1");
        stream2.addComment("Comment on stream 2");
        stream3.addComment("Comment on stream 3");

        System.out.println("Stream 1 comments:");
        stream1.displayComments();

        System.out.println("Stream 2 comments:");
        stream2.displayComments();

        System.out.println("Stream 3 comments:");
        stream3.displayComments();
    }
}