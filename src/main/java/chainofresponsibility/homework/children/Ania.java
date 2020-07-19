package chainofresponsibility.homework.children;

import chainofresponsibility.homework.request.MotherRequest;

public class Ania extends Child {

    @Override
    public void processRequest(MotherRequest request) {
        if (request.getShelf().equals(Shelf.LOW)) {
            System.out.println("Ania took the jar off the shelf");
        } else {
            getTallerChild().processRequest(request);
        }
    }
}
