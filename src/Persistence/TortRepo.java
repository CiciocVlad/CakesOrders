package Persistence;

import Entity.Tort;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class TortRepo implements ITort {
    private final List<Tort> cakes;

    public TortRepo() {
        this.cakes = new ArrayList<>();
    }

    @Override
    public Iterable<Tort> findAll() {
        return this.cakes;
    }

    @Override
    public Tort findOne(Long id) {
        for (Tort tort : this.cakes) {
            if (Objects.equals(tort.getId(), id))
                return tort;
        }
        return null;
    }

    @Override
    public void save(Tort entity) {
        this.cakes.add(entity);
    }
}
