package p16_05_2022;

public class Zadatak7 {
    public static void main(String[] args) {
        int p = 10;
        int x = vratiSuprotan(p);
        System.out.println("Suprotna vrednost od " + p + " je " + x) ;
    }

    static int vratiSuprotan(int n) {
        int result = n * -1;
        return result;
    }
}
