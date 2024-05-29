package cts.Stanescu.Andrei.recuperare.pattern.prototype;

import java.util.ArrayList;
import java.util.List;

public class LiveStream implements Live {
    private List<String> comments;

    public LiveStream() {
        this.comments = new ArrayList<>();
    }

    @Override
    public Live clone() {
        LiveStream clone = new LiveStream();

        return clone;
    }


    @Override
    public void addComment(String comment) {
        comments.add(comment);
    }


    @Override
    public void displayComments() {
        for (String comment : comments) {
            System.out.println(comment);
        }
    }
}
