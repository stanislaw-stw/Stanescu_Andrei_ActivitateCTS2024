package cts.Stanescu.Andrei.recuperare.pattern.prototype2;

import java.util.ArrayList;
import java.util.List;

public class LiveStream implements Live {
    private String platform;
    private List<String> comments;

    public LiveStream(String platform) {
        this.platform = platform;
        this.comments = new ArrayList<>();
    }

    @Override
    public LiveStream clone() {
        LiveStream clone = new LiveStream(this.platform);
        for (String comment : this.comments) {
            clone.addComment(comment);
        }
        return clone;
    }

    @Override
    public void addComment(String comment) {
        comments.add(comment);
    }

    @Override
    public void displayComments() {
        System.out.println("Comments for " + platform + ":");
        for (String comment : comments) {
            System.out.println(comment);
        }
    }

    @Override
    public String toString() {
        return "LiveStream{" +
                "platform='" + platform + '\'' +
                ", comments=" + comments +
                '}';
    }

    public void setPlatform(String platform) {
        this.platform = platform;
    }

    public String getPlatform() {
        return platform;
    }
}
