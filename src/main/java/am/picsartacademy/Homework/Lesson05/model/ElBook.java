package am.picsartacademy.Homework.Lesson05.model;

public class ElBook extends Books {
    private String format;
    private double chaps;

    public ElBook(String vernagir, String hexanun, int year, String anun, int tariq, String format, double chaps) {
        super(vernagir, hexanun, year, anun, tariq);
        this.format = format;
        this.chaps = chaps;

    }

    @Override
    public void infoprint() {
        super.infoprint(); // kanchum em cnoxi metody
        System.out.println("EBook chapters: " + chaps + ", format: " + format); //  avelacrel em format ev chaps
    }

    public void download() {
        System.out.println("Girqy Arka En Gradaranum");
    }

    // Method overloading
    public void download(String filetype) {
        System.out.println("Downloading eBook as " + filetype);
    }

}