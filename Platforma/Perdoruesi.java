package Platforma;

import java.util.*;

// Klasa bazë për të gjithë përdoruesit
class Perdoruesi {
    private int id;
    private String emri;
    private String email;

    public Perdoruesi(String id2, String emri, String email) {
        this.id = id;
        this.emri = emri;
        this.email = email;
    }

    public int getId() {
        return id;
    }

    public String getEmri() {
        return emri;
    }

    public String getEmail() {
        return email;
    }

    public void shikoProfilin() {
        System.out.println("ID: " + id + ", Emri: " + emri + ", Email: " + email);
    }
}