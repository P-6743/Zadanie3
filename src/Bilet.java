import java.time.LocalDate;

public class Bilet {

    private String lotniskoPoczatkowe;
    private String kierunekLotu;
    private int cenaBiletu;
    private String imie;
    private String nazwisko;
    private LocalDate godzinaOdlotu;
    private boolean zarezerwowany;

    public Bilet(String lotniskoPoczatkowe, String kierunekLotu, int cenaBiletu, LocalDate godzinaOdlotu) {
        this.lotniskoPoczatkowe = lotniskoPoczatkowe;
        this.kierunekLotu = kierunekLotu;
        this.cenaBiletu = cenaBiletu;
        this.godzinaOdlotu = godzinaOdlotu;
        this.zarezerwowany = false;
    }

    public void setLotniskoPoczatkowe(String lotniskoPoczatkowe) {
        this.lotniskoPoczatkowe = lotniskoPoczatkowe;
    }

    public void setKierunekLotu(String kierunekLotu) {
        this.kierunekLotu = kierunekLotu;
    }

    public void setCenaBiletu(int cenaBiletu) {
        this.cenaBiletu = cenaBiletu;
    }

    public void setGodzinaOdlotu(LocalDate godzinaOdlotu) {
        this.godzinaOdlotu = godzinaOdlotu;
    }

    public void kupBilet(String imie, String nazwisko) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        boolean zarezerwowany = true;
    }

    public boolean isNieZarezerwowany(){
        return !this.zarezerwowany;
    }
}
