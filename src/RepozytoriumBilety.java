import java.time.LocalDate;
import java.util.LinkedList;
import java.util.List;

public class RepozytoriumBilety {

    private List<Bilet> lista = new LinkedList<>();

    public RepozytoriumBilety() {
        lista.add(new Bilet("Warszawa", "Oslo", 150, LocalDate.now()));
        lista.add(new Bilet("Warszawa", "Krakow", 40, LocalDate.now()));
        lista.add(new Bilet("Warszawa", "Madryt", 120, LocalDate.now()));
        lista.add(new Bilet("Warszawa", "Moskwa", 200, LocalDate.now()));
        lista.add(new Bilet("Warszawa", "Paryz", 110, LocalDate.now()));
        lista.add(new Bilet("Warszawa", "Wroclaw", 50, LocalDate.now()));
        lista.add(new Bilet("Warszawa", "Gdansk", 50, LocalDate.now()));
        lista.add(new Bilet("Warszawa", "Kijow", 70, LocalDate.now()));
        lista.add(new Bilet("Warszawa", "Radom", 20, LocalDate.now()));
        lista.add(new Bilet("Warszawa", "Berlin", 80, LocalDate.now()));
    }

    private List<Bilet> wszystkieNiezarezerwowaneBilety() {


        List<Bilet> nieZarezerwowaneBilety = new LinkedList<>();
        for (int x = 0; x < lista.size(); x++) {
            Bilet bilet = lista.get(x++);
            if (bilet.isNieZarezerwowany()) {
                nieZarezerwowaneBilety.add(bilet);
            }
                            else {
                    continue;
                }

                return nieZarezerwowaneBilety;
            }
    return wszystkieNiezarezerwowaneBilety();
    }
}