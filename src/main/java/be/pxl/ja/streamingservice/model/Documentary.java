package be.pxl.ja.streamingservice.model;

public class Documentary extends Movie {

    private String topic;

    public Documentary(String title, Rating maturityRating) {
        super(title, maturityRating);
        setGenre(Genre.DOCUMENTARY);
    }

    public String getTopic() {
        return topic;
    }

    public void setTopic(String topic) {
        this.topic = topic;
    }

    @Override
    public void play() {
        System.out.println("playing documentary " + this);
    }

    @Override
    public void pause() {
        System.out.println("playing documentary " + this);

    }
}

