package am.picsartacademy.Homework.Lesson05;
import am.picsartacademy.Homework.Lesson05.model.*;


public class Main {
    public static void main(String[] args) {
        ElBook myBook = new ElBook(
                //Stexcel em El girq nshel em anun,format,chaps
                "Java-i himnakan", "HexBook", 2020,
                "Anna", 19, "PDF", 3.5);

        Gradaran gradaran = new Gradaran();// Stexceci new gradaran
        gradaran.girq = myBook; // gradaranin poxanceci girq
        //gradarani girqy Books tipsa bayc es dran talis em ElBook tip,
        // u erb ashxatacnem kashxati Elbook i metody sa im POLIMORFIZMN E;
        gradaran.yndunel();     //Yndunum e girqy
        myBook.download();

    }

    public void download() {
        System.out.println("Downloading default format...");
    }

    public void download(String format) {
        System.out.println("Downloading in format: " + format);


    }
}