package Platforma;
import java.util.ArrayList;
import java.util.List;

// Klasa për instruktorët
class Instruktori extends Perdoruesi {
    private List<Kursi> kurset;

    public Instruktori(String id, String emri, String email) {
        super(id, emri, email);
        this.kurset = new ArrayList<>();
    }

    public void krijoKurs(Kursi kursi) {
        kurset.add(kursi);
        System.out.println("Kursi '" + kursi.getTitulli() + "' u krijua.");
    }

    public void caktoDetyre(Kursi kursi, Detyra detyre) {
        kursi.shtoDetyre(detyre);
        System.out.println("Detyra' " + detyre.getTitulli() + "' u caktua.");
    }
}