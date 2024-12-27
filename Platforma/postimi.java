package Platforma;
import java.util.ArrayList;
import java.util.List;
// Klasa Postimi
class Postimi {
    private String id;
    private Perdorues perdoruesi;
    private String permbajtja;

    public Postimi(String id, Perdorues perdoruesi, String permbajtja) {
        this.id = id;
        this.perdoruesi = perdoruesi;
        this.permbajtja = permbajtja;
    }

    public void editoPermbajtjen(String permbajtja) {
        this.permbajtja = permbajtja;
    }
}