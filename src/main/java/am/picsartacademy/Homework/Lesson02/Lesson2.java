package am.picsartacademy.Homework.Lesson02;

public class Lesson2 {
    public static void main(String[] args) {
        int erkir = 73;
        switch (erkir) {
            case 91:
                System.out.println("hayastan");
                break;
            case 132:
                System.out.println("america");
                break;
            case 73:
                System.out.println("france");
                break;
            case 4:
                System.out.println("california");
                break;
            default:
                System.out.println("mec e");


        }


        int[] mikin = {7, 4, 5, 5, 7, 2, -1, 55, 76, 88, 4};
        for (int i = 0; i < mikin.length; i++) {
            if (mikin[i] < 10) {
                System.out.println(mikin[i]);
            }
        }

        int[] anna = {99, 7, -3, +6, 32, 65, 82, 61, 80, 1};
        for (int j = 0; j < anna.length; j++) {
            System.out.println(anna[j]);
        }
        for (int j = 2; j < 21; j = j + 2) ;
        System.out.println();


        int gumar = 1;

        switch (gumar) {
            case 1:
                System.out.println("Anna  170.000");
                break;
            case 2:
                System.out.println("Davit myLove  988.0000");
                break;
            case 3:
                System.out.println("Miki  120.000");
                break;
            case 4:
                System.out.println("Armine  75.000");
                break;
            default:
                System.out.println("Ete gumar chen stanum");
        }

    }
}
