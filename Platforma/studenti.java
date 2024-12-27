package Platforma;
import java.util.ArrayList;
import java.util.List;
// Klasa Studenti
class Studenti extends Perdorues {
    private List<Kursi> kursetRegjistruara;
    private List<Detyra> detyrat;

    public Studenti(String id, String emri, String email) {
        super(id, emri, email);
        this.kursetRegjistruara = new ArrayList<>();
        this.detyrat = new ArrayList<>();
    }

    public void regjistrohuNeKurs(Kursi kursi) {
        }

    public void dorzoDetyra(Detyra detyra) {
        detyrat.add(detyra);
    }

    @Override
    public void shikoProfilin() {
        System.out.println("Profili i Studentit: " + getEmri());
        System.out.println("Kurset e regjistruara: " + kursetRegjistruara.size());
    }
}