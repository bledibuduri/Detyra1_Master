import java.util.ArrayList;
import java.util.List;
// Klasa Kursi
class Kursi {
    private String id;
    private String titulli;
    private Instruktori instruktori;
    private List<Studenti> studentët;
    private List<Detyra> detyrat;
    private List<String> materialet;

    public Kursi(String id, String titulli, Instruktori instruktori) {
        this.id = id;
        this.titulli = titulli;
        this.instruktori = instruktori;
        this.studentët = new ArrayList<>();
        this.detyrat = new ArrayList<>();
        this.materialet = new ArrayList<>();
    }

    public void shtoStudent(Studenti student) {
        this.studentët.add(student);
    }

    public void shtoDetyre(Detyra detyra) {
        this.detyrat.add(detyra);
    }

    public void ngarkoMaterial(String material) {
        this.materialet.add(material);
    }

    public void shikoDetyrat() {
        for (Detyra detyra : detyrat) {
            System.out.println("Detyra: " + detyra.getTitulli());
        }
    }
}