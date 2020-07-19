package chainofresponsibility.homework.children;

import chainofresponsibility.homework.request.MotherRequest;

public class Tomek extends Child {

    @Override
    public void processRequest(MotherRequest request) {
        if (request.getShelf().equals(Shelf.MEDIUM)) {
            System.out.println("Tomek took the jar off the shelf");
        } else {
            getTallerChild().processRequest(request);
        }
    }
}
