package CoveredInbox;

public class CoveredInbox {
    private boolean isOpened;
    private int numOfLetters;

    public CoveredInbox() {
        this.isOpened = false;
        this.numOfLetters = 0;
    }

    public int getNumOfLetters() {
        return numOfLetters;
    }

    public boolean isOpened() {
        return isOpened;
    }

    public void openInbox() {
        this.isOpened = true;
    }

    public void closeInbox() {
        this.isOpened = false;
    }

    public void addLetter() {
        this.numOfLetters++;
    }

    public void removeLetter() {
        this.numOfLetters--;
    }
}
