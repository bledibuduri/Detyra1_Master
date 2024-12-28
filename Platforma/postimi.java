package Platforma;

// Klasa për postimet
class Postimi {
    private int id;
    private Perdoruesi autor;
    private String permbajtja;

    public Postimi(int id, Perdoruesi autor, String permbajtja) {
        this.id = id;
        this.autor = autor;
        this.permbajtja = permbajtja;
    }

    public void editoPermbajtjen(String permbajtja) {
        this.permbajtja = permbajtja;
        System.out.println("Përmbajtja u përditësua.");
    }
}
