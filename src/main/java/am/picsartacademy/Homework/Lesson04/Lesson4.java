package am.picsartacademy.Homework.Lesson04;

public class Lesson4 {
    public static void main(String[] args) {
        System.out.println("hhhhhhh\n");
        System.out.println(" ammmmmm ");

        byte an = 15;
        System.out.println("an");

        byte amka = 20;
        System.out.println(amka);

        short miu = 342;
        System.out.println("miu");
        short miu2 = -342;
        System.out.println(miu2);

        int viu = 8983;
        System.out.println("viu");

        long mam = 88877882929l;
        System.out.println(mam);
        System.out.println("mam");

        byte sou = 100;
        long min = 2000000l;
        short tat = 999;
        System.out.println(min);

        double sas = 31.1;
        System.out.println(sas);
        boolean vik = true;
        vik = false;
        System.out.println(vik);

        char o = 't';
        System.out.println(o);
        String ss = ("stringy parz tip chee ayn misht linum e mecatarob");
        System.out.println("ss");

        String firsName = "anna";
        String lastName = "khachatryan";
        System.out.println(firsName + " " + lastName);

        int a = 3;
        int b = 7;
        int c = a + b;
        System.out.println(c);
        System.out.println(a * c);

        int d = 3;
        int y = 5;
        System.out.println(d / y);
        System.out.println(d % y);

        int x = 5;
        x = 5;
        x++;
        System.out.println(x);
        x = 5;
        x--;
        System.out.println(x);
        System.out.println(++x);
        x = 3;
        a = 1;
        c = x++ - y--;
        System.out.println(c);
        boolean bb = x == 9;
        System.out.println(x);

        System.out.println(x >= 1 && x <= 2);

//        int da = 2;
//
//        if (da > 3) {
//            System.out.println("hamapatasxanum e");
//        } else {
//            System.out.println("chi hamapatasxanum");
//        }
        System.out.println("++++++++++++++++++++++++++++");
        boolean A = x >= 1 && x <= 2;
        boolean B = x >= 1 || x <= 2;
        System.out.println(B);

        int xx = 20;
        xx += 3;
        System.out.println(xx);
        xx -= 5;
        System.out.println(xx);
        xx *= 2;
        System.out.println(xx);
        xx /= 6;
        System.out.println(xx);
        xx %= 4;
        System.out.println(xx);

        int age = 17;
        if (age > 18) {
            System.out.println("Du arden chapahas es");
        } else {
            System.out.println(" Du chapahas ches");
        }
        int[] wb = new int[5];
        System.out.println(wb[0]);
        wb[0] = 3;
        wb[1] = 7;
        wb[2] = 3;
        wb[3] = 7;
        wb[4] = -10;
        System.out.println(wb[0] + wb[2]);
        System.out.println(wb.length);
        System.out.println(wb[0] + wb.length - 1);

        int[] array = {2, 3, 8, 1, 99, 33, 77, 66,};
        System.out.println(array[2]);


        String miki = (" anna du hrashq es");
        {
            System.out.println(miki);
        }
        String sirvacuteliq = ("Chipser");
        String sirvacxmich = ("bnakan qamac soker");
        double imhasak = Double.parseDouble("1.70");
        boolean sirumemqnel = true;
        System.out.println("Im sireli uteliq" + " - " + sirvacuteliq);
        System.out.println("Im sireli xmichq" + " - " + sirvacxmich);
        System.out.println("Im hasakn e " + " - " + imhasak);
        System.out.println("Es shat em sirum qnel" + " - " + sirumemqnel);

        String anun = ("Anna");
        String npatak = ("Hasnel im erazanqnerin");
        System.out.println(anun + "  khasni ir erazanqin - " + npatak);

        System.out.println("Es kuzem Daviti gaxtniqy lini ayn inchin sps");
        System.out.println("Isk inch gaxtniq unes du");


        String imsirelierg = ("Lana D.r");
        String barernen = ("Shoxa dimonde");
        System.out.println(imsirelierg + "  " + barernen);


        String erg = ("mot");
        String barer = ("Avgust ety ti");
        System.out.println(erg + " " + barer);


        String ergg = (" KapkAN");
        String ergich = ("Mot");
        System.out.println(ergg + " " + ergich);


        String anna = ("Anna");
        String davit = ("Davuk");
        boolean lavnem = true;

        System.out.println(anna + " " + davit + " " + lavnem);
        int e = 10;
        int aa = 5;
        if (aa >= 5 || e >= a && a % 2 != 0) {
            System.out.println("Gnanq qaylenq ");
        } else
            System.out.println("andzrev e");
    }
}
