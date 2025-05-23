package am.picsartacademy.Homework.Lesson03;

public class Lesson3 {
    public static void main(String[] args) {
        int[] array = new int[2];
        array[0] = 1;
        array[1] = 3;

        System.out.println(array[1]);
        System.out.println("______________________________");
        int[] texanoc = new int[1000];

        for (int i = 0; i < texanoc.length; i++) {
            texanoc[i] = i + 1;
            texanoc[i] = i;
            System.out.println("hasceners en - " + i + " arjeqners en - " + texanoc[i]);
        }
        int hashvich = 0;
        for (int i = -20; i <= 20; i++) {
            if (i % 2 != 0) {
                hashvich++;
                System.out.print(i + " ");
            }
        }
        System.out.println();
        System.out.println("mer zuyqeri qanaky - " + hashvich + " hat e");
    }
}
