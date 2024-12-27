import java.util.ArrayList;
import java.util.List;

// Klasa Administratori
class Administrator extends Perdorues {
    private List<Perdorues> perdoruesit;
    private List<Kursi> kurset;

    public Administrator(String id, String emri, String email) {
        super(id, emri, email);
        this.perdoruesit = new ArrayList<>();
        this.kurset = new ArrayList<>();
    }

    public void shtoPërdorues(Perdorues perdorues) {
        perdoruesit.add(perdorues);
    }

    public void fshijPërdorues(Perdorues perdorues) {
        perdoruesit.remove(perdorues);
    }

    public void shtoKurs(Kursi kurs) {
        kurset.add(kurs);
    }

    public void fshijKurs(Kursi kurs) {
        kurset.remove(kurs);
    }

    public void getPerdoruesit(Perdorues perdorues){
        
    }

    @Override
    public void shikoProfilin() {
        System.out.println("Profili i Administratorit: " + getEmri());
    }
}