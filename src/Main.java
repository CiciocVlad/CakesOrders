import Persistence.ComandaRepo;
import Persistence.TortRepo;

public class Main {
    public static void main(String[] args) {
        TortRepo tortRepo = new TortRepo();
        ComandaRepo comandaRepo = new ComandaRepo();
        Server server = new Server(tortRepo, comandaRepo);
        Client client = new Client(server);

        client.play();
    }
}