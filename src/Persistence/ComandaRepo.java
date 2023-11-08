package Persistence;

import Entity.Comanda;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class ComandaRepo implements IComanda {
    private final List<Comanda> orders = new ArrayList<>();

    @Override
    public Iterable<Comanda> findAll() {
        return this.orders;
    }

    @Override
    public Comanda findOne(Long id) {
        for (Comanda order : this.orders) {
            if (Objects.equals(order.getId(), id))
                return order;
        }
        return null;
    }

    @Override
    public void save(Comanda entity) {
        this.orders.add(entity);
    }
}
