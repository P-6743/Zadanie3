public class Uzytkownik {
    private String imie;
    private String nazwisko;
    private int pesel;
    private int wiek;
    private int telefon;
    private String email;

    public Uzytkownik(String imie, String nazwisko, int pesel, int wiek, int telefon, String email) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.pesel = pesel;
        this.wiek = wiek;
        this.telefon = telefon;
        this.email = email;
    }
    public String getImie(){
        return imie;
    }
    public String getNazwisko(){
        return nazwisko;
    }
    public int getPesel(){
        return pesel;
    }
    public int getWiek(){
        return wiek;
    }
    private int getTelefon(){
        return telefon;
    }
    private String getEmail(){
        return email;
    }

}
