import Entity.Comanda;
import Entity.Tort;
import Persistence.IComanda;
import Persistence.ITort;

public class Server {
    private final ITort cakes;
    private final IComanda orders;

    public Server(ITort cakes, IComanda orders) {
        this.cakes = cakes;
        this.orders = orders;
    }

    public Iterable<Tort> findAllCakes() {
        return this.cakes.findAll();
    }

    public Iterable<Comanda> findAllOrders() {
        return this.orders.findAll();
    }

    public void addCakes(Tort cake) {
        cakes.save(cake);
    }

    public void addCakeToOrder(Comanda order, Tort cake) {
        order.addCake(cake);
    }

    public void addOrder(Comanda order) {
        orders.save(order);
    }
}


