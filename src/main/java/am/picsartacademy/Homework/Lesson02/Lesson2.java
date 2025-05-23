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



        int[] a = new int[10];
        a[0] = 500;
        a[1] = 6;
        a[2] = 7;
        a[3] = 8;
        a[4] = 89;
        a[5] = -10;
        a[6] = 11;
        a[7] = 12;
        a[8] = 1300;
        a[9] = 14;
        // System.out.println(a[0]);
        // System.out.println(a[0] - a[8]);
        // System.out.println(a.length);
        System.out.println(a[0] + a[a.length - 1]);

        int[] array = {4, 1, 2, -8, 5};
        System.out.println(array[1]);
        System.out.println(array[array.length - 2]);

        int x = 4;

        if (4 >= x)
            System.out.println("miki");
        else
            System.out.println("voch");

        int age = 20;
        if (age == 20)
            System.out.println("mecaxchikes");


    }
}
