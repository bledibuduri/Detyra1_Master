package Platforma;
import java.util.ArrayList;
import java.util.List;

// Klasa Studenti
public class Studenti extends Perdoruesi {
    private List<Kursi> kursetRegjistruara;
    private List<Detyra> detyrat;

    public Studenti(String id, String emri, String email) {
        super(id, emri, email);
        this.kursetRegjistruara = new ArrayList<>();
        this.detyrat = new ArrayList<>();
    }

    public void regjistroKurs(Kursi kursi) {
        kursetRegjistruara.add(kursi);

    }
    public void setDetyrat(List<Detyra> detyrat) {
        this.detyrat = detyrat;
    }

    @Override
    public void shikoProfilin() {
        System.out.println("Profili i Studentit: " + getEmri());
        System.out.println("Kurset e regjistruara: " + kursetRegjistruara.size());
    }

    public void dorzoDetyre(Detyra detyre) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'dorzoDetyre'");
    }
}