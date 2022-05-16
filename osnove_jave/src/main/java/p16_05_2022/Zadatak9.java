package p16_05_2022;

public class Zadatak9 {
    public static void main(String[] args) {
        int a =  konvertuj("X");
        System.out.println(a);
    }

    static int konvertuj(String rimski) {
        if (rimski.equals("I")) {
            return 1;
        } else if (rimski.equals("II")) {
            return 2;
        } else if (rimski.equals("III")) {
            return 3;
        } else {
            return 0;
        }

    }

}
