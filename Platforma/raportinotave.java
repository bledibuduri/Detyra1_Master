package Platforma;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.*;
// Klasa për raportet e notave
class RaportiNotave {
    private Map<Studenti, Map<Detyra, Integer>> nota;

    public RaportiNotave() {
        this.nota = new HashMap<>();
    }

    public void shtoVleresim(Studenti studenti, Detyra detyre, int pike) {
        nota.computeIfAbsent(studenti, k -> new HashMap<>()).put(detyre, pike);
        System.out.println("Vlerësimi për detyrën '" + detyre.getTitulli() + "' u shtua për studentin " + studenti.getEmri() + ".");
    }
}