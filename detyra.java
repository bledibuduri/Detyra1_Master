
// Klasa Detyra
class Detyra {
    private String id;
    private Kursi kursi;
    private String titulli;
    private String afati;
    private int pikatTotale;
    private boolean dorzuar;

    public Detyra(String id, Kursi kursi, String titulli, String afati, int pikatTotale) {
        this.id = id;
        this.kursi = kursi;
        this.titulli = titulli;
        this.afati = afati;
        this.pikatTotale = pikatTotale;
        this.dorzuar = false;
    }

    public String getTitulli() {
        return titulli;
    }

    public void shenoSiTeDorzuar() {
        this.dorzuar = true;
    }

    public boolean eshteDorzuar() {
        return dorzuar;
    }
}