package Platforma;

import java.util.ArrayList;
import java.util.List;

// Klasa për kurset
class Kursi {
    private String id;
    private String titulli;
    private Instruktori instruktori;
    private List<Studenti> studentet;
    private List<Detyra> detyrat;
    private List<String> materialet;

    public Kursi(String id, String titulli, Instruktori instruktori) {
        this.id = id;
        this.titulli = titulli;
        this.instruktori = instruktori;
        this.studentet = new ArrayList<>();
        this.detyrat = new ArrayList<>();
        this.materialet = new ArrayList<>();
    }

    public void shtoStudent(Studenti studenti) {
        studentet.add(studenti);
        System.out.println("Studenti " + studenti.getEmri() + " u shtua në kursin '" + titulli + "'.");
    }

    public void shtoDetyre(Detyra detyre) {
        detyrat.add(detyre);
    }

    public String getTitulli() {
        return this.titulli;
    }
}