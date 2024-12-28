package Platforma;

// Klasa kryesore
public class Main {
    public static void main(String[] args) {
        Administratori admin = new Administratori("1", "Admin", "admin@example.com");
        Instruktori instruktori = new Instruktori();
        Studenti studenti = new Studenti("3", "Jane Doe", "jane@example.com");

        //Kursi kursi = new Kursi("101", "Java Programming", instruktori);
        admin.shtoPerdorues(instruktori);
        admin.shtoPerdorues(studenti);

        //instruktori.krijoKurs(kursi);
        //studenti.regjistroKurs(kursi);

        Detyra detyre = new Detyra(201, "Lab 1", 100);

      //  instruktori.caktoDetyre(kursi, detyre);
        studenti.dorzoDetyre(detyre);
    }
}