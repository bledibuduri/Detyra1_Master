package Platforma;
import java.util.ArrayList;
import java.util.List;
// Klasa RaportiNotave
class RaportiNotave {
    private Studenti studenti;

    public RaportiNotave(Studenti studenti) {
        this.studenti = studenti;
    }

    public void gjeneroRaport() {
        System.out.println("Raporti i Notave për Studentin: " + studenti.getEmri());
    }
}

// Klasa Diskutime
class Diskutime {
    private Kursi kursi;
    private List<Postimi> postimet;

    public Diskutime(Kursi kursi) {
        this.kursi = kursi;
        this.postimet = new ArrayList<>();
    }

    public void shtoPostim(Postimi postim) {
        this.postimet.add(postim);
    }
}
