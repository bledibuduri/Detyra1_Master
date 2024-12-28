package Platforma;

// Klasa për detyrat
class Detyra {
    private int id;
    private String titulli;
    private int pikeTotal;

    public Detyra(int id, String titulli, int pikeTotal) {
        this.id = id;
        this.titulli = titulli;
        this.pikeTotal = pikeTotal;
    }

    public String getTitulli() {
        return titulli;
    }
}