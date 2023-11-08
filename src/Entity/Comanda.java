package Entity;

import java.util.ArrayList;
import java.util.List;

public class Comanda extends Entity<Long> {
    private List<Tort> torturi;

    public Comanda() {
        this.torturi = new ArrayList<>();
    }

    public Comanda(List<Tort> torturi) {
        this.torturi = torturi;
    }

    public Iterable<Tort> getTorturi() {
        return this.torturi;
    }

    public void addCake(Tort tort) {
        this.torturi.add(tort);
    }
}
