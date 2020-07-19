package chainofresponsibility.homework;

import chainofresponsibility.homework.children.*;
import chainofresponsibility.homework.request.MotherRequest;

class Main {

    public static void main(String[] args) {

        MotherRequest request = new MotherRequest(Shelf.HIGH);

        Child ania = new Ania();
        Child tomek = new Tomek();
        Child antek = new Antek();

        ania.setTallerChild(tomek);
        tomek.setTallerChild(antek);

        // return: Antek took the jar off the shelf
        ania.processRequest(request);
    }
}
