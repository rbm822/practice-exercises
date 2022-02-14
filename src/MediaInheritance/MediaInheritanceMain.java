package MediaInheritance;

public class MediaInheritanceMain {
    public static void main(String[] args) {
        EBook eBook = new EBook(123, "Googly Moogly", 1982, 20);
        MusicCD musicCD = new MusicCD(123, "Love Music", 2022, 114);
        MovieDVD movieDVD = new MovieDVD(123, "TMNT", 2005, 120);

        System.out.println(eBook);
        System.out.println(musicCD);
        System.out.println(movieDVD);
    }
}
