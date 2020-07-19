package chainofresponsibility.homework.children;

import chainofresponsibility.homework.request.MotherRequest;

public class Antek extends Child {

    @Override
    public void processRequest(MotherRequest request) {
        if (request.getShelf().equals(Shelf.HIGH)) {
            System.out.println("Antek took the jar off the shelf");
        } else {
            System.err.println("Wrong shelf!");
        }
    }
}
