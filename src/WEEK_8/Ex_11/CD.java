package WEEK_8.Ex_11;

public class CD implements ToBeStored{
    private final String artist;
    private final String title;
    private final int publishingYear;
    private final double weight;

    public CD (String artist, String title, int publishingYear){
        this.artist = artist;
        this.title = title;
        this.publishingYear = publishingYear;
        this.weight = 0.1;
    }

    @Override
    public String toString() {
        return artist+ ": " + title+ " (" + publishingYear + ")";
    }

    public double weight(){
        return this.weight;
    }
}
