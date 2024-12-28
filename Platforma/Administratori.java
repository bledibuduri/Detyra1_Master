package Platforma;

import java.util.ArrayList;
import java.util.List;

// Klasa për administratorët
class Administratori extends Perdoruesi {
    private List<Perdoruesi> listaPerdoruesish;
    private List<Kursi> listaKurseve;

    public Administratori(String id, String emri, String email) {
        super(id, emri, email);
        this.listaPerdoruesish = new ArrayList<>();
        this.listaKurseve = new ArrayList<>();
    }

    public void shtoPerdorues(Perdoruesi perdorues) {
        listaPerdoruesish.add(perdorues);
        System.out.println("Përdoruesi " + perdorues.getEmri() + " u shtua.");
    }

    public void hiqPerdorues(Perdoruesi perdorues) {
        listaPerdoruesish.remove(perdorues);
        System.out.println("Përdoruesi " + perdorues.getEmri() + " u hoq.");
    }

    public void fshijKurs(Kursi kursi) {
        listaKurseve.remove(kursi);
        System.out.println("Kursi " + kursi.getTitulli() + " u fshi.");
    }
}