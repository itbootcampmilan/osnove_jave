package p16_05_2022;

public class Zadatak4 {
    public static void main(String[] args) {
        int x= 10;
        int y = 5;
        operacije(x, y);
        int z = 11;
        int d = 5;
        operacije(z, d);
    }
//    static void operacije(int zbir, int razliku, int kolicnik, int proizvod)
    static void operacije(int a, int b) {
        System.out.println("Zbir je " + (a + b));
        System.out.println("Razlika je " + (a - b));
        System.out.println("Kolicnik je " + (a / b));
        System.out.println("Proizvod je " + (a * b));
    }
}
