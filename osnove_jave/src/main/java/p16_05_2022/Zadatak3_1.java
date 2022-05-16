package p16_05_2022;

public class Zadatak3_1 {
    public static void main(String[] args) {
        int dimenzija = 6;
        int size = dimenzija * (dimenzija + 1) / 2;
        int lupiEnter = dimenzija - 1;
        int x = 0;
        for (int i = 1; i < size; i++) {

            if (i % lupiEnter == 0) {
                System.out.println();
                lupiEnter--;
            }
            star();
        }
    }

    static void star() {
        System.out.print("* ");
    }
}
