package p16_05_2022;

public class MetodeUvod {

//    public static void main(String[] args) {
//        int a = 10;
//        int b = 11;
//        int x = suma(a, b);
//        System.out.println("Suma a i b je " + x);
//    }
////  void => ne vracamo nista
////  int, String, double, float, boolean, ... ArrayList<Integer>
//    static int suma(int a, int b) {
//        int s = a + b;
//        return s;
//    }

//    public static void main(String[] args) {
//        int a = apsolutnaVrednost(10);
//        System.out.println("Aps je " + a);
//    }
//
//    static int apsolutnaVrednost(int broj) {
//        if (broj < 0) {
//            return broj * -1;
//        } else {
//            return broj;
//        }
//    }

//    public static void main(String[] args) {
//        String pIme = spojiImeIPrezime("Milan", "Jovanovic");
//        System.out.println(pIme);
//    }
//
//    static String spojiImeIPrezime(String ime, String prezime) {
//        String punoIme = ime + " " + prezime;
//        return punoIme;
//    }

    public static void main(String[] args) {
        boolean x = daLiSuBrojeviJednaki(10, 11);
        System.out.println(x);
    }


    static boolean daLiSuBrojeviJednaki(int a, int b) {
        if (a == b) {
            return true;
        } else {
            return false;
        }
    }




}
