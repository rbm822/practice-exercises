package MediaInheritance;

public class MusicCD extends Media {
    private int lengthInMinutes;

    public MusicCD(int id, String title, int yearPublished, int lengthInMinutes) {
        super(id, title, yearPublished);
        this.lengthInMinutes = lengthInMinutes;
    }

    public int getLengthInMinutes() {
        return lengthInMinutes;
    }

    public void setLengthInMinutes(int lengthInMinutes) {
        this.lengthInMinutes = lengthInMinutes;
    }

    public String toString() {
        return "MusicCD " +
                "[id=" + this.getId() + ", " +
                "title=" + this.getTitle() + ", " +
                "year=" + this.getYearPublished() + ", " +
                "length=" + this.getLengthInMinutes() + "min] " +
                "Rental fee=$" + calcRentalFee();
    }

    @Override
    public double calcRentalFee() {
        double fee = this.getLengthInMinutes() * 0.02;

        if (this.getYearPublished() == this.getCurrentYear()) {
            fee += 1.0;
        }

        return fee;
    }
}
