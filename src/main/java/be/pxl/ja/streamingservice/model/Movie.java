package be.pxl.ja.streamingservice.model;

import java.time.LocalDate;


public class Movie extends Content implements Playable {
    public static final int LONG_PLAYING_TIME = 2 * 60 + 15;
    private String director;
    private LocalDate releaseDate;
    private Genre genre;
    private int duration;


    public Movie(String title, Rating maturityRating) {
        super(title, maturityRating);
    }


    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public LocalDate getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(LocalDate releaseDate) {
        this.releaseDate = releaseDate;
    }

    public boolean isLongPlayingTime() {
        return duration >= LONG_PLAYING_TIME;
    }

    public int getDuration() {
        return duration;
    }

    @Override
    public void play() {
        System.out.println("Playing " + this);
    }

    @Override
    public void pause() {
        System.out.println("Pausing " + this);
    }

    public void setDuration(int duration) {
        if (duration < 0) {
            this.duration = -duration;
        } else {
            this.duration = duration;
        }
    }

    public String getPlayingTime() {
        if (duration == 0) {
            return "?";
        } else if (duration % 60 == 0) {
            return duration / 60 + " h";
        } else if (duration < 60) {
            return duration + " min";
        } else {
            return duration / 60 + " h " + duration % 60 + " min";
        }

    }


    public Genre getGenre() {
        return genre;
    }

    public void setGenre(Genre genre) {
        this.genre = genre;
    }

    public String toString() {
        if (!(releaseDate == null)) {
            return String.format("%s (%s)", super.toString(), getReleaseDate().getYear());
        } else {
            return super.toString();
        }
    }
}
