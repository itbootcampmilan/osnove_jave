package p16_05_2022;

public class Zadatak5 {
    public static void main(String[] args) {
        apsolutnVrednost(10);
        apsolutnVrednost(-11);
    }

    static void apsolutnVrednost(int broj) {
        if (broj < 0) {
            System.out.println("Apsolutna vrednost je " + (-broj));
        } else {
            System.out.println("Apsolutna vrednost je " + broj);
        }
    }
}
