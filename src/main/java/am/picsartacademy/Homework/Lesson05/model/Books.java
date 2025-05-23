package am.picsartacademy.Homework.Lesson05.model;
import am.picsartacademy.Homework.Lesson05.*;


public class Books extends Mard implements Printable {
    public String vernagir;
    public String hexanun;
    public int year;

    public Books(String vernagir, String hexanun, int year, String anun, int tariq) {
        super(anun, tariq);
        this.vernagir = vernagir;
        this.hexanun = hexanun;
        this.year = year;
    }

    public void infoprint() {
        System.out.println("Girq: " + vernagir + " " + hexanun + " " + year);
    }

    public void infoprint(String prefix) {
        System.out.println(prefix + ": " + vernagir + " " + hexanun + " " + year);
    }

    public String getVernagir() {
        return vernagir;
    }

    public void setVernagir(String vernagir) {
        this.vernagir = vernagir;
    }

    public String getHexanun() {
        return hexanun;
    }

    public void setHexanun(String hexanun) {
        this.hexanun = hexanun;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public void printInfo() { // Override em arel printInf metody qani vor interfeysi payman e
        System.out.println("Girq " + hexanun + ", Taretiv " + year);
    }
}
