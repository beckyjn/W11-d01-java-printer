public class Printer {
    private int sheetsOfPaper;
    private int tonerVolume;

    public Printer(){
        this.sheetsOfPaper = 100;
        this.tonerVolume = 100;
    }

    public int getSheetsOfPaper() {
        return sheetsOfPaper;
    }

    public int getTonerVolume(){
        return tonerVolume;
    }

    public void print(int pages, int copies){
        int sheetsToPrint = pages * copies;
        if (sheetsToPrint <= sheetsOfPaper) {
            sheetsOfPaper -= sheetsToPrint;
            tonerVolume -= sheetsToPrint;
        } else {
            sheetsToPrint = 0;
            sheetsOfPaper -= sheetsToPrint;
        }
    }

    public void refillPaperTray(int sheets){
        sheetsOfPaper += sheets;
    }
}
