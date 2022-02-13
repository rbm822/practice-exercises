package MediaInheritance;

public class EBook extends Media {
    private int numOfChapters;

    public EBook(int id, String title, int yearPublished, int numOfChapters) {
        super(id, title, yearPublished);
        this.numOfChapters = numOfChapters;
    }

    public int getNumOfChapters() {
        return numOfChapters;
    }

    public void setNumOfChapters(int numOfChapters) {
        this.numOfChapters = numOfChapters;
    }

    public String toString() {
        return "EBook " +
                "[id=" + this.getId() + ", " +
                "title=" + this.getTitle() + ", " +
                "year=" + this.getYearPublished() + ", " +
                "chapters=" + this.getNumOfChapters() + "] " +
                "Rental fee=$" + calcRentalFee();
    }

    @Override
    public double calcRentalFee() {
        double fee = this.getNumOfChapters() * 0.10;

        if (this.getYearPublished() == this.getCurrentYear()) {
            fee += 1.0;
        }

        return fee;
    }
}
