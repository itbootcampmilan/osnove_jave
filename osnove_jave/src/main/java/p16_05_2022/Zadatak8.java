package p16_05_2022;

public class Zadatak8 {
    public static void main(String[] args) {
        boolean pravougliJe = pravougli(3,4,6);
        if (pravougliJe == true) {
            System.out.println("Jeste pravougli");
        } else {
            System.out.println("Nije pravougli");
        }
    }

    static boolean pravougli(int stranicaA, int stranicaB, int hipotenuza) {
        if (stranicaA*stranicaA + stranicaB*stranicaB == hipotenuza*hipotenuza) {
            return true;
        } else {
            return false;
        }
    }

}
