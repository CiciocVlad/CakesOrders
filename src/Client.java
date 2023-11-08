import Entity.Comanda;
import Entity.Tort;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Client {
    private final Server server;
    private final Scanner scanner;

    public Client(Server server) {
        this.server = server;
        this.scanner = new Scanner(System.in);
    }

    private void addCake(String type) {
        server.addCakes(new Tort(type));
    }

    private void addOrder(List<Tort> torturi) {
        server.addOrder(new Comanda(torturi));
    }

    private void printAllCakes() {
        int i = 0;
        for (var cake : this.server.findAllCakes())
            System.out.println(++i + ". " + cake.getTip());
    }

    private void printAllOrders() {
        int i = 1;
        for (var order : this.server.findAllOrders()) {
            System.out.println("order " + i++ + ":");
            for (var cake : order.getTorturi())
                System.out.println("\t" + cake.getTip());
        }
    }

    private void menu() {
        System.out.println("1. add cake");
        System.out.println("2. print cakes");
        System.out.println("3. add order");
        System.out.println("4. print orders");
        System.out.println("5. exit");
    }

    public void play() {
        this.menu();
        boolean running = true;
        while (running) {
            System.out.print("your option: ");
            String option = scanner.nextLine();
            switch (option) {
                case "1" -> {
                    String type = scanner.nextLine();
                    addCake(type);
                }
                case "2" -> printAllCakes();
                case "3" -> {
                    List<Tort> torturi = new ArrayList<>();
                    this.printAllCakes();
                    List<Tort> cakes = (List<Tort>) server.findAllCakes();
                    int tort;
                    do {
                        tort = scanner.nextInt();
                        if (tort <= cakes.size() && tort > 0)
                            torturi.add(cakes.get(tort - 1));
                    } while (tort > 0);
                    scanner.nextLine();
                    this.addOrder(torturi);
                }
                case "4" -> printAllOrders();
                case "5" -> running = false;
            }
        }
    }
}
