package p13_12_2022;

public class Zadatak1 {
    public static void main(String[] args) {
//        Napisati program koji na ekranu stampa podatke u formatu:
//        [IME I PREZIME]
//        [BROJ TELEFONA], [ULICA I BROJ], [GRAD]
//        [EMAIL]
        String imeIPrezime = "Milan Jovanovic";
        String telefon = "0238932823";
//        String ulicaIBroj = ""
        String adresa = "Karadjordjeva 123";
        String grad = "Nis";
        String email = "milan@gmail.com";

        System.out.println(imeIPrezime);
        System.out.println(telefon + ", " + adresa + ", " + grad);
        System.out.println(email);

    }
}
