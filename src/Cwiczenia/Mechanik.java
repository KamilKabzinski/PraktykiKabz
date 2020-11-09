package Cwiczenia;

public class Mechanik extends Człowiek {
    int doswiadczenie_zawodowe; //w latach;
    boolean jest_do_dyspozycji;
    String imie;
    String nazwisko;

    public Mechanik(double wzrost, char plec, double rozmiar_buta, boolean czy_lysy, String color_wlosow, int wiek, Człowiek[] rodzice, int doswiadczenie_zawodowe, boolean jest_do_dyspozycji, String imie, String nazwisko) {
        super( wzrost, plec, rozmiar_buta, czy_lysy, color_wlosow, wiek, rodzice);
        this.doswiadczenie_zawodowe = doswiadczenie_zawodowe;
        this.jest_do_dyspozycji = jest_do_dyspozycji;
        this.imie = imie;
        this.nazwisko = nazwisko;
    }
}