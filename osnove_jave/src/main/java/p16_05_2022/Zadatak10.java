package p16_05_2022;

public class Zadatak10 {
    public static void main(String[] args) {
        double res = konvertuj(3, "USD");
        System.out.println(res);
    }

    static double konvertuj(double vrednostUEurima, String valuta) {
        if (valuta.equals("RSD")) {
            return vrednostUEurima * 117.2113;
        } else if (valuta.equals("USD")) {
            return vrednostUEurima * 1.1821;
        } else {
            return vrednostUEurima * 89.2323;
        }
    }

}
