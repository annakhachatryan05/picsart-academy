package am.picsartacademy.Homework.Lesson05.model;

public class Mard extends Gradaran {
    public String anun;
    public int tariq;
    public Mard(String anun, int tariq) {
        this.anun = anun;
        this.tariq = tariq;
    }
    public void info() {
        System.out.println("Es" + anun + " Em " + tariq + " 20 tarekan");
    }
    public void info(String txt) { System.out.println(txt + ": " + anun); }

    @Override
    public void greeting() {
        super.greeting(); // ogtagorcel em vor kanchem cnoxi Greting metody
        System.out.println("Mardic: Barev");
    }
    //  Encapsulation, pak dashteri getterner
    public String getAnun() { return anun; }
    public int getTariq() { return tariq; }
}