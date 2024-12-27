import java.util.ArrayList;
import java.util.List;
// Klasa Instruktori
class Instruktori extends Perdorues {
    private List<Kursi> kursetLigjero;

    public Instruktori(String id, String emri, String email) {
        super(id, emri, email);
        this.kursetLigjero = new ArrayList<>();
    }

    public void krijoKurs(Kursi kurs) {
        this.kursetLigjero.add(kurs);
    }

    public void caktoDetyra(Detyra detyra, Kursi kurs) {
        kurs.shtoDetyre(detyra);
    }

    @Override
    public void shikoProfilin() {
        System.out.println("Profili i Instruktori: " + getEmri());
        System.out.println("Kurset e ligjëruara: " + kursetLigjero.size());
    }
}