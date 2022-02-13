package MediaInheritance;

import java.util.Calendar;

public abstract class Media {
    final int id;
    private String title;
    private int yearPublished;
    private int currentYear;

    public Media(int id, String title, int yearPublished) {
        this.id = id;
        this.title = title;
        this.yearPublished = yearPublished;
        this.currentYear = Calendar.getInstance().get(Calendar.YEAR);
    }

    public abstract double calcRentalFee();

    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getYearPublished() {
        return yearPublished;
    }

    public void setYearPublished(int yearPublished) {
        this.yearPublished = yearPublished;
    }

    public int getCurrentYear() {
        return currentYear;
    }
}
