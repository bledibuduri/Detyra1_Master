import java.util.ArrayList;
import java.util.List;

// Klasa e Përgjithshme Perdorues
abstract class Perdorues {
    private String id;
    private String emri;
    private String email;

    public Perdorues(String id, String emri, String email) {
        this.id = id;
        this.emri = emri;
        this.email = email;
    }

    public String getId() {
        return id;
    }

    public String getEmri() {
        return emri;
    }

    public String getEmail() {
        return email;
    }

    public abstract void shikoProfilin();
}

