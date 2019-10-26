public class Samolot {
    private String nazwaSamolotu;
    private int miejscaEco;
    private int miejscaPrem;

    public Samolot(String nazwaSamolotu, int miejscaEco, int miejscaPrem) {
        this.nazwaSamolotu = nazwaSamolotu;
        this.miejscaEco = miejscaEco;
        this.miejscaPrem = miejscaPrem;
    }

    public void setNazwaSamolotu(String nazwaSamolotu) {
        this.nazwaSamolotu = nazwaSamolotu;
    }

    public void setMiejscaEco(int miejscaEco) {
        this.miejscaEco = miejscaEco;
    }

    public void setMiejscaPrem(int miejscaPrem) {
        this.miejscaPrem = miejscaPrem;
    }
}
