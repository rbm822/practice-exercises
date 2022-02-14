package MediaInheritance;

public class MovieDVD extends Media {
    private int size;

    public MovieDVD(int id, String title, int yearPublished, int size) {
        super(id, title, yearPublished);
        this.size = size;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    @Override
    public double calcRentalFee() {
        return 3.50;
    }

    public String toString() {
        return "MovieDVD " +
                "[id=" + this.getId() + ", " +
                "title=" + this.getTitle() + ", " +
                "year=" + this.getYearPublished() + ", " +
                "size=" + this.getSize() + "MB] " +
                "Rental fee=$" + calcRentalFee();
    }
}
